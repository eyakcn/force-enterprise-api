The force-enterprise-api release new version every season.
You need to generate the Java source code from .wsdl file, package and deploy to maven repository.

Q. Where is the git repository stored?

   https://github.com/eyakcn/force-enterprise-api.git


Q. Where to find .wsdl file?

   1. Login https://login.salesforce.com/

   2. Go to "App Setup -> Develop -> API"
   
   3. Click "Generate Enterprise WSDL"


Q. How to generate Java code from .wsdl file?

   1. Save the wsdl file under "src/test/resources/", with the name "force_enterprise.wsdl"

   2. Run GenerateSourceFromWSDL under "src/test/java/", it will remove old source code and generate new one
   
   3. You must remember to format the code by Eclipse before deploy


Q. How to deploy this library onto Maven Repository?

   1. Modify pom.xml, change version number

   2. Run `mvn clean package deploy`


Q. And others?

   I have created a project on Github, you can store the code there.

   1. Run `git commit -m "Version 27.0.0"`
   
   2. Run `git push origin master`