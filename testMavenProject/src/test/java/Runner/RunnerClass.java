package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="features/DataTableWithExamples.feature",
glue= {"stepDefinations"},
plugin={"pretty","html:target/testOutput"},
monochrome=true)

public class RunnerClass
{
	

}
