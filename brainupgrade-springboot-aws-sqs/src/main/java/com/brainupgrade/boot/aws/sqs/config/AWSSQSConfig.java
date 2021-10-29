package com.brainupgrade.boot.aws.sqs.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder;

@Configuration
public class AWSSQSConfig {

  @Value("${cloud.aws.credentials.access-key}")
  private String accessKey;
  @Value("${cloud.aws.credentials.secret-key}")
  private String secretAccessKey;
  
  @Bean
  @Primary
  public QueueMessagingTemplate queueMessagingTemplate(AmazonSQSAsync amazonSQSAsync) {
    return new QueueMessagingTemplate(amazonSQSAsync());
  }
  
  private AmazonSQSAsync amazonSQSAsync() {
    BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey,secretAccessKey);
    return AmazonSQSAsyncClientBuilder.
        standard().
        withRegion("us-east-1").
        withCredentials(new AWSStaticCredentialsProvider(credentials)).build();
  }
}
