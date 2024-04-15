package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*child class of baseclass*/
public class googleSearch extends BaseClass {

	@Before
	public void setup() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path" + projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		System.out.println("setup executed");
	}

	// Scenario1
	@Given("Browser is open")
	public void browser_is_open() {
	}

	@Given("user on search page")
	public void user_on_search_page() {
		driver.get("https://www.google.com");
		System.out.println("search page opened");
	}

	@When("user enters text in search")
	public void user_enters_text_in_search() {
		driver.findElement(By.id("APjFqb")).sendKeys(generateWord());
		System.out.println("text entered");
	}

	@When("hits Enter")
	public void hits_enter() {
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		System.out.println("enter button clicked");
	}

	@Then("user navigated to search result")
	public void user_navigated_to_search_result() {

	}

	@Then("User closes the browser")
	public void user_closes_the_browser() {
		driver.close();
		
	}

	@After
	public void teardown() {
		System.out.println("tear down success");
		driver.quit();
	}
	
	@BeforeStep
	public void beforeStepMethodDemo() {
		System.out.println("Before steps...");
	}
	
	@AfterStep
	public void afterStepMethodDemo() {
		System.out.println("After steps...");
	}

	// Scenario2
	@Given("User open Browser")
	public void user_open_browser() {
	}

	@Given("user start new search")
	public void user_start_new_search() {
		driver.get("https://www.google.com");
	}

	@When("user enters Random_word in search")
	public void user_enters_random_word_in_search() {
		driver.findElement(By.id("APjFqb")).sendKeys(generateWord());
	}

	@When("Hits Searchbutton")
	public void hits_searchbutton() {
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	}

	@Then("user navigated to search")
	public void user_navigated_to_search() {
		driver.getPageSource().contains("ASUS India");
	}
}
