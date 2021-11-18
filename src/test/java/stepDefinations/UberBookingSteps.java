package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {
	@Given("User want to select car type {string} from uber app")
	public void user_want_to_select_car_type_from_uber_app(String string) {
	    System.out.println("1-Car Type"+string);
	}

	@When("user select car type {string} pickup point {string} drop off point {string}")
	public void user_select_car_type_pickup_point_drop_off_point(String string, String string2, String string3) {
		System.out.println("2 Pick up point-"+string2+"  drop off point-"+string3);
	}

	@Then("driver starts journey")
	public void driver_starts_journey() {
		System.out.println("3-joureny strated");
	}

	@Then("driver ends joureny")
	public void driver_ends_joureny() {
		System.out.println("4-joureny ended");
	}

	@Then("user pays {int} usd")
	public void user_pays_usd(Integer int1) {
		System.out.println("5 amount paid -"+int1);
	}

}
