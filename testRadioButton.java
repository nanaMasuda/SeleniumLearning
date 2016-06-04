package com.learningselenium.normalwebdriver;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class testRadioButton {
	
	private WebDriver driver;
		
		@Before
		public void setUp() throws Exception{
			System.setProperty("webdriver.firefox.bin","D:/Program Files (x86)/Mozilla Firefox/firefox.exe");
			driver=new FirefoxDriver();
			driver.get("http://www.w3school.com.cn/html/html_forms.asp");
		}
		
		@Test
		public void testRadioButton() throws Exception{
			WebElement femaleRadioButton=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[5]/form[2]/input[2]"));
			if(!femaleRadioButton.isSelected()){
				femaleRadioButton.click();
			}
			
			assertTrue(femaleRadioButton.isSelected());
			
		}
		@After
		public void tearDown() throws Exception{
			driver.quit();
	}
		
}
