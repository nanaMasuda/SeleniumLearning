package com.leaningselenium.simplewebdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testDoubanByName {
	public static void main(String[] args){
		System.setProperty("webdriver.firefox.bin","D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.douban.com");
		
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("test Douban By Name");
		searchBox.submit();
		
		driver.close();
	}

}
