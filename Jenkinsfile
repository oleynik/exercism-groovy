pipeline {
    agent {
        docker {
            image 'eclipse-temurin:11-jdk'
            args  '-u root:root'
        }
    }
    options {
        timestamps()
        timeout(time: 30, unit: 'MINUTES')
        buildDiscarder(logRotator(numToKeepStr: '20'))
    }
    stages {
        stage('Build') {
            steps {
                sh '''
                    for d in */; do
                        (cd "$d" && bash ./gradlew --no-daemon --console=plain assemble) || exit 1
                    done
                '''
            }
        }
        stage('Test') {
            steps {
                sh '''
                    for d in */; do
                        (cd "$d" && bash ./gradlew --no-daemon --console=plain test) || exit 1
                    done
                '''
            }
        }
    }
    post {
        always {
            junit allowEmptyResults: true, testResults: '**/build/test-results/test/*.xml'
        }
    }
}
