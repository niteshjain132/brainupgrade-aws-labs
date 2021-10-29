package com.brainupgrade.boot.aws.sns.receiver;

import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AWSSQSReceiver {

  @SqsListener(value = "brainupgrade-sqs-queue", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
  public void receive(String message) {
    log.info("Message Received from SQS queue:{}", message);
  }
}
