pipeline {
    agent any
    
    /*
    environment {
    //Use Pipeline Utility Steps plugin to read information from pom.xml into env variables
    POM_VERSION = readMavenPom().getVersion()
    }
    */

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                //echo '${POM_VERSION}'
                sh 'chmod +x ./mvnw'
                sh './mvnw clean compile'
            }
        }
       stage('Package') {
            steps {
                echo 'Packaging..'
                sh './mvnw package'
                //sh './mvnw spring-boot:run'
            }
        }
        stage('Dockerize') {
            steps {
                echo 'Dockerizing..'
                //sh './mvnw package'
                //sh './mvnw spring-boot:run'
            }
        }
        
    }
}
