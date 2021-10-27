# How to deploy Java/spring boot application on Elastic Bean Stalk?
  * There are couple of ways, you can deploy it as either war file or  Jar File.
  * On AWS Console, Go to Elastic bean stalk and click on **Create New Application** which will open new Wizard.
  * Provide application information like Name and description and click **Next**.
  * On Environment page, Select *Web Server Environment* .
  * Select Predefined configurations as **Java** ( if it's war file then you may select **Tomcat**) and Environment Type like **load balancing, autoscaling**.
  * Next upload Jar file of spring boot application
  * Provide environment information such as Envrionment name (e.g. springboot-rest-api-prod) and URL.
  * Provide **Additional Information** like Database information and you may need to creat RDS instace. for this example we need not to provide any Database information.
  * On Configuration Details page, provide EC2 instance type e.g.**t2.small** with key pair. Set Application health check **"/"**.
  * Provide RD configurations if any, VPC details or select default VPC, and select permission which is already create to access ec2 and review and apply the changes.
  * you should be able to access the application url and all rest endpoints. 

## Resources:
  * [Elastic beanstalk with spring boot](https://aws.amazon.com/blogs/devops/deploying-a-spring-boot-application-on-aws-using-aws-elastic-beanstalk/)
