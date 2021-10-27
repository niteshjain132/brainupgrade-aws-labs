# How to deploy Java/spring boot application on Elastic bean stalk?
  * There are couple of ways, you can deploy it as either war file or  Jar File.
  * On AWS Console, Go to Elastic bean stalk and click on **Create New Application** which will open new Wizard.
  * Provide application information like Name and description and click **Next**.
  * On Environment page, Select *Web Server Environment* .
  * Select Predefined configurations as **Java** ( if it's war file then you may select **Tomcat**) and Environment Type like **load balancing, autoscaling**.
  * Next upload Jar file of sprin boot application
  *  

## Resources:
  * [Elastic beanstalk with spring boot](https://aws.amazon.com/blogs/devops/deploying-a-spring-boot-application-on-aws-using-aws-elastic-beanstalk/)
