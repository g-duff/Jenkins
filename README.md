# Jenkins

My CI setup

## Get started

* `make keys`
* `cd docker && JENKINS_AGENT_SSH_PUBKEY="$(cat ../keys/jenkins_agent_key.pub)" docker compose up -d`
* [Add an agent](https://www.jenkins.io/doc/book/using/using-agents/#delegating-the-first-job-to-agent1). Note that the hostname is the docker container name.

## Design

* All in docker containers.
* One server container.
* One or more agents.

