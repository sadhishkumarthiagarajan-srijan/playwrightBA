pipeline {
   agent any
   stages {
      stage('test') {
         steps {
     sh 'mvn -B install -D skipTests --no-transfer-progress'
            sh 'mvn test'
         }
      }
   }
}