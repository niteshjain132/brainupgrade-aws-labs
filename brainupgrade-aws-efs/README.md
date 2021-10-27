# How to share files from AWS EFS between EC2 instances.
  * Create a security group (e.g, efs-sg) to associate with the EC2 instances and EFS mount target:
    * Inbound SSH connections to the EC2 instances (e.g. 0.0.0.0/0 or CIDR block of your network).
    * Inbound NFS connections to the file system via the EFS mount target from the EC2 instances. 
  * Create an EFS file system from AWS Console.
    * Enter the Name for file system(Optional) , create tag(optional) and file system created,Note the systemId.
  * On AWS Console Select EC2, Choose Launch Instance with Linux AMI.
  * Configure instance details with number of instance 2 and instance security group to allow ssh , http requests and launch the instances.
  * 
    
