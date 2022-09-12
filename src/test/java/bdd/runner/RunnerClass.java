package bdd.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= "D:\\EveningBatchJan22\\EveningBatchWorkspace\\TestBDD\\src\\test\\java\\packagefiles\\", 
		glue="D:\\EveningBatchJan22\\EveningBatchWorkspace\\TestBDD\\src\\test\\java\\bdd\\stepdeffiles\\")

public class RunnerClass extends AbstractTestNGCucumberTests{
	
	

}
