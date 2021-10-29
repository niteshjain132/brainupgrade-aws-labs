package com.brainupgrade.boot.aws.sns.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;

@Configuration
public class SNSConfig {

  @Value("${cloud.aws.credentials.access-key}")
  private String accessKey;
  @Value("${cloud.aws.credentials.secret-key}")
  private String secretAccessKey;

  @Bean
  @Primary
  public AmazonSNSClient amazonSNSClient() {
    BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey,secretAccessKey);
    return (AmazonSNSClient) AmazonSNSClientBuilder.
        standard().
        withRegion("us-east-1").
        withCredentials(new AWSStaticCredentialsProvider(credentials)).build();
  }
}
