# Monitor EC2 logs on CloudWatch 

  * Install the CloudWatch Agent: 
    ```
    sudo yum install amazon-cloudwatch-agent -y
    ```

  * Configure the CloudWatch agent: 
    ```
    sudo /opt/aws/amazon-cloudwatch-agent/bin/amazon-cloudwatch-agent-config-wizard
    ```
    * **Say no to monitoring CollectD**
    * **Monitor /var/log/messages**

  * you can view Agent Configuration in **config.json** file. Go to cd /opt/aws/amazon-cloudwatch-agent/bin
   /opt/aws/amazon-cloudwatch-agent/bin/config.json is the config file.

  * Start the CloudWatch Agent
    ```
    sudo /opt/aws/amazon-cloudwatch-agent/bin/amazon-cloudwatch-agent-ctl -a fetch-config -m ec2 -s -c file:/opt/aws/amazon-cloudwatch-agent/bin/config.json
    ```

  * Generate some activity on our system by installing stress
   *  The stress tool is a workload generator that provides CPU, memory and disk I/O stress tests.
   * it’s in the Extra Packages for Enterprise Linux (EPEL) repository, so first we'll install the epel repository, then we'll install stress.
  ```
  sudo amazon-linux-extras install epel -y
  sudo yum install stress -y
  stress --cpu 1
  ```
