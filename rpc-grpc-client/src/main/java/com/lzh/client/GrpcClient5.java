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
public class GrpcClient5 {

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

            //3. 处理响应数据
            StreamObserver<HelloProto.HelloRequest> helloRequestStreamObserver = helloService.cstos(new StreamObserver<HelloProto.HelloResponse>() {
                //消息成功发生，服务端响应一个消息，就会被调用一次
                @Override
                public void onNext(HelloProto.HelloResponse helloResponse) {
                    System.out.println("客户端流式rpc，服务端响应内容返回：" + LocalTime.now() + " " + helloResponse.getResult());
                }

                //消息异常发送
                @Override
                public void onError(Throwable throwable) {
                    System.out.println("客户端流式rpc，服务端响应发生异常！");
                }

                //所有消息发送结束
                @Override
                public void onCompleted() {
                    System.out.println("客户端流式rpc，服务端响应全部结束！");
                }
            });

            //4. 客户端发送数据导服务端，多条数据，不定时
            for (int i = 0; i < 5; i++) {
                HelloProto.HelloRequest.Builder builder = HelloProto.HelloRequest.newBuilder();
                builder.setName("客户端流式rpc，客户端发送数据：" + i);

                HelloProto.HelloRequest build = builder.build();
                helloRequestStreamObserver.onNext(build);

                Thread.sleep(1000);
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
