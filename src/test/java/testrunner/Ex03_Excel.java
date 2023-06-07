package testrunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

 

@CucumberOptions(
        features = {"src/test/resources/features/Ex03_AddToCart_Excel.feature"},
        glue = {"excel_stepdefinitions", "apphooks"},
                 plugin= {"pretty" ,
                         "html:cucumber_report/cucumbercucumber",
                         "json:cucumber_report/cucumber.json",
                          "junit:cucumber_report/cucumber.xml"}

        )

public class Ex03_Excel extends AbstractTestNGCucumberTests {

}
