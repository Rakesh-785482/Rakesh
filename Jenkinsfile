pipeline {
    agent any

    stages {
       
        stage("Compile") {
            steps {
                // Compile your Java code
                sh "javac Student.java"
            }
        }


        stage("Run") {
            steps {
                // Run your Java application
                sh "java Student"
            }
        }

    }
}
