package stepDefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class regist {
	@Given("user is on registration page")
	public void user_is_on_registration_page() {
	   System.out.println("registration page");
	}

	@When("user enters following details")
	public void user_enters_following_details(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String,String>> userList=dataTable.asMaps(String.class,String.class);
	   // System.out.println(userList);
	    System.out.println(userList.get(0).get("firstname"));
	}	
	   
	

	@Then("user registration is sucessfull .")
	public void user_registration_is_sucessfull() {
	   System.out.println("registration is sucessfull");
	}
}
