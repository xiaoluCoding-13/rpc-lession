package com.lzh;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "HelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest,
      com.lzh.HelloProto.HelloResponse> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello",
      requestType = com.lzh.HelloProto.HelloRequest.class,
      responseType = com.lzh.HelloProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest,
      com.lzh.HelloProto.HelloResponse> getHelloMethod() {
    io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest, com.lzh.HelloProto.HelloResponse> getHelloMethod;
    if ((getHelloMethod = HelloServiceGrpc.getHelloMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHelloMethod = HelloServiceGrpc.getHelloMethod) == null) {
          HelloServiceGrpc.getHelloMethod = getHelloMethod =
              io.grpc.MethodDescriptor.<com.lzh.HelloProto.HelloRequest, com.lzh.HelloProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lzh.HelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lzh.HelloProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("hello"))
              .build();
        }
      }
    }
    return getHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest1,
      com.lzh.HelloProto.HelloResponse1> getHello1Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello1",
      requestType = com.lzh.HelloProto.HelloRequest1.class,
      responseType = com.lzh.HelloProto.HelloResponse1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest1,
      com.lzh.HelloProto.HelloResponse1> getHello1Method() {
    io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest1, com.lzh.HelloProto.HelloResponse1> getHello1Method;
    if ((getHello1Method = HelloServiceGrpc.getHello1Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHello1Method = HelloServiceGrpc.getHello1Method) == null) {
          HelloServiceGrpc.getHello1Method = getHello1Method =
              io.grpc.MethodDescriptor.<com.lzh.HelloProto.HelloRequest1, com.lzh.HelloProto.HelloResponse1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello1"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lzh.HelloProto.HelloRequest1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lzh.HelloProto.HelloResponse1.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("hello1"))
              .build();
        }
      }
    }
    return getHello1Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest,
      com.lzh.HelloProto.HelloResponse> getHello2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello2",
      requestType = com.lzh.HelloProto.HelloRequest.class,
      responseType = com.lzh.HelloProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest,
      com.lzh.HelloProto.HelloResponse> getHello2Method() {
    io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest, com.lzh.HelloProto.HelloResponse> getHello2Method;
    if ((getHello2Method = HelloServiceGrpc.getHello2Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHello2Method = HelloServiceGrpc.getHello2Method) == null) {
          HelloServiceGrpc.getHello2Method = getHello2Method =
              io.grpc.MethodDescriptor.<com.lzh.HelloProto.HelloRequest, com.lzh.HelloProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lzh.HelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lzh.HelloProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("hello2"))
              .build();
        }
      }
    }
    return getHello2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest,
      com.lzh.HelloProto.HelloResponse> getCtossMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ctoss",
      requestType = com.lzh.HelloProto.HelloRequest.class,
      responseType = com.lzh.HelloProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest,
      com.lzh.HelloProto.HelloResponse> getCtossMethod() {
    io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest, com.lzh.HelloProto.HelloResponse> getCtossMethod;
    if ((getCtossMethod = HelloServiceGrpc.getCtossMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getCtossMethod = HelloServiceGrpc.getCtossMethod) == null) {
          HelloServiceGrpc.getCtossMethod = getCtossMethod =
              io.grpc.MethodDescriptor.<com.lzh.HelloProto.HelloRequest, com.lzh.HelloProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ctoss"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lzh.HelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lzh.HelloProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("ctoss"))
              .build();
        }
      }
    }
    return getCtossMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest,
      com.lzh.HelloProto.HelloResponse> getCstosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cstos",
      requestType = com.lzh.HelloProto.HelloRequest.class,
      responseType = com.lzh.HelloProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest,
      com.lzh.HelloProto.HelloResponse> getCstosMethod() {
    io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest, com.lzh.HelloProto.HelloResponse> getCstosMethod;
    if ((getCstosMethod = HelloServiceGrpc.getCstosMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getCstosMethod = HelloServiceGrpc.getCstosMethod) == null) {
          HelloServiceGrpc.getCstosMethod = getCstosMethod =
              io.grpc.MethodDescriptor.<com.lzh.HelloProto.HelloRequest, com.lzh.HelloProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cstos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lzh.HelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lzh.HelloProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("cstos"))
              .build();
        }
      }
    }
    return getCstosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest,
      com.lzh.HelloProto.HelloResponse> getCstossMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cstoss",
      requestType = com.lzh.HelloProto.HelloRequest.class,
      responseType = com.lzh.HelloProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest,
      com.lzh.HelloProto.HelloResponse> getCstossMethod() {
    io.grpc.MethodDescriptor<com.lzh.HelloProto.HelloRequest, com.lzh.HelloProto.HelloResponse> getCstossMethod;
    if ((getCstossMethod = HelloServiceGrpc.getCstossMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getCstossMethod = HelloServiceGrpc.getCstossMethod) == null) {
          HelloServiceGrpc.getCstossMethod = getCstossMethod =
              io.grpc.MethodDescriptor.<com.lzh.HelloProto.HelloRequest, com.lzh.HelloProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cstoss"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lzh.HelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.lzh.HelloProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("cstoss"))
              .build();
        }
      }
    }
    return getCstossMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub>() {
        @java.lang.Override
        public HelloServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceStub(channel, callOptions);
        }
      };
    return HelloServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static HelloServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingV2Stub>() {
        @java.lang.Override
        public HelloServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return HelloServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub>() {
        @java.lang.Override
        public HelloServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceBlockingStub(channel, callOptions);
        }
      };
    return HelloServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub>() {
        @java.lang.Override
        public HelloServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceFutureStub(channel, callOptions);
        }
      };
    return HelloServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void hello(com.lzh.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    /**
     */
    default void hello1(com.lzh.HelloProto.HelloRequest1 request,
        io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse1> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHello1Method(), responseObserver);
    }

    /**
     */
    default void hello2(com.lzh.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHello2Method(), responseObserver);
    }

    /**
     */
    default void ctoss(com.lzh.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCtossMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloRequest> cstos(
        io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCstosMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloRequest> cstoss(
        io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCstossMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HelloService.
   */
  public static abstract class HelloServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HelloServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HelloService.
   */
  public static final class HelloServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HelloServiceStub> {
    private HelloServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void hello(com.lzh.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hello1(com.lzh.HelloProto.HelloRequest1 request,
        io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse1> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHello1Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hello2(com.lzh.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHello2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ctoss(com.lzh.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getCtossMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloRequest> cstos(
        io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCstosMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloRequest> cstoss(
        io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getCstossMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HelloService.
   */
  public static final class HelloServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<HelloServiceBlockingV2Stub> {
    private HelloServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.lzh.HelloProto.HelloResponse hello(com.lzh.HelloProto.HelloRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lzh.HelloProto.HelloResponse1 hello1(com.lzh.HelloProto.HelloRequest1 request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getHello1Method(), getCallOptions(), request);
    }

    /**
     */
    public com.lzh.HelloProto.HelloResponse hello2(com.lzh.HelloProto.HelloRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getHello2Method(), getCallOptions(), request);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, com.lzh.HelloProto.HelloResponse>
        ctoss(com.lzh.HelloProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getCtossMethod(), getCallOptions(), request);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<com.lzh.HelloProto.HelloRequest, com.lzh.HelloProto.HelloResponse>
        cstos() {
      return io.grpc.stub.ClientCalls.blockingClientStreamingCall(
          getChannel(), getCstosMethod(), getCallOptions());
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<com.lzh.HelloProto.HelloRequest, com.lzh.HelloProto.HelloResponse>
        cstoss() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getCstossMethod(), getCallOptions());
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service HelloService.
   */
  public static final class HelloServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.lzh.HelloProto.HelloResponse hello(com.lzh.HelloProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.lzh.HelloProto.HelloResponse1 hello1(com.lzh.HelloProto.HelloRequest1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHello1Method(), getCallOptions(), request);
    }

    /**
     */
    public com.lzh.HelloProto.HelloResponse hello2(com.lzh.HelloProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHello2Method(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.lzh.HelloProto.HelloResponse> ctoss(
        com.lzh.HelloProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getCtossMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HelloService.
   */
  public static final class HelloServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lzh.HelloProto.HelloResponse> hello(
        com.lzh.HelloProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lzh.HelloProto.HelloResponse1> hello1(
        com.lzh.HelloProto.HelloRequest1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHello1Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.lzh.HelloProto.HelloResponse> hello2(
        com.lzh.HelloProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHello2Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;
  private static final int METHODID_HELLO1 = 1;
  private static final int METHODID_HELLO2 = 2;
  private static final int METHODID_CTOSS = 3;
  private static final int METHODID_CSTOS = 4;
  private static final int METHODID_CSTOSS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((com.lzh.HelloProto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse>) responseObserver);
          break;
        case METHODID_HELLO1:
          serviceImpl.hello1((com.lzh.HelloProto.HelloRequest1) request,
              (io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse1>) responseObserver);
          break;
        case METHODID_HELLO2:
          serviceImpl.hello2((com.lzh.HelloProto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse>) responseObserver);
          break;
        case METHODID_CTOSS:
          serviceImpl.ctoss((com.lzh.HelloProto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CSTOS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cstos(
              (io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse>) responseObserver);
        case METHODID_CSTOSS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cstoss(
              (io.grpc.stub.StreamObserver<com.lzh.HelloProto.HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lzh.HelloProto.HelloRequest,
              com.lzh.HelloProto.HelloResponse>(
                service, METHODID_HELLO)))
        .addMethod(
          getHello1Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lzh.HelloProto.HelloRequest1,
              com.lzh.HelloProto.HelloResponse1>(
                service, METHODID_HELLO1)))
        .addMethod(
          getHello2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.lzh.HelloProto.HelloRequest,
              com.lzh.HelloProto.HelloResponse>(
                service, METHODID_HELLO2)))
        .addMethod(
          getCtossMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.lzh.HelloProto.HelloRequest,
              com.lzh.HelloProto.HelloResponse>(
                service, METHODID_CTOSS)))
        .addMethod(
          getCstosMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.lzh.HelloProto.HelloRequest,
              com.lzh.HelloProto.HelloResponse>(
                service, METHODID_CSTOS)))
        .addMethod(
          getCstossMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.lzh.HelloProto.HelloRequest,
              com.lzh.HelloProto.HelloResponse>(
                service, METHODID_CSTOSS)))
        .build();
  }

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.lzh.HelloProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HelloServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .addMethod(getHello1Method())
              .addMethod(getHello2Method())
              .addMethod(getCtossMethod())
              .addMethod(getCstosMethod())
              .addMethod(getCstossMethod())
              .build();
        }
      }
    }
    return result;
  }
}
