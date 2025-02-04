package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginMultiple {
	ChromeDriver driver;

	@Given("Open the Chrome Browser")
	public void open_the_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("Load the URL as {string}")
	public void load_the_URL_as(String url) {

		driver.get(url);
	}

	@Given("Enter username as (.*)$")
	public void enter_username_as(String uName) {
		WebElement username = driver.findElement(By.xpath("//input[@id = 'username']"));
		username.sendKeys(uName);
	}

	@Given("Enter password as (.*)$")
	public void enter_password_as(String password) {
		WebElement passWord = driver.findElement(By.xpath("//input[@id = 'password']"));
		passWord.sendKeys(password);
	}

	@When("Click on Login button")
	public void click_on_login_button() throws InterruptedException {
		WebElement login = driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']"));
		login.click();
		Thread.sleep(4000);
	}

	@When("HomePage should get displayed")
	public void home_page_should_loaded() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//a[text()[normalize-space() = 'CRM/SFA']]"));
		if (element.isDisplayed()) {
			System.out.println("expected done");
		}

	}
	
	@When("Verified Login Failed with error as (.*)$")
	public void Verified_Login_Failed_with_error_as(String errorMsg) throws InterruptedException {
		WebElement errElement = driver.findElement(By.xpath("(//div[@id='errorDiv']//p)[last()]"));
		if (errElement.isDisplayed()) {
			System.out.println("expected done");
		}

	}
	
}
