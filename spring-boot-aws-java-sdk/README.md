# AWS SDK for Java:
* Provides a Java API for AWS services.
* Build Java Based applications with Amazon Web services such as S3, DynamoDB,EC2, IAM etc.
* Provides support for API lifecycle consideration such as credential management, retries, data marshaling, and serialization.

## Pre-requisite: 
  * Java 1.8 + and Apache maven
### Create AWS Root Account
  * If haven't created an aws account , you can create one by following detailed instruction on this [aws account creation and activation page](https://aws.amazon.com/premiumsupport/knowledge-center/create-and-activate-aws-account/).

### AWS Command Line Interface (CLI)
 * Install [AWS CLI](https://aws.amazon.com/cli/) in your laptop
 * Used later for demonstrating invocation of prediction 
 * service from outside of AWS
 * Configure CLI with myadmin
   ```
   aws configure --profile myadmin
   ```
 * Verify Access – List S3 Buckets in your account
   ```
   aws s3 ls --profile myadmin
   ```
### Create IAM User
### Configure Users’ credentials.
### Create Spring Boot project with Initializer.
### Setup AWS SDK with maven.
### Connect AWS service S3 with Java
