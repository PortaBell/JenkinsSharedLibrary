def call(String stageName){
  
  if ("${stageName}" == "Building")
     {
       sh "mvn clean package"
     }
  else if ("${stageName}" == "Code Quality Reporting")
     {
       sh "mvn clean sonar:sonar"
     }
  else if ("${stageName}" == "Uploading Into Nexus")
     {
       sh "mvn clean deploy"
     }
}
