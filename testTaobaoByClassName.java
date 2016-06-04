package com.leaningselenium.simplewebdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testTaobaoByClassName {
	public static void main(String[] args){
		System.setProperty("webdriver.firefox.bin","D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.taobao.com");
		
		WebElement searchBox=driver.findElement(By.className("search-combobox-input"));
		searchBox.sendKeys("test Taobao By Classname");
		searchBox.submit();
		
		driver.close();
	}

}
