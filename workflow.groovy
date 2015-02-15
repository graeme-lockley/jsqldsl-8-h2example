def execute() {
    stage 'Build - clean install'
    sh 'mvn clean install'
}

return this;
