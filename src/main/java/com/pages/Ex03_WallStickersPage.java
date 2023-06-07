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

public class Ex03_WallStickersPage extends Utility{
	
	
	@FindBy(xpath="//*[@id=\"sort-products\"]")
	private WebElement sort_select;
	
	
	@FindBy(xpath="//*[@id=\"sort-products\"]/option[2]")
	private WebElement lowhigh;
	
	
	public String validateLandinPageTitle()
	{
		return driver.getTitle(); 
	} 
	
	public void filter() {
		sort_select.click();
	}
	
	public void lowhigh() {
		lowhigh.click();
	}
	
		
	public Ex03_WallStickersPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	
	}
	public void scrolldown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300);");
 
    }
	
}

















































