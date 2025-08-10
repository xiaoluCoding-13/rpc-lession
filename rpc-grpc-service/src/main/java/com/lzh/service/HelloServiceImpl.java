package com.lzh.service;

import com.google.protobuf.ProtocolStringList;
import com.lzh.HelloProto;
import com.lzh.HelloProto.HelloRequest;
import com.lzh.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.time.LocalTime;

/**
 * @author zhehen.lu
 * @date 2025/8/9 15:01
 */
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    /**
     * Future一元Rpc
     * @param request
     * @param responseObserver
     * @date 2025/8/10 13:35
     * @author zhehen.lu
     */
    @Override
    public void hello2(HelloRequest request, StreamObserver<HelloProto.HelloResponse> responseObserver) {
        String name = request.getName();
        System.out.println("Future一元Rpc，客户端接收到：" + name);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        responseObserver.onNext(HelloProto.HelloResponse.newBuilder().setResult("Future一元Rpc，服务端返回响应").build());
        responseObserver.onCompleted();
    }

    /**
     * 双向流rpc
     *
     * @param responseObserver
     * @return {@link StreamObserver< HelloRequest>}
     * @date 2025/8/10 12:58
     * @author zhehen.lu
     */
    @Override
    public StreamObserver<HelloRequest> cstoss(StreamObserver<HelloProto.HelloResponse> responseObserver) {

        return new StreamObserver<HelloRequest>() {
            @Override
            public void onNext(HelloRequest helloRequest) {
                System.out.println("接收到双向流，客户端响应数据：" + LocalTime.now() + " " + helloRequest.getName());
                responseObserver.onNext(HelloProto.HelloResponse.newBuilder()
                        .setResult("双向流rpc，服务端返回响应:" + helloRequest.getName())
                        .build());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("双向流rpc，客户端响应发生异常！");
            }

            @Override
            public void onCompleted() {
                System.out.println("双向流rpc，客户端响应全部结束！");
                responseObserver.onCompleted();
            }
        };
    }

    /**
     * 客户端流式rpc
     *
     * @param responseObserver
     * @return {@link StreamObserver< HelloRequest>}
     * @date 2025/8/10 11:25
     * @author zhehen.lu
     */
    @Override
    public StreamObserver<HelloRequest> cstos(StreamObserver<HelloProto.HelloResponse> responseObserver) {
        return new StreamObserver<HelloRequest>() {
            //消息成功发生，客户端响应一个消息，就会被调用一次
            @Override
            public void onNext(HelloRequest helloRequest) {
                System.out.println("接收到客户端流式rpc响应数据：" + LocalTime.now() + " " + helloRequest.getName());
            }

            //消息异常发送
            @Override
            public void onError(Throwable throwable) {
                System.out.println("客户端流式响应发生异常！");
            }

            //所有消息发送结束
            @Override
            public void onCompleted() {
                System.out.println("客户端流式响应全部结束！");
                //服务器提供响应，响应目的：当接收全部客户端响应之后，处理完成，服务端响应
                HelloProto.HelloResponse.Builder builder = HelloProto.HelloResponse.newBuilder();
                builder.setResult("客户端流式rpc，服务端返回响应！");
                HelloProto.HelloResponse helloResponse = builder.build();
                responseObserver.onNext(helloResponse);
                responseObserver.onCompleted();
            }
        };
    }

    /**
     * 服务端流式Rpc
     *
     * @param request
     * @param responseObserver
     * @date 2025/8/10 11:25
     * @author zhehen.lu
     */
    @Override
    public void ctoss(HelloRequest request, StreamObserver<HelloProto.HelloResponse> responseObserver) {
        //1. 接收请求参数
        String name = request.getName();
        //2. 做业务处理
        System.out.println("ctos-name: " + name);
        //3. 根据业务处理结果，做不同的响应
        for (int i = 0; i < 5; i++) {
            HelloProto.HelloResponse.Builder builder = HelloProto.HelloResponse.newBuilder();
            builder.setResult("处理结果：" + i);

            HelloProto.HelloResponse response = builder.build();

            responseObserver.onNext(response);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        responseObserver.onCompleted();
    }

    /**
     * 一元Rpc 多参数
     *
     * @param request
     * @param responseObserver
     * @date 2025/8/9 17:54
     * @author zhehen.lu
     */
    @Override
    public void hello1(HelloProto.HelloRequest1 request, StreamObserver<HelloProto.HelloResponse1> responseObserver) {
        ProtocolStringList nameList = request.getNameList();
        nameList.forEach(name -> System.out.println("名称：" + name));

        System.out.println("HelloServiceImpl hello1 ");

        HelloProto.HelloResponse1.Builder builder = HelloProto.HelloResponse1.newBuilder();
        builder.setResult("hello1");

        HelloProto.HelloResponse1 response = builder.build();

        //通过这个方法 把响应的信息 返回给客户端(client)
        responseObserver.onNext(response);
        //通知客户端(client) 整个服务结束，底层会返回标记
        //client就会监听标记[grpc做的]
        responseObserver.onCompleted();
    }

    /**
     * 一元RPC
     * 1. 接收client提交的参数
     * 2. 业务处理 Service-dao 调用对应的业务功能
     * 3. 提供返回值
     *
     * @param request
     * @param responseObserver
     * @date 2025/8/9 15:11
     * @author zhehen.lu
     */
    @Override
    public void hello(HelloRequest request, StreamObserver<HelloProto.HelloResponse> responseObserver) {
        //1.接收客户端的请求参数
        String name = request.getName();

        //2.业务处理
        System.out.println("hello " + name);

        //3.封装返回值
        //3.1 创建对应对象的构造者
        HelloProto.HelloResponse.Builder builder = HelloProto.HelloResponse.newBuilder();
        //3.2 填充数据
        builder.setResult("hello method invoke ok ");
        //3.3 封装响应
        HelloProto.HelloResponse response = builder.build();

        responseObserver.onNext(response);
        //处理完成返回
        responseObserver.onCompleted();
    }
}
