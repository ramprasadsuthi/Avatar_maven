package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calc {

	int a,b,result;
	
	@Given("Read a and b")
	public void read_a_and_b() {
	  a=100;
	  b=20;
	}
	
	@When("Add a + b")
	public void add_a_b() {
	  result = a+b;
	}
	
	@Then("Display the Result")
	public void display_the_result() {
	 System.out.println("The Result is : " + result);
	}
	
	@When("Mulitiply a * b")
	public void mulitiply_a_b() {
	   result = a*b;
	}
	
	@When("Subtract a - b")
	public void subtract_a_b() {
	   result = a-b;
	}
	
	@When("Div of a / b")
	public void div_a_b() {
	   result = a/b;
	}
	
}
