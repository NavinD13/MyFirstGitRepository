package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstTest {
	
	
	
	
	WebDriver driver;
	
	
	
	@Given("The user is on TestMeApp home page")
	public void the_user_is_on_TestMeApp_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Navin\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");

	}

	@When("The user gives valid login and valid password")
	public void the_user_gives_valid_login_and_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
	   	}

	@Then("User should see the next page")
	public void user_should_see_the_next_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login Successful");
		driver.close();
	   	}

}
