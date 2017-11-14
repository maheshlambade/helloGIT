package com.demoPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElements {

	//find all elements on web site
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		// must use xpath and store in list webelement
		List<WebElement>elements=driver.findElements(By.xpath("//*"));
		System.out.println(Integer.toString(elements.size()));
		
		for (WebElement x:elements) {
			
			System.out.println(x.getTagName()+":"+x.getText());
			
		}
		
		
		
		
		
	}
	

}
