package com.lzh.boot.client.controller;

import com.lzh.HelloProto;
import com.lzh.HelloServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhehen.lu
 * @date 2025/8/10 15:40
 */
@RestController
public class TestController {

    @GrpcClient("GLOBAL")
    private HelloServiceGrpc.HelloServiceBlockingStub helloServiceBlockingStub;

    @GetMapping("/test")
    public String test(@RequestParam String name) {
        System.out.println(name);

        return helloServiceBlockingStub.hello(
                HelloProto.HelloRequest.newBuilder().setName(name).build()
        ).getResult();
    }

}
