package step_def;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

 
@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:target/cucumber", "json:target/cucumber.json"}, features={"src/test/java/Annotation"})
 
public class AppTest {
	
}