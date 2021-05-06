pipeline {
    agent any
    stages {
        stage ('Init') {
            steps{
                echo "This step defines the initialisation of code in Pipeline"
            }
        }
        stage ('Build') {
            steps{
                echo "This step defines the code is being build by Maven in Pipeline"
            }
        }

        stage ('Test') {
            steps{
                echo " This step defines the Unit and Integration testing of code in Pipeline"
            }
        }

        stage ('Deploy to staging') {
            steps{
                echo "This stage is to deploy the artificat post QA"
            }
        }
        stage ('Deploy to production') {
            steps{
                echo "This stage is to deploy the artificat to production"
            }
        }
    }
}