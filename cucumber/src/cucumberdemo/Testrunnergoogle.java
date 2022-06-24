package cucumberdemo;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="TestDemo.feature" ,glue= {"stepdev"},monochrome = true)//,glue= {"stepdev"}

public class Testrunnergoogle 
{


}
