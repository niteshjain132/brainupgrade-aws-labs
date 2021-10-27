# How to share files from AWS EFS between EC2 instances.
  * Create a security group (e.g, efs-sg) to associate with the EC2 instances and EFS mount target:
    * Inbound SSH connections to the EC2 instances from your computer (e.g. 0.0.0.0/0 or CIDR block of your network).
    * Inbound NFS connections to the file system via the EFS mount target from the EC2 instances. NFS port:2049 and source should EC2 security group. 
  * Create an EFS file system from AWS Console.
    * Enter the Name for file system(Optional) , create tag(optional) and file system created,Note the systemId.
  * On AWS Console Select EC2, Choose Launch Instance with Linux AMI.
  * Configure instance details with number of instance 2
  * Add above bootstrap script in user data section to install EFS client when Instances launch.
  * Assign instance security group to allow ssh, http requests and launch the instances.
  * Make sure you have attach EFS security group to both Instances to allow file Sharing from EFS to EC2 instances.
  * Now copy public IP for both EC2 instances and SSH to both EC2 instaces
   ```
   $ ssh ec2-user@<Ip-address> -i <keypair>.pem
   $ sudo su 
   $ cd /var/www
   ```
   * Make sure appache and efs client has installed already. 
   * Go to EFS to mount the file system usinf efs mount helper.
    ```
    $ sudo mount -t efs -o tls fs-98061b8:/ /var/www/html
    $ ls 
    $ cd /html
    $ echo "<html><h1>This is EFS DEMO from Brainupgrade</h1></html>" > index.html
    
    ```
   *  This index.html file should be visible in other EC2 instance and if you update that file you changes should reflect automatically.

## Resources
 * https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AmazonEFS.html 
    
