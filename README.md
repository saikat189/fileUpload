Problem Statement: Upload a large file >1.5GB to Database(Postgres)

Tools used: Intellij, Postgres DB

It is a simple file upload application using swagger 2 and spring boot.

Steps:

1.Run main class(SpringBoot2FileUpload).
2.Go to http://localhost:8090/spring-boot-file-upload/swagger-ui.html#
3.Clck on "POST"
4. Click on "Try now"

Assumptions: Swagger home page will be authenticated with OKTA sso,a large file will be 
uploaded to local file sytem and store its information to db.We can also have a consumer
service of those files

Challanges: 
OKTA SSO privilege to all services.

Work In Progress:
1.Upload a very large file.
2.Add SSO using OKTA(Just an another POC integrating with this app for CAS)
