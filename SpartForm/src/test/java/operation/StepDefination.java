package operation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefination {
	
	@Given("the URL of application")
	public void the_url_of_application() {
	    System.out.println("Driver launched");
	}
	@Then("I enter {string}")
	public void i_enter(String string) throws InterruptedException {
	    Base.util.enterText(Base.pg.firstaName, "shubham");
	}
	@Then("I click submit button")
	public void i_click_submit_button() {
	    
	}

}
