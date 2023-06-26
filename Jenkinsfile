pipeline {
   agent any
   stages {
      stage('e2e-tests') {
         steps {
            sh 'mvn -B install -D skipTests --no-transfer-progress'
            sh 'mvn test'
         }
      }
   }
}