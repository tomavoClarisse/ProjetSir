pipeline {
    agent any
    tools {
    //install the maven version
    maven "3.8.6"
    }
    stages{
    //les etapes de notre automatisation
        stage('LaSource'){
        //le premier steps, on lui indique d'aller chercher le repository logé à l'url
            steps{
                git branch: 'main', url: 'https://github.com/tomavoClarisse/ProjetSir'
            }
        }
        //un autre stage que nous allons nommer build, c'est dans lui
        //que nous allons mettre les commande pour build le projet
        stage('Build'){
        //nous allons lancer jacoco
            steps{
                sh ' mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install'
            }
        }
        stage('SonarQube Analysis'){
            steps{
                sh 'mvn sonar:sonar'
            }
        }
        stage('Input pour approuver le déploiement'){
            steps {
                sh 'echo "Déploiement sur le dev."'
            }
        }
    } //fin stages
    post{
        //si l'opération a été arreté
        aborted{
            echo "Sending message to Agent"
        }
        //si l'opération a echoué
        failure{
            echo "Sending message to Agent"
        }
        //si l'opération a été un succes
        success{
            echo "Sending message to Agent"
        }
    }
}