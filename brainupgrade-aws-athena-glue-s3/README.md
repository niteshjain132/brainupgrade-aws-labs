# AWS Athena Glue and S3 Data Lake 
  ### Steps to use Athena SQL to query S3 Data Lake using Glue Catalog.
  * Create s3 bucket and upload data file to s3 bucket.
	* Go to AWS GLue service console and create a data Crawler.
	  * Select datasource as S3 and select the bucket data file path.
		* Create new IAM Role to read permission for S3 Bucket fro glue and athena.
		* Select Run On demand schedule.
		* Add database name
		* Review your cahnges and Click on Finish to create crawler.
	* Once yor create a crawler,run it by clicking "Run Crawler" button and check the status of the crawler, ready, starting, stopping etc.
	* Go to the Athena query editor where you can select your database and table get populated. 
	* Now you can write a SQL query to filter the data as per your needs.
