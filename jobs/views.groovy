listView('python') {
    filterBuildQueue()
    filterExecutors()
    description('Python pipelines')
    jobs {
        regex(/.*python.*/)
    }
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