package amazonSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class amazonSteps1 {
	WebDriver driver= null;

	@Given("^i launch google chrome browser$")
	public void i_launch_google_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@When("i open the amazon homepage")
	public void i_open_the_amazon_homepage() {
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
	    
	}
	@Then("^give the \"(.*)\" and \"(.*)\"$")
	public void give_the_and(String email, String password) {
		driver.findElement(By.id("ap_email")).sendKeys(email+ Keys.ENTER);
		driver.findElement(By.id("ap_password")).sendKeys(password);
		
	    
	}
	@Then("click on loginbtn")
	public void click_on_loginbtn() throws InterruptedException {
	    driver.findElement(By.id("auth-signin-button")).click();
	    Thread.sleep(3000);
	}
	
	@Then("click on the orders")
	public void click_on_thr_orders() {
		driver.findElement(By.xpath("//a[@id='nav-orders']")).click();
	}




}
