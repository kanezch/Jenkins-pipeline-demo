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

    post {
        always {
            recordIssues(
                enabledForFailure: true, aggregatingResults: true,
                tools: [checkStyle(pattern: '**/checkstyle-result.xml', reportEncoding: 'UTF-8'),
                        spotBugs(pattern: '**/target/findbugsXml.xml')]
            )
        }
    }
}
