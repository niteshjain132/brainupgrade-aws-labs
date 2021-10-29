package com.brainupgrade.aws.serverless.lambda.handler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import com.amazonaws.serverless.exceptions.ContainerInitializationException;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
import com.amazonaws.serverless.proxy.spring.SpringBootLambdaContainerHandler;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.brainupgrade.aws.serverless.lambda.BrainupgradeAwsSpringbootLambdaApplication;

public class AWSLambdaHandler implements RequestStreamHandler {
  private static SpringBootLambdaContainerHandler<AwsProxyRequest, AwsProxyResponse> handler;

  static {
    try {
      handler = SpringBootLambdaContainerHandler
          .getAwsProxyHandler(BrainupgradeAwsSpringbootLambdaApplication.class);
      handler.activateSpringProfiles("lambda");
    } catch (ContainerInitializationException e) {
      // Re-throw the exception to force another cold start
      e.printStackTrace();
      throw new RuntimeException("Could not initialize Spring Boot application", e);
    }
  }

  @Override
  public void handleRequest(InputStream input, OutputStream output, Context context)
      throws IOException {
    handler.proxyStream(input, output, context);
    // just in case it wasn't closed by the mapper
    output.close();
  }

}