package com.cybersuccess.maven.MavenAutomation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest {
	@Test 
	public void sampleTest() throws InterruptedException
	{ WebDriver driver=new FirefoxDriver();
		driver.get("http://rediff.com");
		Thread.sleep(3000);
		driver.close();
}
}