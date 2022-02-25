package com.bit.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
	public WebDriver dr;
	
	public Utility(WebDriver dr) {
		this.dr = dr;
	}
	
	public void click(By by ) {
		dr.findElement(by).click();
	}
	
	public void typeOnElement(By by, String value){
		dr.findElement(by).sendKeys(value);
	}

}
