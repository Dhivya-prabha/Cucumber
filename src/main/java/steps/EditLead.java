package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditLead extends Baseclass {
	@Given("click on Find Leads")
	public void ClickOnFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
	}

	@Given("click on Phone")
	public void clickOnPhone() {
		driver.findElementByXPath("//span[text()='Phone']").click();

	}

	@Given("Enter phone number as (.*)")
	public void enterPhoneNumberAs(String phno) {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phno);
	}

	@When("click on Find Leads button")
	public void clickOnFindLeads() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
	}

	@When("click on First Resulting Lead")
	public void clickOnFirstResultingLead() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}
	@When("click on Edit")
	public void clickOnEdit() throws InterruptedException {
		driver.findElementByLinkText("Edit").click();
		Thread.sleep(2000);
	}

	@Given("update company name as (.*)")
	public void updateCompanyNameAs(String compname) throws InterruptedException {
		driver.findElementById("updateLeadForm_companyName").clear();

		driver.findElementById("updateLeadForm_companyName").sendKeys(compname);
		Thread.sleep(2000);
	}

	@When("click on Submit")
	public void clickOnSubmit(){
		driver.findElementByName("submitButton").click();
	}

	@Then("company name is updated")
	public void companyNameIsUpdated() {
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(text);


	}

}
