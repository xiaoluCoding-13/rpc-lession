

# RPC 教学项目

## 项目介绍

这是一个用于教学的 gRPC 项目，旨在帮助开发者了解和学习远程过程调用（RPC）的基本原理和实现方式。该项目展示了如何使用 gRPC 实现四种常见的通信模式：
- **一元调用**（Unary Call）
- **客户端流**（Client Streaming）
- **服务端流**（Server Streaming）
- **双向流**（Bidirectional Streaming）

## 项目结构

```
rpc-lession
├── LICENSE
├── README.en.md
├── README.md
├── pom.xml
├── rpc-grpc-api
│   ├── pom.xml
│   ├── src
│   │   └── main
│   │       ├── java
│   │       │   ├── com.lzh
│   │       │   │   ├── HelloProto.java
│   │       │   │   └── HelloServiceGrpc.java
│   │       │   └── proto
│   │       │       └── Hello.proto
├── rpc-grpc-client
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── com.lzh.client
│                   ├── GrpcClient1.java
│                   ├── GrpcClient2.java
│                   ├── GrpcClient3.java
│                   ├── GrpcClient4.java
│                   ├── GrpcClient5.java
│                   ├── GrpcClient6.java
│                   └── GrpcClient7.java
├── rpc-grpc-service
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               ├── GrpcServer1.java
│               └── com.lzh.service
│                   └── HelloServiceImpl.java
```

## 功能特性

- 包含多种 gRPC 调用示例（一元、客户端流、服务端流、双向流）。
- 服务端实现了所有定义的 gRPC 方法。
- 客户端提供多个独立的示例类，分别演示不同的调用方式。
- 支持快速搭建和运行，适合教学和学习使用。

## 使用说明

### 启动服务端

1. 运行 `rpc-grpc-service` 模块中的 `GrpcServer1.java` 类，启动 gRPC 服务端。
2. 服务启动后，将监听指定的端口，等待客户端请求。

### 运行客户端

1. 运行 `rpc-grpc-client` 模块中的任意客户端类（如 `GrpcClient1.java` 到 `GrpcClient7.java`），每个客户端类演示了不同的 gRPC 调用方式。
2. 客户端会连接到服务端并发送请求，随后输出服务端返回的响应。

## 依赖要求

- Java 8 或更高版本
- gRPC-Java 依赖（通过 Maven 自动管理）
- Maven 构建工具

## 许可证

本项目采用 MIT 许可证，请参阅 [LICENSE](LICENSE) 文件。