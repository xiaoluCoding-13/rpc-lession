package com.lzh.client;

import com.lzh.HelloProto;
import com.lzh.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * @author zhehen.lu
 * @date 2025/8/9 15:41
 */
public class GrpcClient2 {

    /**
     * 多对象，List一元rpc
     * @param args
     * @date 2025/8/10 10:50
     * @author zhehen.lu
     */
    public static void main(String[] args) {
        //1. 创建通信的管道（生产环境用TLS）
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8888).usePlaintext().build();
        try {
            //2. 获得代理对象 创建阻塞存根stud（同步调用）
            HelloServiceGrpc.HelloServiceBlockingStub helloService = HelloServiceGrpc.newBlockingStub(channel);
            //3. 完成rpc调用
            //3.1 准备参数 构建请求消息
            HelloProto.HelloRequest1.Builder builder = HelloProto.HelloRequest1.newBuilder();
            builder.addName("lzh1");
            builder.addName("lzh2");
            builder.addName("lzh3");

            HelloProto.HelloRequest1 helloRequest = builder.build();
            //3.2 进行rpc调用，获取对应的返回
            HelloProto.HelloResponse1 helloResponse = helloService.hello1(helloRequest);
            //3.3 处理响应
            String result = helloResponse.getResult();
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //4. 关闭通道
            channel.shutdownNow();
        }
    }
}
