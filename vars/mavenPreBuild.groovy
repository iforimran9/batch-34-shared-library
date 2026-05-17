def call (String repoUrl){
	stage('git-checkout') {
                git repoUrl
        }

        stage('Code-Compile') {
               sh 'mvn clean compile'
        }
        
        stage('Unit Tests') {
               sh 'mvn test'
        }
}
