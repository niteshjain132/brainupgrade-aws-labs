package com.brainupgrade.aws.sdk.springbootawsjavasdk;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.Bucket;
import software.amazon.awssdk.services.s3.model.ListBucketsResponse;

@SpringBootApplication
public class SpringBootAwsJavaSdkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsJavaSdkApplication.class, args);
		//Creat AWS S3 client
		S3Client s3Client = S3Client.builder().build();
		ListBucketsResponse listBucketsResponse = s3Client.listBuckets();
		List<Bucket> buckets = listBucketsResponse.buckets();
		buckets.stream().forEach(bucket ->{
		  System.out.println("Bucket Name: "+bucket.name()
		      +"Bucket Creation Date: "+ bucket.creationDate());
		});
	}

}
