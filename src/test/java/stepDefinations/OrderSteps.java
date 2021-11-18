package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {

	@Given("a registered user exists")
	public void a_registered_user_exists() {
	    System.out.println("registered user");
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("login page");
	}

	@Then("user enter user name")
	public void user_enter_user_name() {
		System.out.println("enter user name"); 
	}

	@Then("user enter password")
	public void user_enter_password() {
		System.out.println("enter password ");
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		System.out.println("click on login button");
	}

	@Then("user navigates to order page")
	public void user_navigates_to_order_page() {
		System.out.println("order page");
	}

	@When("user click on order link")
	public void user_click_on_order_link() {
		System.out.println("click on order link");
	}

	@Then("user checks previous order details")
	public void user_checks_previous_order_details() {
		System.out.println("checks previous order details");
	}

	@When("when user click on open order details link")
	public void when_user_click_on_open_order_details_link() {
		System.out.println("click on open order details link");
	}

	@Then("user checks open order details")
	public void user_checks_open_order_details() {
		System.out.println("open order details");
	}

	@When("user clicks on cancelled order details link")
	public void user_clicks_on_cancelled_order_details_link() {
		System.out.println("clicks on cancelled order details link");
	}

	@Then("user checks cancelled order details")
	public void user_checks_cancelled_order_details() {
		System.out.println("checks cancelled order details");
	}

}
