
multibranchPipelineJob('python-deploy') {
    triggers {
        periodic(1)
    }
    branchSources {
        git {
            id('123456789')
            remote("https://github.com/guinokali/Blog.git")
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}