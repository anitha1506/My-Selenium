package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;
//https://www.youtube.com/watch?v=4e9vhX7ZuCw
@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features", 
		glue="stepDefinitions", 
		dryRun = false, 
		monochrome=true,
		plugin= {"html:target/cucumber-html-reports"}
)
public class Runner {

}
