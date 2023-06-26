pipeline {
   agent any
tools{
maven 'MAVEN'
}
   stages {
      stage('test') {
         steps {
            echo 'hello world'
            sh 'mvn -B install -D skipTests --no-transfer-progress'
            sh 'mvn test'


         }
      }
   }
}