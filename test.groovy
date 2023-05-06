pipeline {
    agent any
    stages {
        stage('Docker Pull') {
            steps {
                println env.JOB_NAME
                
                println env.BUILD_NUMBER
                
            }
        }
     

}
}
