pipeline {
    agent any

    environment {
        JAVA_HOME = tool 'JDK' // Assumes you have configured a JDK tool in Jenkins
    }

    stages {
        stage("Checkout") {
            steps {
                checkout scm
            }
        }

        stage("Compile") {
            steps {
                sh "${env.JAVA_HOME}/bin/javac -cp . Student.java"
            }
        }

        stage("Run") {
            steps {
                sh "${env.JAVA_HOME}/bin/java -cp . Student"
            }
        }

    }
}
