package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead extends Baseclass{
	@When("click on CreateLeads")
	public void clickOnCreateLeads() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@Given("Enter the company name as (.*)")
	public void enterTheCompanyNameAs(String compname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(compname);
		
	}

	@Given("Enter first name as (.*)")
	public void enterFirstNameAs(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);	}

	@Given("Enter last name as (.*)")
	public void enterLastNameAs(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}

	@When("click on submit")
	public void clickOnSubmit() {
		driver.findElementByName("submitButton").click();

	    	}

	@Then("lead gets created")
	public void leadGetsCreated() {
	  System.out.println("Lead gets created");
	}

}
