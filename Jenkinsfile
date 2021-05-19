pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                echo '$POM_VERSION'
                sh 'chmod +x ./mvnw'
                sh './mvnw clean compile'
                sh './mvnw package'
                //sh './mvnw spring-boot:run'
                
            }
        }
      }
}
