package as.invenio.jenkins;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

import junit.framework.Assert;

import org.junit.Test;

import as.invenio.jenkins.HelloJenkins;


public class TestHelloJenkins {
	
	@Test
	public void testHelloJenkins(){
		Assert.assertEquals("Hello Jenkins", HelloJenkins.say());
	}
	@Test
	public void testTestProperties(){
		System.out.println(this.getClass().getResourceAsStream("config.properties"));
	//	System.out.println(ResourceBundle.getBundle("config.properties"));
		Properties prop = new Properties();
		try {
			prop.load(this.getClass().getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("test"));
		System.out.println(this.getClass()
				.getResourceAsStream
				("config.properties"));
	}
}
