pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/your-username/EmployeeProject.git'
            }
        }

        stage('Compile') {
            steps {
                sh 'javac *.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java Main'
            }
        }
    }
}
