package stepDifinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver;
	@Given("I am on Home page")
	public void i_am_on_Home_page() {
		System.out.println("User is on Home page of Testmeapp");
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/login");
	}

	@When("user eneter username and password")
	public void user_eneter_username_and_password() {
	    driver.findElement(By.id("username")).sendKeys("tomsmith");
	    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	    driver.findElement(By.className("radius")).click();
	}

	@Then("login successfully")
	public void login_successfully() {
	   System.out.println("Logged in succesfully");
	   driver.close();
	}

}
