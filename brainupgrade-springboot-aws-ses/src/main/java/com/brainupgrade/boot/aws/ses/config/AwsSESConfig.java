package com.brainupgrade.boot.aws.ses.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.MailSender;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import io.awspring.cloud.mail.simplemail.SimpleEmailServiceMailSender;

@Configuration
public class AwsSESConfig {

  @Value("${cloud.aws.credentials.access-key}")
  private String accessKey;
  @Value("${cloud.aws.credentials.secret-key}")
  private String secretAccessKey;
  
  @Value("${cloud.aws.region.static}")
  private String awsRegion;
 
  @SuppressWarnings("deprecation")
  @Bean
  public MailSender mailSender(AmazonSimpleEmailService amazonSimpleEmailService) {
    return new SimpleEmailServiceMailSender(amazonSimpleEmailService);
  }
  
  @Bean
  public AmazonSimpleEmailService amazonSimpleEmailService() {
    BasicAWSCredentials basicAWSCredentials = new BasicAWSCredentials(accessKey, secretAccessKey);
    return AmazonSimpleEmailServiceClientBuilder
          .standard()
          .withRegion(awsRegion)
          .withCredentials(new AWSStaticCredentialsProvider(basicAWSCredentials))
          .build();
  }
  
}
