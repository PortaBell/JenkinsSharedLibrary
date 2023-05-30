def call(String Dansoa){
  
  if ("${Dansoa}" == "Building")
     {
       sh "mvn clean package"
     }
  else if ("${Dansoa}" == "Code Quality Reporting")
     {
       sh "mvn clean sonar:sonar"
     }
  else if ("${Dansoa}" == "Uploading Into Nexus")
     {
       sh "mvn clean deploy"
     }
}
