package com.example.Wrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WrapperSelenium {
	
	
	public static void ExplicitWait(WebDriver dr,long time, By b) {
	
	WebDriverWait wait = new WebDriverWait(dr,time);
    wait.until(ExpectedConditions.visibilityOfElementLocated(b));
 
	}
}
