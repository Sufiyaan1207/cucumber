package StepDefinations;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import PageObject.NewCustomerPage;
import PageObject.nopLoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class nopStepDef {

	public WebDriver driver;
	public nopLoginPage loginPage;
	public NewCustomerPage AddNewCustomerPg;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		loginPage = new nopLoginPage(driver);
		AddNewCustomerPg = new NewCustomerPage(driver);
			
	}

	@When("User opens the URL {string}")
	public void user_opens_the_url(String url) {
		driver.get(url);
		// log.info("url opened");

	}

	//////////////Login feature ////////////////////////////////////
	
	@When("User enters the  Email as {string} and Password as {string}")
	public void user_enters_the_email_as_and_password_as(String emailadd, String password) {
		//loginPage.enterEmail(emailadd);
		//loginPage.enterPassword(password);
		// log.info("email address and password entered");

		
	}

	@When("Click on the Login")
	public void click_on_the_loginbutton() {
		loginPage.clickOnLoginButton();
		// log.info("Clicked on login button");
	}

	@Then("Page Title should be same {string}")
	public void page_title_should_be_same(String expectedTitle) {
		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			// log.warn("Test passed: Login feature :Page title matched.");
			Assert.assertTrue(true);// pass
		} else {
			Assert.assertTrue(false);// fail
			// log.warn("Test Failed: Login feature- page title not matched.");
		}
	}

	@When("User click on the Log out link")
	public void user_click_on_the_log_out_link() {
		loginPage.clickOnLogOutButton();
		// log.info("user clicked on logout link.");
	}

/*	@Then("browser gets close")
	public void browser_gets_close() {
		driver.close();
		// log.info("Browser closed");
		driver.quit();
	}*/

	//////////////////////////////////////// ADD NEW CUSTOMER////////////////////////////////////////

	@Then("User can view Dashboad")
	public void user_can_view_dashboad() {
		String actualTitle = AddNewCustomerPg.getPageTitle();
		String expectedTitle = "Dashboard / nopCommerce administration";

		if (actualTitle.equals(expectedTitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@When("User click on customers Menu")
	public void user_click_on_customers_menu() {
		AddNewCustomerPg.clickOnCustomersMenu();
	}

	@When("click on customers Menu Item")
	public void click_on_customers_menu_item() {
		AddNewCustomerPg.clickOnCustomersMenuItem();
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
		AddNewCustomerPg.clickOnAddnew();
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
		String actualTitle = AddNewCustomerPg.getPageTitle();
		String expectedTitle = "Add a new customer / nopCommerce administration";

		if (actualTitle.equals(expectedTitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Then("User enter email")
	public void user_enter_email() {
		AddNewCustomerPg.enterEmail("abc@xyz.com");
	}

	@Then("User enter password")
	public void user_enter_password() {
		AddNewCustomerPg.enterPassword("test123");
	}

	@Then("user enter first name")
	public void user_enter_first_name() {
		AddNewCustomerPg.enterFirstName("Test");
	}

	@Then("user enter last name")
	public void user_enter_last_name() {
		AddNewCustomerPg.enterLastName("demo");
	}

	@Then("click on Save button")
	public void click_on_save_button() {
		AddNewCustomerPg.clickOnSave();
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String expectedConfirmationMsg) {

		String bodyTagText = driver.findElement(By.tagName("Body")).getText();
		if(bodyTagText.contains(expectedConfirmationMsg))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@Then("close browser")
	public void close_browser() {

	}

}
