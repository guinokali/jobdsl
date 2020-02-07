
multibranchPipelineJob('python-deploy') {
    triggers {
        periodic(1)
    }
    branchSources {
        git {
            remote("https://github.com/guinokali/Blog.git")
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(1)
        }
    }
}