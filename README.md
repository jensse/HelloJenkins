Description
===========

The intent of this app is to get one up and running with [Jenkins](http://jenkins-ci.org/), quick
and hopefully paninless.

I have used Ubuntu Server on [VirtualBox](https://www.virtualbox.org/). Currently this installation is out of scope. 


## Innstaling Jenkins on Ubuntu.

Execute the code below, instructions from [jenkins-ci.org] (https://wiki.jenkins-ci.org/display/JENKINS/Installing+Jenkins+on+Ubuntu)
	
	wget -q -O - http://pkg.jenkins-ci.org/debian/jenkins-ci.org.key | sudo apt-key add -
	sudo sh -c 'echo deb http://pkg.jenkins-ci.org/debian binary/ > /etc/apt/sources.list.d/jenkins.list'
	sudo apt-get update
	sudo apt-get install  java-6-openjdk git-core
	sudo apt-get install  jenkins 
	
	
### Jenkins configuration
	
#### JDK installation

*	__Name__: java-6-openjdk
*	__JAVA_HOME__: /usr/lib/jvm/java-6-openjdk/ (no.. I don't use the Oracle one).
	
 
## Setting up the automatic build process.

//TODO should add a screen-shot here.


## Project  in Jenkins##

*	__Set projectname__: HelloJenkins
*	__Check__: Discard Old Builds
*	__Source Code Management (Select)__: git
*	__Repository URL__: git@github.com:jensse/HelloJenkins.git
*	__Goals and options__: test package
