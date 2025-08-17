pipeline {
    agent any

    tools {
        jdk 'JDK 11'           // Name of JDK from Jenkins Global Tool Configuration
        maven 'Maven 3.8.6'    // Name of Maven from Jenkins Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/YUVARAJSEKAR12/Aug_2025.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Cucumber Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Generate Cucumber Reports') {
            steps {
                sh 'mvn verify'
            }
        }

        stage('Publish HTML Report') {
            steps {
                publishHTML([
                    reportDir: 'target/cucumber-reports',
                    reportFiles: 'cucumber-html-reports.html',
                    reportName: 'Cucumber Report'
                ])
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
