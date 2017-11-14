package com.demoPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://primusbank.qedgetech.com");
	WebElement sl=driver.findElement(By.id("drlist"));
	Select brlist=new Select(sl);
	
	//brlist.selectByIndex(1);
	brlist.selectByValue("1");	

	}

}
