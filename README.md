# RPC 教学项目文档

## 项目介绍
这是一个基于 gRPC 的远程过程调用(RPC)教学项目，演示了如何构建一个完整的 RPC 通信系统。项目包含接口定义、服务端实现和客户端调用三个主要部分。

## 项目结构
```
rpc-lession/
├── rpc-grpc-api/        # 接口定义模块
│   ├── HelloProto.java  # 数据传输对象定义
│   └── HelloServiceGrpc.java  # 服务接口定义
├── rpc-grpc-service/    # 服务端模块
│   └── GrpcServer1.java # 服务启动类
│   └── HelloServiceImpl.java # 服务实现类
└── rpc-grpc-client/     # 客户端模块
    ├── GrpcClient1.java # 客户端调用示例1
    └── GrpcClient2.java # 客户端调用示例2
```

## 功能特性
- 支持两种 RPC 方法调用：
  - `hello`: 单个字符串参数的简单问候方法
  - `hello1`: 支持多个字符串参数的扩展问候方法
- 提供完整的请求/响应数据模型定义
- 包含同步和异步调用方式的实现

## 使用说明

### 启动服务端
```bash
cd rpc-grpc-service
mvn exec:java -Dexec.mainClass="com.lzh.GrpcServer1"
```

### 运行客户端
```bash
cd rpc-grpc-client
mvn exec:java -Dexec.mainClass="com.lzh.client.GrpcClient1"
```

或运行第二个客户端示例:
```bash
mvn exec:java -Dexec.mainClass="com.lzh.client.GrpcClient2"
```

## 依赖要求
- Java 8 或更高版本
- Maven 3.x
- gRPC Java 库
- Protocol Buffers 编译器

## 许可证
本项目采用 Apache-2.0 许可证，详情请查看 LICENSE 文件。