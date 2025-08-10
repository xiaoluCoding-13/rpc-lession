package com.lzh.client;

import com.lzh.HelloProto;
import com.lzh.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/**
 * @author zhehen.lu
 * @date 2025/8/9 15:41
 */
public class GrpcClient4 {

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
            //3. 完成rpc调用
            //3.1 准备参数 构建请求消息
            HelloProto.HelloRequest.Builder builder = HelloProto.HelloRequest.newBuilder();
            builder.setName("lzh");

            HelloProto.HelloRequest helloRequest = builder.build();

            //3.2 进行rpc调用，获取对应的返回，采用匿名内部类处理 很类似于观察者模式
            //3.3 处理响应
            //3.4 需要主要，如果客户端很快响应，导致通道已经关闭，可能会发生异常
            helloService.ctoss(helloRequest, new StreamObserver<HelloProto.HelloResponse>() {
                //消息成功发生，服务端响应一个消息，就会被调用一次
                @Override
                public void onNext(HelloProto.HelloResponse helloResponse) {
                    System.out.println("服务端当前流式返回：" + LocalTime.now() + " " + helloResponse.getResult());
                }

                //消息异常发送
                @Override
                public void onError(Throwable throwable) {
                    System.out.println("服务端流式返回发生异常！");
                }

                //所有消息发送结束
                @Override
                public void onCompleted() {
                    System.out.println("服务端流式返回全部结束！");
                }
            });
            channel.awaitTermination(6, TimeUnit.SECONDS);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //4. 关闭通道
            channel.shutdownNow();
        }
    }
}
