package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features ="features/HeroKu.feature",
		glue = {"stepDifinition"},
		plugin = {"pretty",
				"json:JSONReport/cucumberdemo.json",
				"html:HTMLreport"
		}

		)

public class LoginRunner {

}
