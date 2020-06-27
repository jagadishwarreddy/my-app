pipeline {
    agent any
    stages {
        stage('clone repo and clean') {
            steps {
                // this is the folder which contains the code
                bat "mvn clean"
            }
        }
        stage('Test') {
            steps {
                // run tests
                bat "mvn test"
            }
        }
        stage('Deploy') {
            steps {
                // pakage
                bat "mvn package"
            }
        }
    }
}
