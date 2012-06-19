Description
===========
Date: 2012.06.19

The intent of this app is to get one up and running with [Jenkins](http://jenkins-ci.org/), quick
and hopefully paninless.

I have used Ubuntu Server on [VirtualBox](https://www.virtualbox.org/). I have left the Virtual box installation out of scope.


## Innstaling Jenkins on Ubuntu.

This steps require you to login to the server and _su_ to the jenkins user.

### Install Jenkins.

Login to the ubuntu server and execute the code below, instructions from
[jenkins-ci.org] (https://wiki.jenkins-ci.org/display/JENKINS/Installing+Jenkins+on+Ubuntu).
	
	wget -q -O - http://pkg.jenkins-ci.org/debian/jenkins-ci.org.key | sudo apt-key add -
	sudo sh -c 'echo deb http://pkg.jenkins-ci.org/debian binary/ > /etc/apt/sources.list.d/jenkins.list'
	sudo apt-get update
	sudo apt-get install  java-6-openjdk git-core #(openjdk does not require registration) 
	sudo apt-get install  jenkins 
	
	
	
## Installing ssh private key.

You need this step if you intend to use autenticated git access.

Copy the folder _.ssh_ containing the files _id_rsa_ and _id_rsa.pub_(this is the file you upload to the git server)
to _/var/lib/jenkins/_. and execute:


	cd /var/lib/jenkins  
	chown -R jenkins:adm .ssh  
	chmod -R 700 .ssh  

You can now test the connection by changing to the jenkins user and executing the following commands with:

	sudo su - jenkins
	ssh -T git@github.com	

The respons shuld be:  

	Hi <githubuser>! You've successfully authenticated, but GitHub does not provide shell access.

There is more to the git installation process, this is done after the first build.
 
## Jenkins configuration

	
### JDK installation

*	__Name__: java-6-openjdk
*	__JAVA_HOME__: /usr/lib/jvm/java-6-openjdk/

### Git installations

Git was installed initially using _apt-get install_.

*	__Name__: default
*	__Path to Git executable__:/usr/bin/git

### Maven installations

*	__Name__: default.
*	__Check__: Install automatically.
*	__Version__: 3.0.4 (Make your pick).	
 
## Setting up the automatic build process.

//TODO should add a screen-shot here.


## Project  in Jenkins


### New Job

*	__Set jobname__:  HelloJenkins
*	__Select__: Build a maven2/3 project.

### Configuration settings

*	__Set Projectname__: HelloJenkins
*	__Check__: Discard Old Builds.  I use, Days to keep builds: 2, Max # of builds to keep: 2
*	__Source Code Management (Select)__: git
*	__Repository URL__: git@github.com:jensse/HelloJenkins.git
*	__Repository browser__: githubweb, https://github.com/jensse/HelloJenkins
*	__Build Triggers__: Poll SCM, "*/15 * * * *" (every 15 minutes).
*	__Goals and options__: test package
*	__Run  build__: 

### After first build (git continued)

Login to the jenkins server:
	
	sudo su - jenkins
	cd ~/jobs/HelloJenkins/workspace
	
Set git credential information:
	
	git config --global user.email "jenkins@your_url"
	git config --global user.name "jenkins ci"

_Apperently this is now configurable using the __Git plugin__ section of system configuration_.
	
login and rerun the build process. Hopefully all is sunshine ;-)
	

