package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Steps {
	WebDriver driver;

	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers for selenium\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@When("I open OrangeHRM home page")
	public void i_open_orange_hrm_home_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("I verify the logo is displaying on the page")
	public void i_verify_the_logo_is_displaying_on_the_page() {
	boolean status=	 driver.findElement(By.xpath("//div[@id='divLogo']")).isDisplayed();
	Assert.assertEquals(true, status);
	}

	@When("I enter username and password")
	public void i_enter_username_and_password() {
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	@When("I enter username{string} and password {string}")
	public void i_enter_username_admin_and_password(String uname,String pwd) {
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	}


	@And("I click on login button")
	public void i_click_on_login_button() {
   driver.findElement(By.id("btnLogin")).click();
	}

	@Then("I must succefully login to dashboard page")
	public void i_must_succefully_login_to_dashboard_page() {
		String text = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
		Assert.assertEquals("Dashboard", text);
	}
	@Then("I will close the browser")
	public void i_will_close_the_browser() {
	    driver.quit();
	}
	    

	

	
	
}
