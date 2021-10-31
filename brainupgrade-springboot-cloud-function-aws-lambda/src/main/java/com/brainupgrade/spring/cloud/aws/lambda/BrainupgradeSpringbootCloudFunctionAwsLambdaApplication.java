package com.brainupgrade.spring.cloud.aws.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.brainupgrade.spring.cloud.aws.lambda.entity.Student;
import com.brainupgrade.spring.cloud.aws.lambda.repository.StudentRepository;

@SpringBootApplication
public class BrainupgradeSpringbootCloudFunctionAwsLambdaApplication {

  @Autowired
  StudentRepository studentRepository;

  @Bean
  public Supplier<List<Student>> students() {
    return () -> studentRepository.studentList();
  }

  @Bean
  public Function<String, List<Student>> findByName() {
    return (input) -> studentRepository.studentList().stream()
        .filter(student -> student.getName().equals(input)).collect(Collectors.toList());
  }

  @Bean
  public MyConsumer myConsumerBean() {
    return new MyConsumer();
  }
  
  public static void main(String[] args) {
    SpringApplication.run(BrainupgradeSpringbootCloudFunctionAwsLambdaApplication.class, args);
  }
}
