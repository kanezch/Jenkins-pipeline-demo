pipeline {
//    agent { docker { image 'maven:3.2.5' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
