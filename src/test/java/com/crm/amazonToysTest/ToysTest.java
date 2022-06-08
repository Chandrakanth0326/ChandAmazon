package com.crm.amazonToysTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import gen.BaseClass;

public class ToysTest extends BaseClass{
	
	@Test
	public void serachToys() throws Throwable{
		driver.findElement(By.xpath("//div[@class='nav-search-field ']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("toys");
		
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		String ttl = driver.getTitle();
		System.out.println(ttl);
		String actPageName="toys";
		
		Assert.assertTrue(ttl.contains(actPageName));
	}

}
