project_name = "jenkins-pipeline-python"
repo = "https://github.com/guinokali/guinokali.github.io.git"
repo_name = "repo"

pipelineJob(project_name) {
	definition {
		triggers {
			scm('H/5 * * * *')
		}

		cpsScm {
			scm {
				git {
					remote {
						name(repo_name)
						url(repo)
					}
				}
				scriptPath("Jenkinsfile")

			}
		}
	}
}