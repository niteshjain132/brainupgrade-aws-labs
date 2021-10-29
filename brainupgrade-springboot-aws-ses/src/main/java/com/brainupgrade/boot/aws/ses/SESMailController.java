package com.brainupgrade.boot.aws.ses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SESMailController {

  @Autowired
  private SESMailService sesMailService;
  
  @GetMapping("/sendMail")
  public String sendMailMessage(@RequestParam String fromEmail,
      @RequestParam String toEmail,
      @RequestParam String subject,
      @RequestParam String body) {
    
    SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
    simpleMailMessage.setFrom(fromEmail);
    simpleMailMessage.setTo(toEmail);
    simpleMailMessage.setSubject(subject);
    simpleMailMessage.setText(body);
    sesMailService.sendMail(simpleMailMessage);
    
    return "Mail sent Successfully.";
  }
}
