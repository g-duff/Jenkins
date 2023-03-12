def call(String repo, String state) {

	String url = "https://api.github.com/repos/g-duff/${repo}/statuses/${GIT_COMMIT}"

	withCredentials([string(credentialsId: 'GitHubStatusToken', variable: 'TOKEN')]) {
		String curlCommand = 'curl -L -X POST ' + url + ' ' + \
			'-H "Accept: application/vnd.github+json" ' + \
			'-H "X-GitHub-Api-Version: 2022-11-28" ' + \
			'-H "Authorization: Bearer $TOKEN" ' + \
			'-d \'{ ' + \
				'"state": "' + state + '",' + \
				'"context": "continuous-integration/jenkins", ' + \
				'"target_url": "https://github.com/g-duff/Jenkins"' + \
			'}\''

		sh curlCommand
	}

}
