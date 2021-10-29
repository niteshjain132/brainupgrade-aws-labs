package com.brainupgrade.boot.aws.sqs.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SQSMessageSender {

  @Value("${cloud.aws.end-point.uri}")
  private String endPoint;
  
  @Autowired
  private QueueMessagingTemplate queueMessagingTemplate;
  
  @GetMapping("/send/{message}")
  public void send(@PathVariable(value="message")String message) {
    Message<String> payload = MessageBuilder
    .withPayload(message)
    .setHeader("sender", "Brainupgrade Academy")
    .build();
    queueMessagingTemplate.send(endPoint, payload);
  }
  
  @GetMapping("/send/{message}/{groupId}/{deDuplicationId}")
  public void send(@PathVariable(value="message")String message,
      @PathVariable(value="groupId")String groupId,
      @PathVariable(value="deDuplicationId")String deDuplicationId) {
    Message<String> payload = MessageBuilder
    .withPayload(message)
    .setHeader("message-group-id", groupId)
    .setHeader("message-deduplication-id", deDuplicationId)
    .build();
    queueMessagingTemplate.send(endPoint, payload);
  }
    
}
