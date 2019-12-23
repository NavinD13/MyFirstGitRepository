package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondTest {
	WebDriver driver;
	
	
	@Given("Home page is opened")
	public void home_page_is_opened() {
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver", "C:\\Navin\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com");
	    	}

	@Given("signin page is Displayed")
	public void signin_page_is_Displayed() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.partialLinkText("Log")).click();
	    	}

	@When("I provide {string} and {string}")
	public void i_provide_and(String Login, String Password) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("Email")).sendKeys(Login);
		  driver.findElement(By.id("Password")).sendKeys(Password);
		
	    	}

	@Then("the relevant Login username is displayed")
	public void the_relevant_Login_username_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login Successful");
		driver.close();
	    	}

}
