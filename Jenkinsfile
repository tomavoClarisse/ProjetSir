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
        //nous allons faire juste un maven package
            steps{
                sh 'mvn clean package'
            }
        }
    }
}