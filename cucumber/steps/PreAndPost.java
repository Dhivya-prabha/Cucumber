package hooks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import steps.BaseClass;

public class PreAndPost extends BaseClass{
	int i =1;
	
	@Before
	public void launch() {
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--disable-save-password-bubble");
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-popup-blocking");			
		options.addArguments("--guest");

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@After
	public void close() {
		driver.close();
	}


	@BeforeStep
	public void report() {
		System.out.println("Going to run a step");
	}
	@AfterStep
	public void takeSnap() throws IOException {
		File file = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./images/snap"+(i++)+".jpg"));

	}

}
