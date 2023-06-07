package step_defination2;
 
import static org.testng.Assert.assertEquals;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.aventstack.extentreports.Status;
import com.pages.*;
import com.utility.Utility;
 
public class Ex01_Addtocart extends Utility{
 
    public Ex01_LandingPage ldp;
    public Ex02_ShoppingPage ab;
    public Ex03_WallStickersPage ac;
    public Ex04_AddToCart_Page atc;



    public void objectMethod() throws IOException {

        ldp = new Ex01_LandingPage();
        ab = new Ex02_ShoppingPage();
        ac = new Ex03_WallStickersPage();
        atc = new Ex04_AddToCart_Page();
    }
 
@Given("Chrome is opened and AsianPaints app is opened")
public void chrome_is_opened_and_asian_paints_app_is_opened() throws Exception {
    objectMethod();
    Thread.sleep(5000);
    ldp.noThanksButton();
	ldp.laterButton();
	ldp.acceptCookiesButtonValidation();
    String actualtitle = ldp.validateLandinPageTitle();
    String expectedtitle = "Trusted Wall Painting, Home Painting & Waterproofing in India - Asian Paints"; 
    assertEquals(expectedtitle, actualtitle);
    System.out.println(actualtitle);
    captureScreenshot();
    Thread.sleep(5000);
    logger = report.createTest("test02");

    logger.log(Status.INFO, "Validating landing page title");



    String actualTitle = ldp.validateLandinPageTitle();

    String expectedTitle = "Trusted Wall Painting, Home Painting & Waterproofing in India - Asian Paints";
	 
    try {
    	assertEquals(actualTitle, expectedTitle);
        logger.log(Status.PASS, "Step1 is passed");
        System.out.println(actualTitle);
        assert true;
    } catch (AssertionError e) {
     e.printStackTrace();
        logger.log(Status.FAIL, "Step1 is failed");
        captureScreenshotOnFailure();
        assert false;
    }


}
@When("User clicks on Shop Section")
public void user_clicks_on_shop_section() throws IOException, InterruptedException {
    objectMethod();
    ldp.clickshop();
    Thread.sleep(5000);
    logger.log(Status.INFO, "User clicks on Shop Section");

}
@Then("User navigates on the Shop Page")
public void user_navigates_on_the_shop_page() throws IOException, InterruptedException {
    objectMethod();
    Thread.sleep(2000);
    String actualtitle = ldp.validateLandinPageTitle();
     String expectedtitle = "Wall Stickers, Home and Personal Hygiene, DIY, Mask and PPE, Wallpaper, Colour Selection & Mechanized Tools - Asian Paints Online-Shop";
     assertEquals(expectedtitle, actualtitle);
     System.out.println(actualtitle); 
     Thread.sleep(5000);
     ab.scrolldown();
     logger.log(Status.INFO, "User navigates on the Shop Page");
}
@Then("User clicks on Wallstickers")
public void user_clicks_on_wallstickers() throws IOException, InterruptedException {
    objectMethod();
    ab.clickWallsticker();
    Thread.sleep(5000);
    logger.log(Status.INFO, "User clicks on Wallstickers");
}
@Then("User navigates to the Wallstickers page")
public void user_navigates_to_the_wallstickers_page() throws IOException, InterruptedException {
     objectMethod();
     Thread.sleep(2000);
     String actualtitle = ac.validateLandinPageTitle();
     String expectedtitle = "Decorative Wall Stickers & Wall Decals For Home Walls - Asian Paints"; 
     assertEquals(expectedtitle, actualtitle);
     System.out.println(actualtitle); 
     Thread.sleep(5000);
     ab.scrolldown();
     logger.log(Status.INFO, "User navigates to the Wallstickers page");

}
@When("User clicks on sort by Field")
public void user_clicks_on_sort_by_field() throws IOException, InterruptedException {
    objectMethod();
    ac.scrolldown();
    ac.filter();
    Thread.sleep(2000);
    logger.log(Status.INFO, "User clicks on sort by Field");
}
@When("User selects Priority- Low to High")
public void user_selects_priority_low_to_high() throws IOException, InterruptedException {
    objectMethod();
    ac.lowhigh();
    Thread.sleep(2000);
    logger.log(Status.INFO, "User selects Priority- Low to High");

}
@Then("Application sorts the wall stickers list based on price")
public void application_sorts_the_wall_stickers_list_based_on_price() throws Exception {
    objectMethod();
    captureScreenshot();
    Thread.sleep(2000);
    logger.log(Status.INFO, "Application sorts the wall stickers list based on price");
    }
 
@Then("User clicks on any particular sticker")
public void user_clicks_on_any_particular_sticker() throws IOException, InterruptedException {
    objectMethod();
    atc.image();
    Thread.sleep(8000);
    logger.log(Status.INFO, "User clicks on any particular sticker");
 
}
@Then("User enters the pincode {string}")
public void user_enters_the_pincode(String pincode) throws IOException, InterruptedException {
	objectMethod();
	atc.scrolldown();
    atc.pincode_outline(pincode);
    Thread.sleep(1000);
    logger.log(Status.INFO, "User enters the pincode {string}");
}
@Then("Add to Cart button is successfully clicked")
public void add_to_cart_button_is_successfully_clicked() throws IOException, InterruptedException {
    objectMethod();
    atc.addToCart();
    Thread.sleep(3000);
    logger.log(Status.INFO, "Add to Cart button is successfully clicked");
}
@Then("Add to Cart button is unsuccessfully clicked")
public void add_to_cart_button_is_unsuccessfully_clicked() throws InterruptedException, IOException {
    objectMethod();
    atc.addToCart();
    Thread.sleep(3000);
    logger.log(Status.INFO, "Add to Cart button is unsuccessfully clicked");
}
 
}

