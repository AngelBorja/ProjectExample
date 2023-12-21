package com.example;
 
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class class1 {
    WebDriver driver;
    @Test
    public void searchGoogle() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\xroon\\OneDrive\\Documentos\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement textbox1 = driver.findElement(By.xpath("//textarea[@title='Buscar']"));
        textbox1.sendKeys("test search");
        WebElement searchButton= driver.findElement(By.xpath("//input[@value='Buscar con Google']"));
        searchButton.click();
        WebElement result1 = driver.findElement(By.xpath("//h3[contains(text(),'test')]"));
        Assert.assertEquals(true, result1.isDisplayed());
    }
 
    @After
    public void afterTest() {
      driver.quit();
    }
} 