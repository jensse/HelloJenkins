package as.invenio.jenkins;

import junit.framework.Assert;

import org.junit.Test;

import as.invenio.jenkins.HelloJenkins;


public class testHelloJenkins {
	
	@Test
	public void testHelloJenkins(){
		Assert.assertEquals("HelloJenkins", HelloJenkins.say());
	}
}
