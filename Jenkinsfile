pipeline {
    agent any
    stages {
        stage ('init') {
            steps{
                echo "This step defines the initialisation of code in Pipeline"
            }
        }
        stage ('build') {
            steps{
                echo "This step defines the code is being build by Maven in Pipeline"
            }
        }

        stage ('test') {
            steps{
                echo " This step defines the Unit and Integration testing of code in Pipeline"
            }
        }

        stage ('deploy') {
            steps{
                echo "This stage is to deploy the artificat post QA"
            }
        }
    }
}