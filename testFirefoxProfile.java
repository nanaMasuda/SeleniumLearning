package com.leaningselenium.simplewebdriver;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.*;

public class testFirefoxProfile {
	public static void main(String[] args){
		String profileInJson="";
		FirefoxProfile profile=new FirefoxProfile();
		try{
			
//			profile.addExtension(new File("/path/to/extension.xpi"));
			profile.setPreference("browser.startup.homepage","about:blank");
			profile.setAssumeUntrustedCertificateIssuer(false);
			
			profileInJson=profile.toJson();
			System.out.println(profileInJson);
		}catch(IOException e){
			e.printStackTrace();
		}
		System.setProperty("webdriver.firefox.bin","D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");  
		WebDriver driver=new FirefoxDriver(profile);
		driver.get("http://www.baidu.com");
		driver.close();
	}

}
