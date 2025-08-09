package com.lzh;

import com.lzh.service.HelloServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * @author zhehen.lu
 * @date 2025/8/9 15:19
 */
public class GrpcServer1 {

    public static void main(String[] args) throws IOException, InterruptedException {
        //1. 绑定端口
        ServerBuilder builder = ServerBuilder.forPort(8888);
        //2. 发布服务
        builder.addService(new HelloServiceImpl());
        //3. 创建服务对象
        Server server = builder.build();
        //4. 启动服务
        server.start();
        //5. 阻塞服务，等待客户端提交的请求
        server.awaitTermination();
    }

}
