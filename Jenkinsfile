pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh '.mvnw clean compile'
            }
        }
      }
}
