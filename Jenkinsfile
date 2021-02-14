pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
               sh 'mvn clean site'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
