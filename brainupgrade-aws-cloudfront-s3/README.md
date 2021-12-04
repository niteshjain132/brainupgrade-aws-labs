# How to improve your website performance by using Cloud Front with S3?
  * Create S3 bucket e.g. "brainupgrade-cloudfront-s32021" with ACL enabled and public access.
  * Upload above images to the bucket and grant public permission.
  * Test whether you can view these images with object URL.
  * Go to Cloud front console page and create cloud front distribution.
  * Select Origin as S3 bucket and give some meaningful origin name.
  * You may give TTL addtional setting and leave other options as default and click save.
  * It may take 15 mins to an hour to create an cloud front distribution.
  * Once cloud front distribution is deployed click on Id to get DNS name of cloud front. 
  * Copy DNS name of cloud front and open browser and paste it along with image name from S3 bucket.

```
http://<<CLOUD-FRONT_DNS_NAME>>/imagename
```
  * You should be able load image rapidly and you can observe the perfromance.
### Clean up the environment
  * You must disable cloud front before you delete it. It may take several minutes to disable.
  * Clean up S3 Bucket objects.  
