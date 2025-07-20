pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: git 'https://github.com/vimandi/studentapp.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploy step (optional)'
            }
        }
    }
}
