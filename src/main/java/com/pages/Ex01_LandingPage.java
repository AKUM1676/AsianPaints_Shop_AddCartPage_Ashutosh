package com.pages;
import com.utility.Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Ex01_LandingPage extends Utility {
	
	


	@FindBy(xpath="(//*[normalize-space(text())='SHOP'])[2]")
	private WebElement shopbutton;
	
	@FindBy(xpath="//img[@title = 'asian-paint-logo']")
    private WebElement asianpaintlogo;
	
	@FindBy(xpath="//*[@id='__st_fancy_popup']/iframe")

    private WebElement frame3;

	
	public Ex01_LandingPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	
	} 	
	
	public String validateLandinPageTitle()
	{
		return driver.getTitle(); 
	} 
	
	public void clickshop() {
	
		shopbutton.click();
	}
	
	public boolean checkasianPaintLogo() throws IOException

	{
		return asianpaintlogo.isDisplayed();
	}
	public void captureScreenshot() throws Exception {
		 
        Date currentDate = new Date();
        String screenshotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File binaryFile = ts.getScreenshotAs(OutputType.FILE);
 
        //Make sure screenshots folder is already created at the project level
        File imageFile = new File(screenshotsPath + screenshotFileName + ".png"); 
        FileUtils.copyFile(binaryFile, imageFile);
    } 
	@FindBy(id="__st_bpn_no")
    private WebElement dontallow;
 
    public void Dontallow() {
 
            driver.switchTo().frame(frame3);
 
            dontallow.click();
 
            driver.switchTo().defaultContent();
        }


//	public void noThanksButton() throws IOException{
//        driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='st_notification_modal']/iframe")));
//        driver.findElement(By.id("NC_CTA_TWO")).click();
//        driver.switchTo().defaultContent();
//    }
//public void laterButton() throws IOException{
//        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='__st_fancy_popup']/iframe")));
//        driver.findElement(By.id("__st_bpn_no")).click();
//        driver.switchTo().defaultContent();
//    }
@FindBy(xpath="//button[text()='ACCEPT ALL COOKIES']") private WebElement acceptCookiesButton;
public void acceptCookiesButtonValidation() throws IOException
    {
        acceptCookiesButton.click();
    }
}
 