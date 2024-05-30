package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class  demo {

	@Given("user should have login details")
	public void user_should_have_login_details() {
		
		System.out.println("Inside Step- user have the login details");
		throw new io.cucumber.java.PendingException();
	}

	@Given("present on login page")
	public void present_on_login_page() {
	
		System.out.println("Inside Step- user is on  login page");
		throw new io.cucumber.java.PendingException();
	}

	@When("user enter credentials")
	public void user_enter_credentials() {
		
		System.out.println("Inside Step- user enters the credentils");
		throw new io.cucumber.java.PendingException();
	}

	@When("enter valid username")
	public void enter_valid_username() {
		System.out.println("Inside Step- user enters valid username");
		throw new io.cucumber.java.PendingException();
	}

	@When("enter valid password")
	public void enter_valid_password() {
		System.out.println("Inside Step- user enters valid password");
				throw new io.cucumber.java.PendingException();
	}

	@Then("user is able to login")
	public void user_is_able_to_login() {
		System.out.println("Inside Step- user able to login");
		throw new io.cucumber.java.PendingException();
	}
	
	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() {
		
		System.out.println("Inside Step- user navigated to home page");

	}
}
