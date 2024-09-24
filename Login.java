package steps;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
 public ChromeDriver driver;
 
	@Given("Open the Browser")
	public void open_the_Browser() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	}

	@Given("Load the URL")
	public void load_the_URL() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	

	@Given("Enter the username as <username> password as <password>")
	public void password_as_password(io.cucumber.datatable.DataTable dataTable) {
	   
		List<Map<String, String>>data = dataTable.asMaps();
		System.out.println(data.get(1).get("password"));
		List<List<String>> asLists = dataTable.asLists();
		System.out.println(asLists.get(1).get(0));
		System.out.println(data.get(1).get("username"));
	   
	}

	@When("click the Login")
	public void click_the_Login() {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Homepage is diplayed");
	}

	@When("click the CRMSFA")
	public void click_the_CRMSFA() {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println("Homepage is diplayed");
	}

	@Then("Home page will be loaded")
	public void home_page_will_be_loaded() {
	    // Write code here that turns the phrase above into concrete actions
//		String title = driver.getTitle();
//		if(title.equals("Leaftaps - TestLeaf Automation Platform"))
		System.out.println("Homepage is diplayed");
	}


}
