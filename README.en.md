# RPC Tutorial Project Documentation

## Project Introduction
This is a tutorial project based on gRPC (Remote Procedure Call), demonstrating how to build a complete RPC communication system. The project contains three main components: interface definition, server-side implementation, and client-side invocation.

## Project Structure
```
rpc-lession/
├── rpc-grpc-api/        # Interface definition module
│   ├── HelloProto.java  # Data transfer object definition
│   └── HelloServiceGrpc.java  # Service interface definition
├── rpc-grpc-service/    # Server-side module
│   └── GrpcServer1.java # Service startup class
│   └── HelloServiceImpl.java # Service implementation class
└── rpc-grpc-client/     # Client-side module
    ├── GrpcClient1.java # Client invocation example 1
    └── GrpcClient2.java # Client invocation example 2
```

## Functional Features
- Supports two RPC method calls:
  - `hello`: A simple greeting method with a single string parameter
  - `hello1`: An extended greeting method supporting multiple string parameters
- Provides complete request/response data model definitions
- Includes implementations for both synchronous and asynchronous invocation methods

## Usage Instructions

### Starting the Server
```bash
cd rpc-grpc-service
mvn exec:java -Dexec.mainClass="com.lzh.GrpcServer1"
```

### Running the Client
```bash
cd rpc-grpc-client
mvn exec:java -Dexec.mainClass="com.lzh.client.GrpcClient1"
```

Or run the second client example:
```bash
mvn exec:java -Dexec.mainClass="com.lzh.client.GrpcClient2"
```

## Dependency Requirements
- Java 8 or higher
- Maven 3.x
- gRPC Java library
- Protocol Buffers compiler

## License
This project uses the Apache-2.0 license. For details, please see the LICENSE file.