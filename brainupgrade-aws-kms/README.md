# How do we use AWS KMS to encrypt, decrypt and re-encrypt the data?
  ### Create IAM Users:
  * First create user group e.g. "kms-group" and create two user i.e. "kms-manager" and "kms-user" with Admin role. 
  * One user if to manage keys and other users to use KMS to encrypt, decrypt data.
  ### Create CMK key
  * Go to AWS KMS console and create CMK keys. 
  * Select Symmetric encryption key type.
  * Select Key material origin as "KMS" and single-region key.
  * Give Alias name and description to use it as user freindly name instead of long key id.
  * Select Key Administrator and User with Key Usage permission.
  * Review and Save the changes.
  ### Launch EC2 instance.
  * Connect to EC2 instance and create some text file with sample data which can be encrypted.
    ```
    $ echo "Hello this KMS Test" > secret.txt
    ```
  * you can encrypt this file wiht below command. Please make sure to replace KMS key Id in command. 
    ```
    aws kms encrypt --key-id YOURKEYIDHERE --plaintext fileb://secret.txt --output text --query CiphertextBlob | base64 --decode > encryptedsecret.txt
    ```
  * Above command will create an seperate file "encryptedsecret.txt" which has encrypted content. You can view encrypted test with below command. 
    ```
    cat encryptedsecret.txt
    ```
  * You can decrypt the encrypted text with below command.
    ```
    aws kms decrypt --ciphertext-blob fileb://encryptedsecret.txt --output text --query Plaintext | base64 --decode > decryptedsecret.txt
    ```
  * You can re-encrypt the text with below command. Please make sure to replace KMS key Id in command. 
    ```
    aws kms re-encrypt --destination-key-id YOURKEYIDHERE --ciphertext-blob fileb://encryptedsecret.txt | base64 > newencryption.txt 
    ```
  * You can enable key rotation with below command. Key will rotate after an hour. Please make sure to replace KMS key Id in command. 
    ```
    aws kms enable-key-rotation --key-id YOURKEYIDHERE
    ```
  * You can get key rotation status with below command. Please make sure to replace KMS key Id in command.
    ```
    aws kms get-key-rotation-status --key-id YOURKEYIDHERE
    ```
  * You can generate data key with AES_256 . Please make sure to replace KMS key Id in command.
    ```
    aws kms generate-data-key --key-id YOURKEYIDHERE --key-spec AES_256
    ```
    
   ### Resources:
   * [AWS KMS CLI](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/kms/index.html#cli-aws-kms)
