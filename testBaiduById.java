package com.leaningselenium.simplewebdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testBaiduById {
	public static void main(String[] args){
		System.setProperty("webdriver.firefox.bin","D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");  
		WebDriver driver=new FirefoxDriver();
		driver.get("http://baidu.com");
		
		WebElement searchBox=driver.findElement(By.id("kw"));
		searchBox.sendKeys("test Baidu By Id");
		
		WebElement searchButton=driver.findElement(By.id("su"));
		searchButton.submit();
	}

}
