
package runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\ddevalekar\\git\\TestingPractice2\\src\\test\\resources\\FunctionalTest",
 glue= {"stepDefinitions"}
 )
public class TestRunner {

}
