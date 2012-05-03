Description
===========

The intent of this app is to get one up and running with [Jenkins](http://jenkins-ci.org/), quick
and hopefully paninless.
I have used VirtualBox (the installation of this is out of scope). 


## Innstaling Jenkins on ubuntu.

	Execute the following code:
	
	wget -q -O - http://pkg.jenkins-ci.org/debian/jenkins-ci.org.key | sudo apt-key add -
	sudo sh -c 'echo deb http://pkg.jenkins-ci.org/debian binary/ > /etc/apt/sources.list.d/jenkins.list'
	sudo apt-get update
	sudo apt-get install  java-6-openjdk git-core
	sudo apt-get install  jenkins 
	
	
### Jenkins configuration
	
#### JDK

*	JDK installations: Name ; java-6-openjdk
*	JDK installations: JAVA_HOME ; /usr/lib/jvm/java-6-openjdk/ 
	
 
## Setting up the automatic build process.


## Project  in Jenkins##

*	__Set projectname:__ HelloJenkins
*	__Check:__ Discard Old Builds
*	__Source Code Management (Select):__ git
*	__Repository URL:__ git@github.com:jensse/HelloJenkins.git
*	__Goals and options:__ test package
