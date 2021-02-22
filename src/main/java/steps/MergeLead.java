package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class MergeLead extends Baseclass {
	public String leadID;
	@Given("click on Merge Leads")
	public void clickOnMergeLeads() {
		driver.findElementByLinkText("Merge Leads").click();

	}

	@Given("click on the lookup")
	public void clickOnTheLookup() {
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	}
	@And("Enter Merge Lead first name as (.*)")
	public void EnterMergeLeadfirstnameas(String fname) throws InterruptedException {
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(fname);

	}
	@And ("click on Merge Find Leads button")
	public void clickonMergefindleadsbutton() throws InterruptedException{
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);

	}


	
	@Given("click on the first resulting lead")
	public void clickOnTheFirstResultingLead() {
		leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);

		driver.switchTo().window(allhandles.get(0));
	}

	@Given("click on the lookup again")
	public void clickOnTheLookupAgain() {
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
	}

	@Given("Enter the first name again as (.*)")
	public void enterThefirstNameagainAs(String Fname) throws InterruptedException {
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(Fname);
		Thread.sleep(2000);
	}

	@Given("click on Merge Find Leads button again")
	public void clickOnMergeFindLeadsButtonAgain() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
	}

	@Given("click on the first resulting lead again")
	public void clickOnTheFirstResultingLeadAgain() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<>(allWindows2);

		driver.switchTo().window(allhandles2.get(0));

	}

	@Given("click on Merge")
	public void clickOnMerge() {
		driver.findElementByXPath("//a[text()='Merge']").click();

	}

	@Given("click on Ok in the alert")
	public void clickOnOkInTheAlert() {
		driver.switchTo().alert().accept();
	}
	@Given ("Enter Lead id")
	public void EnterLeadid() {
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
	}
	}



