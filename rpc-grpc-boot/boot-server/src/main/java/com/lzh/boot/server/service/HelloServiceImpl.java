package com.lzh.boot.server.service;

import com.lzh.HelloProto;
import com.lzh.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @author zhehen.lu
 * @date 2025/8/10 14:46
 */
@GrpcService
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {
    @Override
    public void hello(HelloProto.HelloRequest request, StreamObserver<HelloProto.HelloResponse> responseObserver) {
        String name = request.getName();
        System.out.println("客户端请求：" + name);

        responseObserver.onNext(HelloProto.HelloResponse.newBuilder().setResult("服务端返回响应！").build());
        responseObserver.onCompleted();
    }
}
