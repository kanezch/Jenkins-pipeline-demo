pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
               sh 'mvn -v'
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
