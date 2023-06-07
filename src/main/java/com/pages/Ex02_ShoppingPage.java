package com.pages;
import com.utility.Utility;
import java.io.IOException;
import org.openqa.selenium.By; // instantiate a new web browser.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex02_ShoppingPage extends Utility{
	
	
	
	@FindBy(xpath="//*[@title='ap-shop-wall-stickers-thumbnail-asian-paints']")
	private WebElement wallstickerbutton;
	
	public Ex02_ShoppingPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	
	}
	
	public String validateLandinPageTitle()
	{
		return driver.getTitle(); 
	} 
	
	public void clickWallsticker() {
	
		wallstickerbutton.click();
	}
    public void scrolldown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300);");
 
    }

}





