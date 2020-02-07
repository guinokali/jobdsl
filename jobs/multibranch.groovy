
multibranchPipelineJob('python-deploy') {
    triggers {
        periodic(2)
    }
    branchSources {
        git {
            remote("https://github.com/guinokali/Blog.git")
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}