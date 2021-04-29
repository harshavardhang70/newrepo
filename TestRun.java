package Testrunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;



@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",glue={"Testrunner"})

//@CucumberOptions(format= {"pretty","html:target/cucumber-html-report"},tags={"@LoginTest"})
public class TestRun {

}
