pipeline {
    agent any

    stages {
        stage("compile") {
            steps {
                sh 'javac Student.java'
            }
        }

        stage("run") {
            steps {
                sh 'java Student'
            }
        }
    }
}
