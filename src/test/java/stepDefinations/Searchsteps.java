package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchsteps {
	@Given("Search field in Amazon web site is open")
	public void search_field_in_amazon_web_site_is_open() {
		System.out.println("Step 1 : i am on search page");
	    
	}

	@When("product name {string} is typed in  product name and price {int} in price field and search now button is clicked")
	public void product_name_is_typed_in_product_name_and_price_in_price_field_and_search_now_button_is_clicked(String string, Integer int1) {
		System.out.println("Step 2: Search the product with name:"+string+"and price:"+int1); 
	    
	}

	@Then("Product with  {string} should be displayed")
	public void product_with_should_be_displayed(String string) {
		System.out.println("Step 3 :Product"+string+"is displayed");
	   
	}


}
