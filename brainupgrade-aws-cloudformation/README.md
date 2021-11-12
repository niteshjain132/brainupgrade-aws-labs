# AWS CloudFormation 

  * We’re going to create a simple EC2 instance using "aws-ec2.yaml" cloud formation template.
  * Go to AWS Console -> CloudFormation and click on creat Stack.
  * Give CloudFormation stack name and Upload above template to S3 Bucket.
  * Leave all the options selected as defult and Review your changes and finish you changes.
  * Watch out Cloud formation activities by cliking on stack, you will see various tabs.
  * We may want to see event tab where we can see step by step activity during Cloudformation template Execution.
  * Once Execution complete , go to Ec2 console and check Ec2 instance is in running state.
  * Next we will update the exsiting CloudFormation stack by adding below resources into cloudformation template
	  * Add an Elastic IP.
	  * Add two security groups.
  * Go to AWS Console -> CloudFormation and update existing Stack.
  * Notice that you can't edit CF stack name and Upload new Template "aws-ec2-sg-eip-cf.yaml" file to S3 Bucket.
  * Leave all the attributes as defult and Review your changes and finish you changes.
  * Watch out Cloud formation activities by cliking on stack , you will see various tabs, we may want to see event tab where we can see step by step activity during Cloudformation template Execution.
  * Once Execution complete , go to Ec2 console and check Old Ec2 instance terminated and new Ec2 instance is in running state.

### Cleanup: 
  * Delete CF stack will delete all the resources defined in that CF template.
