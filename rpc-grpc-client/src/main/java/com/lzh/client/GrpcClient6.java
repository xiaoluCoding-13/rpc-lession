package com.lzh.client;

import com.lzh.HelloProto;
import com.lzh.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

/**
 * @author zhehen.lu
 * @date 2025/8/9 15:41
 */
public class GrpcClient6 {

    /**
     * 监听异步服务端流式rpc
     *
     * @param args
     * @date 2025/8/10 10:47
     * @author zhehen.lu
     */
    public static void main(String[] args) {
        //1. 创建通信的管道（生产环境用TLS）
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8888).usePlaintext().build();
        try {
            //2. 获得代理对象 创建阻塞存根stud（同步调用）
            HelloServiceGrpc.HelloServiceStub helloService = HelloServiceGrpc.newStub(channel);

            StreamObserver<HelloProto.HelloRequest> helloRequestStreamObserver = helloService.cstoss(new StreamObserver<HelloProto.HelloResponse>() {
                @Override
                public void onNext(HelloProto.HelloResponse helloResponse) {
                    System.out.println("双向流rpc，服务端响应内容返回：" + LocalTime.now() + " " + helloResponse.getResult());
                }

                @Override
                public void onError(Throwable throwable) {
                    System.out.println("双向流rpc，服务端响应发生异常！");
                }

                @Override
                public void onCompleted() {
                    System.out.println("双向流rpc，服务端响应全部结束！");
                }
            });

            for (int i = 0; i < 5; i++) {
                helloRequestStreamObserver.onNext(HelloProto.HelloRequest
                        .newBuilder()
                        .setName("双向流rpc，客户端发送消息: " + i)
                        .build());
            }
            helloRequestStreamObserver.onCompleted();

            channel.awaitTermination(6, TimeUnit.SECONDS);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //4. 关闭通道
            channel.shutdownNow();
        }
    }
}
