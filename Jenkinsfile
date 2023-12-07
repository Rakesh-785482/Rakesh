pipeline {
    agent any

    environment {
        JAVA_HOME = tool 'JDK' // Assumes you have configured a JDK tool in Jenkins
    }

    stages {
       

        stage("Compile") {
            steps {
                // Compile your Java code
                sh "${env.JAVA_HOME}/bin/javac -cp . Student.java"
            }
        }


        stage("Run") {
            steps {
                // Run your Java application
                bat "${env.JAVA_HOME}/bin/java -cp . Student"
            }
        }

    }
}
