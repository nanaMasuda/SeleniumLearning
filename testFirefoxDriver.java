package com.leaningselenium.simplewebdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testFirefoxDriver {
	public static void main(String[] args){
		System.setProperty("webdriver.firefox.bin","D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");  
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.baidu.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}

}
