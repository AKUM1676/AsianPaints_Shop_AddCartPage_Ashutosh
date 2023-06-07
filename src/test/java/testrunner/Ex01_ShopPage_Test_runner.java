package testrunner;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

 

@CucumberOptions(
        features = {"src/test/resources/features/Ex01_ShopPage.feature"},
        glue = {"step_defination1", "apphooks"},
                 plugin= {"pretty" ,
                         "html:cucumber_report/cucumbercucumber",
                         "json:cucumber_report/cucumber.json",
                          "junit:cucumber_report/cucumber.xml"}

        )


public class Ex01_ShopPage_Test_runner extends AbstractTestNGCucumberTests {

	
}
