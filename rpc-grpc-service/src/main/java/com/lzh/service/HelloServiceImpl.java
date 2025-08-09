package com.lzh.service;

import com.google.protobuf.ProtocolStringList;
import com.lzh.HelloProto;
import com.lzh.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

/**
 * @author zhehen.lu
 * @date 2025/8/9 15:01
 */
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void ctos(HelloProto.HelloRequest request, StreamObserver<HelloProto.HelloResponse> responseObserver) {
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
    public void hello(HelloProto.HelloRequest request, StreamObserver<HelloProto.HelloResponse> responseObserver) {
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
