package io.grpc.examples.helloworld;

import java.util.concurrent.CompletableFuture;

import akka.stream.javadsl.Source;

public class GreeterServiceImpl implements GreeterService {
  @Override
  public CompletableFuture<io.grpc.examples.HelloReply> sayHello(io.grpc.examples.HelloRequest in) {
    throw new UnsupportedOperationException();
  }

  @Override
  public CompletableFuture<io.grpc.examples.HelloReply> itKeepsTalking(Source<io.grpc.examples.HelloRequest, Object> in) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Source<io.grpc.examples.HelloReply, Object> streamHellos(Source<io.grpc.examples.HelloRequest, Object> in) {
    throw new UnsupportedOperationException();
  }
}