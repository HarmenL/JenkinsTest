pipeline {
	agent any
	
	stages {
		stage ('Compile'){
			steps {
				withMaven(maven : 'maven_3_6_0') {
					bat 'mvn clean compile'
				}
			}
		}
		
		stage ('Test'){
			steps {
				withMaven(maven : 'maven_3_6_0') {
					bat 'mvn test'
				}
			}
		}
		
		stage ('Deployment'){
			steps {
				withMaven(maven : 'maven_3_6_0') {
					bat 'mvn deploy'
				}
			}
		}
	}
}