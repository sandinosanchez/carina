pipelineJob('carina-core-SNAPSHOT-2.0') {
    displayName('carina-core-SNAPSHOT-2.0')
    description('Carina core Nexus Snapshots deployment job. Assign build-snapshot label for PR or start your PR title "build-snapshot:" to generate snapshot build')
    logRotator {
        numToKeep(30)
    }
    definition {
        cpsScm {
            lightweight(true)
            scm {
                git {
                    remote {
                        url('git@github.com:qaprosoft/carina.git')
                        credentials('TBD') //TODO: adjust creds
                    }
                    branch('master') //TODO: adjust branch
                }
            }
            scriptPath('pipelines/BuildSnapshot.groovy')
        }
    }
}


listView('Regression') {
    description('Regression test pipelines')
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}