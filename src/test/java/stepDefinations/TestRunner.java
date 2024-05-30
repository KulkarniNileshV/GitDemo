package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"stepDefinations"}, strict=true,monochrome=true,
plugin= {"html:target/cucumber-html-reports"}
		)
public class TestRunner {

}
