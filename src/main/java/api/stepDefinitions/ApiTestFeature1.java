package api.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import static org.junit.Assert.*;

public class ApiTestFeature1 {
	
	String actualResult="";
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("ApiStep : This is a given condition for api");
	}
	
	@When("I complete action")
	public void i_complete_action() {
		System.out.println("ApiStep :This is a when condition for api");
	}
	
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("ApiStep :This is a then condition for api");
	}
	
	@Given("Write a step with {string}")
	public void writeStepWithName(String name) {
		System.out.println("ApiStep : Hi, I am "+ name );
	}
	
	@When("Check for the {int} in step")
	public void checkMarks(int marks) {
		if(marks >= 70)
			actualResult = "Pass";
		else
			actualResult = "Fail";
	}
	
	@Then("Verify the {string} in step {int}")
	public void verifyResult(String expectedResult, int marks) {
		if(actualResult.equals("Pass")) {
			System.out.println("ApiStep : I am passed with " + marks + "%");
			Assert.assertEquals(actualResult, expectedResult);

		}
		else {
			System.out.println("ApiStep : I am failed with " + marks + "%");
			Assert.assertEquals(actualResult, expectedResult);
		}
	}
	
	
}
