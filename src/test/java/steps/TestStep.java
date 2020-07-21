package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStep {

	public ChromeDriver driver;

	@Given("Open the chrome browser and load the url")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@And("Enter the username as (.*) and password as (.*)")
	public void Entercredit(String uname, String pass) {
		driver.findElementById("username").sendKeys(uname);
		driver.findElementById("password").sendKeys(pass);
	}

	@And("click the Login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();

	}

	@And("click the crmsfa Link")
	public void clickcrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();

	}

	@And("click the leads button")
	public void clickleadsbutton() {
		driver.findElementByLinkText("Leads").click();
	}

	@And("Click the create lead link")
	public void Clickcreatelead() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@And("Enter the company name as (.*)")
	public void Entercompanyname(String cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	}

	@And("Enter the Firstname as (.*)")
	public void EnterFirstname(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	}

	@And("Enter the Last name as (.*)")
	public void EnterLastname(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}

	@When("click on the create lead button")
	public void clickcreatelead() {
		driver.findElementByName("submitButton").click();
	}

	@Then("Verify the Lead creation")
	public void VerifyLeadcreation() {
		System.out.println("Lead Created Successfully");

	}

	@And("Click on Find Lead Link")
	public void ClickFindLead() {
		driver.findElementByLinkText("Find Leads").click();
	}
	
	@And("Enter the First Name as Dhivya")
	public void EnterFNameDhivya() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Dhivya");
	}

	@And("Enter the Last Name as Prabha")
	public void EnterLNameDhivya() {
		driver.findElementById("createLeadForm_lastName").sendKeys("Prabha");
	}
	
	@But("Verify the Error Message")
	public void VerifyErrorMessage() {
		System.out.println("Lead not created");
	}
	@And("Enter First Name as (.*)")
	public void ClickEmail(String fname) {
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(fname);

	}

	@And("Click on Find Button")
	public void ClickFindButton() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
	}

	@And("Store the leadID of First record")
	public String StoreFirstrecord() {
		String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		return leadID;
	}

	@And("Select the Record")
	public void SelectRecord() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}

	@When("Click on Delete Button")
	public void ClickDeleteButton() {
		driver.findElementByLinkText("Delete").click();
	}


/*	@And("Enter the LeadID")
	public void EnterLeadID(String leadID) {
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
	}
*/


}
