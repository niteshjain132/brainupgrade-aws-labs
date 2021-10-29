package com.brainupgrade.boot.aws.sqs.receiver;

import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SQSMessageReceiver {

  @SqsListener(value = "brainupgrade-std-sqs-queue")
  public void receive(String message) {
    log.info("SQS Message Received: {}",message);
  }
}
