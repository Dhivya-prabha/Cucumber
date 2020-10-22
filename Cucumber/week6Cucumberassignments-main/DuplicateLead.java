package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DuplicateLead extends Baseclass {
	@Given("select Find Leads")
	public void selectFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
	}
//	@And("click on Phone")
//	public void clickOnPhone() {
//		driver.findElementByXPath("//span[text()='Phone']").click();
//
//	}

//	@Given("Enter phone number as (.*)")
//	public void enterPhoneNumberAs(String phno) {
//		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phno);
//	}



	//@When("click on first resulting lead")
	//public void clickOnFirstResultingLead() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
	//}

	@When("click on Duplicate Lead")
	public void clickOnDuplicateLead() {
		driver.findElementByLinkText("Duplicate Lead").click();
	}

	@When("click on Submit button")
	public void clickOnSubmitButton() {
		driver.findElementByName("submitButton").click();
		}

	@Then("name gets duplicated")
	public void nameGetsDuplicated() {
		System.out.println("Duplicated");
	}

}
