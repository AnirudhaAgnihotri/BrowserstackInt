package com.example.StepDef;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.Wrapper.WrapperSelenium;

public class BrowserstackClass {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver dr = new ChromeDriver();        
        dr.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        dr.get("https://www.flipkart.com");
        dr.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WrapperSelenium.ExplicitWait(dr,30,By.xpath("//*[@class='_2KpZ6l _2doB4z']"));
        dr.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
        WrapperSelenium.ExplicitWait(dr,30,By.xpath("//input[@title='Search for products, brands and more']"));
        dr.findElement(By.xpath("//input[@title='Search for products, brands and more']")).click();
        dr.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Samsung Galaxy S10");   
        WrapperSelenium.ExplicitWait(dr,30,By.xpath("//button[@class='L0Z3Pu' and @type= 'submit']"));
        dr.findElement(By.xpath("//button[@class='L0Z3Pu' and @type= 'submit']")).click();
       
        Thread.sleep(5000);
        
        WrapperSelenium.ExplicitWait(dr,30,By.xpath("//div[@class='_3879cV' and text()='Samsung']"));
        dr.findElement(By.xpath("//div[@class='_3879cV' and text()='Samsung']")).click();
        
        
       
        
        
        try {
        	 WrapperSelenium.ExplicitWait(dr,30,By.xpath("(//div[@class='_10UF8M'])[3]"));
             dr.findElement(By.xpath("(//div[@class='_10UF8M'])[3]")).click();
        
		} catch (Exception e) {
			// TODO: handle exception
		}
          
       ArrayList<WebElement> productname = new ArrayList<WebElement>();
       ArrayList<WebElement> displayprice = new ArrayList<WebElement>();
       ArrayList<WebElement> url = new ArrayList<WebElement>();
       
       WrapperSelenium.ExplicitWait(dr,30,By.xpath("//div[@class='_4rR01T']"));
       
       productname = (ArrayList<WebElement>) dr.findElements(By.xpath("//div[@class='_4rR01T']"));
       
       for (WebElement webElement : productname) {
    	   
    	   System.out.println("______________________________________________________");
    	   
    	   System.out.println(webElement.getText()+ " This is product name");
    	   
    	   System.out.println("______________________________________________________");
    	
    }  
        
       
       displayprice = (ArrayList<WebElement>) dr.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
    for (WebElement webElement : displayprice) {
    	   
    	   System.out.println("______________________________________________________");
    	   
    	   System.out.println(webElement.getText()+" This is product price");
    	   
    	   System.out.println("______________________________________________________");
    	
    }
          
    url = (ArrayList<WebElement>) dr.findElements(By.xpath("//*[@class='_1fQZEK']"));
    for (WebElement webElement : url) {
    	   
    	   System.out.println("______________________________________________________");
    	   
    	   System.out.println(webElement.getAttribute("href")+" This is product url");
    	   
    	   System.out.println("______________________________________________________");
    	
    }     
      
      
        
      

      
    
        
     
        
        
        
	}

}
