project_name = "project-a/jenkins-pipeline-python"
repo = "https://github.com/guinokali/Blog.git"
repo_name = "repo"

folder('project-a') {
    displayName('Project A')
    description('Folder for project A')
}

pipelineJob(project_name) {
	definition {
		triggers{
			scm('* * * * *')
		}

		cpsScm{
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