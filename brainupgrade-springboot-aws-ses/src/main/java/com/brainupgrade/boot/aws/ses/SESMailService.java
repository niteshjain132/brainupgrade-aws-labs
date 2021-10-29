package com.brainupgrade.boot.aws.ses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class SESMailService {

  @Autowired
  private MailSender mailSender;
  
  public void sendMail(SimpleMailMessage simpleMailMessage) {
    mailSender.send(simpleMailMessage);
  }
}
