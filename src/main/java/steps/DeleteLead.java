package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteLead extends Baseclass{
	public static String leadID;
	@And("click on find leads")
	public void ClickOnFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
	}

//	@And("click on the phone")
//	public void clickOnThePhone() {
//		driver.findElementByXPath("//span[text()='Phone']").click();
//
//	}

//	@Given("Enter the Phone number as (.*)")
//	public void enterPhoneNumberAs(String phno) {
//		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phno);
//	}

	//@When("click on Find Leads button")
	//public void clickonFindLeadsbutton() throws InterruptedException {
		//driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Thread.sleep(2000);
	//}

	@And("click on the First Resulting Lead")
	public void clickontheFirstResultingLead() {
		leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		System.out.println(leadID);
	}

	@And("click on Delete")
	public void clickOnDelete() throws InterruptedException {
		driver.findElementByLinkText("Delete").click(); 
		Thread.sleep(2000);
	}

	@And("click on find leads again")
	public void clickonfindleadsagain() {
		driver.findElementByLinkText("Find Leads").click();
	}
	@Given("Enter lead id")
public void Enterleadid() {
		
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
	}
	@When("click on find leads button again")
	public void clickonfindleadsbuttonagain() throws InterruptedException
	{
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);

	}

	@Then("no record is displayed")
	public void noRecordIsDisplayed() {
		String text = driver.findElementByClassName("x-paging-info").getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}

	}

}
