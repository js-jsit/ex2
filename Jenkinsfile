pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh './app/mvnw clean compile'
            }
        }
      }
}
