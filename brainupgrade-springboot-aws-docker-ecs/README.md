# Build and Deploy SpringBoot Microservice with docker on AWS ECS and AWS Fargate:
  * Create Dockerfile for spring boot application with jdk, application jar file and entrypoint to execute the jar file.
	* Build docker image with below command
	```
	docker build -t dmghutake/brainupgrade-springboot-aws-docker-ecs .
	```
	* Push docker image to docker hub repository with below command and check on docker hub whether image has been published or not.
	```
	docker push dmghutake/brainupgrade-springboot-aws-docker-ecs
	```
	* Now let's create ECS Task definition, go to aws ECS console using Fargate compatibilites.
	* Select custom container definition by providing image, memory , port mapping details.
	```
	docker.io/dmghutake/brainupgrade-springboot-aws-docker-ecs
	port : 8080, 80
	```
	* Once Task definition completes , next create ECS Cluster.
	* Next view cluster and go to "Task" tab and click on "Run new Task" button with launch typ farget, task definition, subnet etc and click on "Run Task".
	* Once Cluster is created and status is "RUNNING", copy IP address check the service is running.
