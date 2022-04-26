package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Add1 {
	int num1, num2, sum;
	@Given("input {int} and {int}")
	public void input_and(int a, int b) {
       num1 = a;
       num2 = b;
	}
	
	@When("calc a + b")
	public void calc_a_b() {
       sum = num1+num2;
	}
	
	@Then("validate the {int}")
	public void print_the_result(int expResult) {
      System.out.println("The Sum of a+b is : " + sum);
      Assert.assertEquals(sum, expResult);
	}

}
