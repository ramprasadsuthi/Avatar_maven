package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test2 {
	
	int a,b,sum;
	
	@Given("Read a and b1")
	public void read_a_and_b1() {
	  a=200;
	  b=300;
	}
	
	@When("Add a and b")
	public void add_a_and_b() {
	   sum = a+b;
	}
	
	@Then("Display the Results")
	public void display_the_results() {
	   System.out.println("The sum of a+b is :" + sum);
	}

}
