pipeline {
   agent any
   options {
        disableConcurrentBuilds()
        timestamps()
        timeout(time: 30, unit: 'MINUTES')
        buildDiscarder(logRotator(numToKeepStr: '30'))
    }
   
   stages {
       stage('Preparation') { 
           steps {
              checkout scm
           }
       }
       stage('Clean') {
           steps {
               //sh 'chmod 777 gradlew'
               sh './gradlew clean'
           }
       }
       stage('Build') {
           steps {
               sh './gradlew build'
           }
       }
   }
}
