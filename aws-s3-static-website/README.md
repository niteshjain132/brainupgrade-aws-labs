# Static Website with S3
  * Once you login to AWS console, go to S3 service and create bucket e.g. "mystatics3website-2021". 
  * Please note that if you wish to publish your static website you must create buckename exactly same as your website name e.g. "aws-labs.brainupgrade.in"
  * Upload your static contents in bucket, in our case index.html and error.html.
  * Select Properties > Static Website > Edit  > Enable
  * Once you enable static website hosting option, screen with fields will appear.
  * Select hosting Type as "Host a static website". Enter index docment name (e.g. index.html) and error document name(e.g. error.html), this is optional.
  * Save changes and your static web site is ready access from browser. 
  * At the bottom of page,under static web side section, you can see your bucket endpoint e.g. http://aws-labs-brainupgrad.in.s3-website-us-east-1.amazonaws.com/

## Resources:
https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteHosting.html 
