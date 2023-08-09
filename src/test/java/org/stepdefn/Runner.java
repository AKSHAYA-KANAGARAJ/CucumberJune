package org.stepdefn;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = "org.stepdefn", monochrome = true, tags = "~@Akshaya", plugin = "html:target")
public class Runner {

}
