FROM jenkins/ssh-agent

RUN apt-get update

RUN apt-get install curl --yes

RUN apt-get install make --yes

RUN apt-get install python3.9 python3-venv --yes

CMD setup-sshd
