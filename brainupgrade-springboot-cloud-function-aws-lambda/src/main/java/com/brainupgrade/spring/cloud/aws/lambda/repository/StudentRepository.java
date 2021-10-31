package com.brainupgrade.spring.cloud.aws.lambda.repository;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.brainupgrade.spring.cloud.aws.lambda.entity.Student;

@Repository
public class StudentRepository {

  public List<Student> studentList(){
    return Arrays.asList(
        new Student(1,"Vaishanav",14),
        new Student(2,"Daksh",12),
        new Student(3, "Vishakha",42));
  }
}
