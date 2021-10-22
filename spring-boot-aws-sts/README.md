# AWS Security Token Service
  * How to use AWS security token service to create temporary security credentials with Spring Boot and Java app.

## Steps to create/use STS
  * Configure AWS Credentials
  * Create AwsSessionCredentials bean
  * Inject/Autowire AwsSessionCredentials Bean to instantiate Amazon Services
  * Configure the properties in application.properties
  * Run applications to use Temporary Security Credentials t upload file to s3 Bucket.
