package com.lzh.client;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.lzh.HelloProto;
import com.lzh.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author zhehen.lu
 * @date 2025/8/9 15:41
 */
public class GrpcClient7 {

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
            HelloServiceGrpc.HelloServiceFutureStub helloService = HelloServiceGrpc.newFutureStub(channel);

            ListenableFuture<HelloProto.HelloResponse> helloResponseListenableFuture = helloService.hello2(HelloProto.HelloRequest.newBuilder()
                    .setName("lzh")
                    .build());

            //同步阻塞操作，拿到响应
//            HelloProto.HelloResponse helloResponse = helloResponseListenableFuture.get();
//            System.out.println(helloResponse.getResult());

            //并不能知道响应结果什么时候回来
//            helloResponseListenableFuture.addListener(()->
//                    System.out.println("Future一元Rpc，异步返回响应"),
//                    Executors.newCachedThreadPool()
//            );

            //可以拿到异步响应的结果
            Futures.addCallback(helloResponseListenableFuture, new FutureCallback<HelloProto.HelloResponse>() {
                //成功回调
                @Override
                public void onSuccess(HelloProto.HelloResponse result) {
                    System.out.println("拿到异步响应结果:" + result.getResult());
                }

                //失败回调
                @Override
                public void onFailure(Throwable t) {

                }
            }, Executors.newCachedThreadPool());


            System.out.println("后续的操作！");

            channel.awaitTermination(5, TimeUnit.SECONDS);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //4. 关闭通道
            channel.shutdownNow();
        }
    }
}
