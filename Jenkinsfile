pipeline {
   agent { docker { image 'mcr.microsoft.com/playwright/java:v1.35.0-jammy' } }
   stages {
      stage('e2e-tests') {
         steps {
            sh 'mvn -B install -D skipTests --no-transfer-progress'
            sh 'mvn test'
         }
      }
   }
}