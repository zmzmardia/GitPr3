package com.hm.test;

import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseTest {
	
	public WebDriver dr;
	@BeforeClass
	public void openBrowser() throws IOException {
	
	}
	
	@AfterClass
	public void closeBrowser() {
		dr.quit();
	}

}
