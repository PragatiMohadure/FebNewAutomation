package com.cybersuccess.maven.MavenAutomation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
@Test
    public void demoTest() {
	WebDriver driver = new ChromeDriver();
	driver.get("http://rediff.com");
}
	
}
