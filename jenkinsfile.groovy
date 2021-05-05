job('First-seed-project-Maven') {
    // logRotator(-1, 10)
    // jdk('Java 8')
    scm {
        git('https://github.com/Balamurali81/java_project.git', 'main')
    }
    triggers {
        git('* * * * *')
    }
    steps {
        Maven('clean build', 'java-tomcat-sample/pom.xml')
    }
    publishers {
        archiveArtifacts('**/*.war')
    }
}