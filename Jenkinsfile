pipeline {
   agent any
    environment {
         PATH = "$PATH:/opt/homebrew/bin/mvn"
      }
   stages {
      stage('test') {
         steps {
     sh 'mvn -B install -D skipTests --no-transfer-progress'
            sh 'mvn test'
         }
      }
   }
}