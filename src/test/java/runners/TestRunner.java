
package runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\ddevalekar\\Documents\\Practice_Self\\BDDPractice1\\BDDFramework1\\src\\test\\resources\\FunctionalTest",
 glue= {"stepDefinitions"}
 )
public class TestRunner {

}
