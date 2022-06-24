package cucumber2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="google.feature", glue= {"cucumber"})
public class Demo2 {
	
 
}
