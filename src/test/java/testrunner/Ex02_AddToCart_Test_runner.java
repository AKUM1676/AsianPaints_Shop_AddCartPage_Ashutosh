package testrunner;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

 

@CucumberOptions(
        features = {"src/test/resources/features/Ex02_AddToCart.feature"},
        glue = {"step_defination2", "apphooks"},
                 plugin= {"pretty" , 
                         "html:cucumber_report/cucumber",
                         "json:cucumber_report/cucumber.json",
                          "junit:cucumber_report/cucumber.xml"}

        )

 
public class Ex02_AddToCart_Test_runner extends AbstractTestNGCucumberTests {

	
}
