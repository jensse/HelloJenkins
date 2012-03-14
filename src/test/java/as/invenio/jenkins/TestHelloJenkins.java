package as.invenio.jenkins;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

import junit.framework.Assert;

import org.junit.Test;

import as.invenio.jenkins.HelloJenkins;


public class TestHelloJenkins {
	
	
	/**
	 * The ultimate Hello Jenkins test ;)
	 */
	@Test
	public void testHelloJenkins(){
		Assert.assertEquals("Hello Jenkins", HelloJenkins.say());
	}
	
	
	/**
	 * Simple test to ensure that the correct properties file is picked up
	 * when running test.
	 */
	@Test
	public void testTestProperties(){
		Properties prop = new Properties();
		try {
			prop.load(this.getClass().getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals("test.resource", prop.getProperty("test"));
	
	}
}
