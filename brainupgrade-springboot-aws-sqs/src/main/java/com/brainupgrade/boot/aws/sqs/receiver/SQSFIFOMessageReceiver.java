package com.brainupgrade.boot.aws.sqs.receiver;

import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SQSFIFOMessageReceiver {

  @SqsListener(value = "brainupgrade-sqs-queue.fifo",
      deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
  public void receive(String message) {
    log.info("SQS FIFO Message Received: {}",message);
  }
}
