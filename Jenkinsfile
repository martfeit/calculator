pipeline {
    agent any
    stages {
        stage("Checkout") {
            steps {
                git url: 'https://github.com/martfeit/calculator', branch: 'main'
            }
        }
        stage("Compile"){
            steps{ 
                sh "chmod +x /var/jenkins_home/workspace/calculator/gradlew"
                sh "./gradlew compileJava"
        
            }
        }
        stage("Unit Test"){
            steps{
                sh "./gradlew test"
            }
        }
    }
}