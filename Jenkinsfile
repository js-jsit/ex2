pipeline {
    agent any
    environment { 
		registry = "jsjsit/ex2" 
		registryCredential = 'DockerAccessToken'
		dockerImage = '' 
        ////Use Pipeline Utility Steps plugin to read information from pom.xml into env variables
        //POM_VERSION = readMavenPom().getVersion()
    }
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
        stage('Building our image') { 
			steps { 
				script { 
					dockerImage = docker.build registry + ":$BUILD_NUMBER" 
				}
			} 
		}
		stage('Deploy our image') { 
			steps { 
				script { 
					docker.withRegistry( '', registryCredential ) { 
						dockerImage.push() 
					}
				} 
			}
		}
		stage('Cleaning up') { 
			steps { 
				sh "docker rmi $registry:$BUILD_NUMBER" 
			}
		} 
        
    }
}
