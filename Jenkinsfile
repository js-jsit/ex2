pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'chmod +x ./app/mvnw'
                sh './app/mvnw clean compile'
            }
        }
      }
}
