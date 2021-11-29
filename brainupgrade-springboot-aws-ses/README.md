# AWS SES with Spring boot application:
  * Go to AWS SES console, create email identity. 
  * You need to verify email address by clicking on verification link which received in email. we at least need 2 email addresses verification.
  * Create spring boot project with Spring Initializer with web, lombok dependencies along aws serverless dependency in pom.xml file. 
```
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-mail</artifactId>
		</dependency>		
	    <dependency>
	      <groupId>io.awspring.cloud</groupId>
	      <artifactId>spring-cloud-starter-aws-ses</artifactId>
	    </dependency>
```

  * Create SES Email Configuration class with AWS access keys, Mail Service and controller.
  * Once you build and start your application, you can test your API from postman and check your email whether you received email or not.
