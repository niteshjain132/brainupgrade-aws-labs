package com.brainupgrade.boot.aws.sns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.SubscribeRequest;

@RestController
public class AWSSNSController {

  private final static String SNS_TOPIC_ARN = "arn:aws:sns:us-east-1:172181359664:brainupgrade-sns-topic";
  private final static String SQS_QUEUE_ARN = "arn:aws:sqs:us-east-1:172181359664:brainupgrade-sqs-queue";
  @Autowired
  private AmazonSNSClient amazonSNSClient;

  @GetMapping("/subscribe/sqs")
  public String subscirberToAWSSQS() {

    SubscribeRequest subscribeRequest = new SubscribeRequest(SNS_TOPIC_ARN, "sqs", SQS_QUEUE_ARN);
    amazonSNSClient.subscribe(subscribeRequest);
    return "SQS Subscription successfull";
  }
  @GetMapping("/send/{message}")
  public String publishMessage(@PathVariable(value = "message")String message) {
    PublishRequest publishRequest = new PublishRequest(SNS_TOPIC_ARN, message, "EMAIL Demo message");
    amazonSNSClient.publish(publishRequest);
    return "SNS sent Message successfully";
  }
  
  @GetMapping("/subscribe/{email}")
  public String subscirberToAWSSQS(@PathVariable(value="email")String email) {

    SubscribeRequest subscribeRequest = new SubscribeRequest(SNS_TOPIC_ARN, "email", email);
    amazonSNSClient.subscribe(subscribeRequest);
    return "EMAIL Subscription is Successfull";
  }  
  
}
