package com.example.MicroservicemultiConnectors.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: PersonService.proto")
public final class PersonServiceGrpc {

  private PersonServiceGrpc() {}

  public static final String SERVICE_NAME = "PersonService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsRequest,
      com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsResponse> getGetAllPersonsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllPersons",
      requestType = com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsRequest.class,
      responseType = com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsRequest,
      com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsResponse> getGetAllPersonsMethod() {
    io.grpc.MethodDescriptor<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsRequest, com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsResponse> getGetAllPersonsMethod;
    if ((getGetAllPersonsMethod = PersonServiceGrpc.getGetAllPersonsMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getGetAllPersonsMethod = PersonServiceGrpc.getGetAllPersonsMethod) == null) {
          PersonServiceGrpc.getGetAllPersonsMethod = getGetAllPersonsMethod = 
              io.grpc.MethodDescriptor.<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsRequest, com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PersonService", "getAllPersons"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("getAllPersons"))
                  .build();
          }
        }
     }
     return getGetAllPersonsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdRequest,
      com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdResponse> getGetPersonByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPersonById",
      requestType = com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdRequest.class,
      responseType = com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdRequest,
      com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdResponse> getGetPersonByIdMethod() {
    io.grpc.MethodDescriptor<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdRequest, com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdResponse> getGetPersonByIdMethod;
    if ((getGetPersonByIdMethod = PersonServiceGrpc.getGetPersonByIdMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getGetPersonByIdMethod = PersonServiceGrpc.getGetPersonByIdMethod) == null) {
          PersonServiceGrpc.getGetPersonByIdMethod = getGetPersonByIdMethod = 
              io.grpc.MethodDescriptor.<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdRequest, com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PersonService", "getPersonById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("getPersonById"))
                  .build();
          }
        }
     }
     return getGetPersonByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonRequest,
      com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonResponse> getSavePersonXMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "savePersonX",
      requestType = com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonRequest.class,
      responseType = com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonRequest,
      com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonResponse> getSavePersonXMethod() {
    io.grpc.MethodDescriptor<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonRequest, com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonResponse> getSavePersonXMethod;
    if ((getSavePersonXMethod = PersonServiceGrpc.getSavePersonXMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getSavePersonXMethod = PersonServiceGrpc.getSavePersonXMethod) == null) {
          PersonServiceGrpc.getSavePersonXMethod = getSavePersonXMethod = 
              io.grpc.MethodDescriptor.<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonRequest, com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PersonService", "savePersonX"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("savePersonX"))
                  .build();
          }
        }
     }
     return getSavePersonXMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonServiceStub newStub(io.grpc.Channel channel) {
    return new PersonServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PersonServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary model (seul request -- seul reponse
     * </pre>
     */
    public void getAllPersons(com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsRequest request,
        io.grpc.stub.StreamObserver<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllPersonsMethod(), responseObserver);
    }

    /**
     */
    public void getPersonById(com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPersonByIdMethod(), responseObserver);
    }

    /**
     */
    public void savePersonX(com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonRequest request,
        io.grpc.stub.StreamObserver<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSavePersonXMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllPersonsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsRequest,
                com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsResponse>(
                  this, METHODID_GET_ALL_PERSONS)))
          .addMethod(
            getGetPersonByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdRequest,
                com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdResponse>(
                  this, METHODID_GET_PERSON_BY_ID)))
          .addMethod(
            getSavePersonXMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonRequest,
                com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonResponse>(
                  this, METHODID_SAVE_PERSON_X)))
          .build();
    }
  }

  /**
   */
  public static final class PersonServiceStub extends io.grpc.stub.AbstractStub<PersonServiceStub> {
    private PersonServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary model (seul request -- seul reponse
     * </pre>
     */
    public void getAllPersons(com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsRequest request,
        io.grpc.stub.StreamObserver<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllPersonsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPersonById(com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPersonByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void savePersonX(com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonRequest request,
        io.grpc.stub.StreamObserver<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSavePersonXMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersonServiceBlockingStub extends io.grpc.stub.AbstractStub<PersonServiceBlockingStub> {
    private PersonServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary model (seul request -- seul reponse
     * </pre>
     */
    public com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsResponse getAllPersons(com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllPersonsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdResponse getPersonById(com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPersonByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonResponse savePersonX(com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonRequest request) {
      return blockingUnaryCall(
          getChannel(), getSavePersonXMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonServiceFutureStub extends io.grpc.stub.AbstractStub<PersonServiceFutureStub> {
    private PersonServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary model (seul request -- seul reponse
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsResponse> getAllPersons(
        com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllPersonsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdResponse> getPersonById(
        com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPersonByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonResponse> savePersonX(
        com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSavePersonXMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_PERSONS = 0;
  private static final int METHODID_GET_PERSON_BY_ID = 1;
  private static final int METHODID_SAVE_PERSON_X = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_PERSONS:
          serviceImpl.getAllPersons((com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GetAllPersonsResponse>) responseObserver);
          break;
        case METHODID_GET_PERSON_BY_ID:
          serviceImpl.getPersonById((com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.GePersonByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_PERSON_X:
          serviceImpl.savePersonX((com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonRequest) request,
              (io.grpc.stub.StreamObserver<com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.SavePersonResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.MicroservicemultiConnectors.stub.PersonServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PersonService");
    }
  }

  private static final class PersonServiceFileDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier {
    PersonServiceFileDescriptorSupplier() {}
  }

  private static final class PersonServiceMethodDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PersonServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonServiceFileDescriptorSupplier())
              .addMethod(getGetAllPersonsMethod())
              .addMethod(getGetPersonByIdMethod())
              .addMethod(getSavePersonXMethod())
              .build();
        }
      }
    }
    return result;
  }
}
