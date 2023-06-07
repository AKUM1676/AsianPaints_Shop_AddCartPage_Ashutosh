package com.pages;
import com.utility.Utility;
 
 
 
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
 
import org.openqa.selenium.By; // instantiate a new web browser.
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class Ex04_AddToCart_Page extends Utility{
    
    
    @FindBy(xpath="//img[@title='Stance of a peacock - Wall Stickers & Decals by Asian Paints']")
    private WebElement image;
    
    @FindBy(xpath="//a[@id='addToCart']")
    private WebElement addtocart;
    
 
    
    public Ex04_AddToCart_Page() throws IOException
    {
        PageFactory.initElements(driver, this);
    }
    
    public String validateLandinPageTitle()
    {
        return driver.getTitle();
    }
    
    public void image() {
        image.click();
    }
    
    public void pincode_outline(String pincode) {
      String mainWindowHandle = driver.getWindowHandle();
      Set<String> handles = driver.getWindowHandles();
      Iterator<String> it = handles.iterator();
      String parentId = (String) it.next();
      String childId = (String) it.next();
      driver.switchTo().window(childId);
      driver.findElement(By.xpath("//*[@id=\"productPincode\"]")).click();
      driver.findElement(By.xpath("//*[@id=\"productPincode\"]")).sendKeys(pincode);
 
    }
    
    public void addToCart() {
        
        addtocart.click();
    }
    public void scrolldown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300);");
 
    }


    
    
        
    
}

