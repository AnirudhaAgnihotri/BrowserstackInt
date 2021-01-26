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

import com.example.Driver.DriverClass;
import com.example.Wrapper.WrapperSelenium;

public class BrowserstackClass2 {
	
	public static void main(String[] args) throws InterruptedException {
		DriverClass.setdriver();
        WebDriver dr = new ChromeDriver();
        
        DriverClass.getDriver().manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
         DriverClass.getDriver().get("https://www.flipkart.com");
        
         DriverClass.getDriver().manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
        WrapperSelenium.ExplicitWait(DriverClass.getDriver(),30,By.xpath("//*[@class='_2KpZ6l _2doB4z']"));
         DriverClass.getDriver().findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
        
      
        
        WrapperSelenium.ExplicitWait(DriverClass.getDriver(),30,By.xpath("//input[@title='Search for products, brands and more']"));
         DriverClass.getDriver().findElement(By.xpath("//input[@title='Search for products, brands and more']")).click();
         DriverClass.getDriver().findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Samsung Galaxy S10");
        
        WrapperSelenium.ExplicitWait(DriverClass.getDriver(),30,By.xpath("//button[@class='L0Z3Pu' and @type= 'submit']"));
         DriverClass.getDriver().findElement(By.xpath("//button[@class='L0Z3Pu' and @type= 'submit']")).click();
       
        Thread.sleep(5000);
        
        WrapperSelenium.ExplicitWait(DriverClass.getDriver(),30,By.xpath("//div[@class='_3879cV' and text()='Samsung']"));
         DriverClass.getDriver().findElement(By.xpath("//div[@class='_3879cV' and text()='Samsung']")).click();
        
        
       
        
        
        
        WrapperSelenium.ExplicitWait(DriverClass.getDriver(),30,By.xpath("(//div[@class='_10UF8M'])[3]"));
         DriverClass.getDriver().findElement(By.xpath("(//div[@class='_10UF8M'])[3]")).click();
      
       ArrayList<WebElement> productname = new ArrayList<WebElement>();
       ArrayList<WebElement> displayprice = new ArrayList<WebElement>();
       ArrayList<WebElement> url = new ArrayList<WebElement>();
       
       productname = (ArrayList<WebElement>)  DriverClass.getDriver().findElements(By.xpath("//div[@class='_4rR01T']"));
       
       for (WebElement webElement : productname) {
    	   
    	   System.out.println("______________________________________________________");
    	   
    	   System.out.println(webElement.getText()+ " This is product name");
    	   
    	   System.out.println("______________________________________________________");
    	
    }  
        
       
       displayprice = (ArrayList<WebElement>)  DriverClass.getDriver().findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
    for (WebElement webElement : displayprice) {
    	   
    	   System.out.println("______________________________________________________");
    	   
    	   System.out.println(webElement.getText()+" This is product price");
    	   
    	   System.out.println("______________________________________________________");
    	
    }
          
    url = (ArrayList<WebElement>)  DriverClass.getDriver().findElements(By.xpath("//*[@class='_1fQZEK']"));
    for (WebElement webElement : url) {
    	   
    	   System.out.println("______________________________________________________");
    	   
    	   System.out.println(webElement.getAttribute("href")+" This is product url");
    	   
    	   System.out.println("______________________________________________________");
    	
    }     
      
      
        
      

      
    
        
     
        
        
        
	}

}
