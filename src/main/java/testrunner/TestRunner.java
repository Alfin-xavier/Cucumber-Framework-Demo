package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepdefinitions.Steps;


@RunWith(value = Cucumber.class)				
@CucumberOptions(features="Features",glue={"StepDefinition"})	
public class TestRunner 
{

						
}