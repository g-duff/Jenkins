# Jenkins

My CI setup

## Get started

* `make keys`
* `cd docker && JENKINS_AGENT_SSH_PUBKEY="$(cat ../keys/jenkins_agent_key.pub)" docker compose up -d`

## Design

* All in docker containers.
* One server container.
* One or more agents.

