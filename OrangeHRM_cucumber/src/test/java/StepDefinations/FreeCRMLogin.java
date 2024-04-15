package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class FreeCRMLogin {

	WebDriver driver = null;

	@Given("Browser is Open")
	public void browser_is_open() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path" + projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();
	}

	@And("user enters URL")
	public void user_enters_url() {
		driver.get("https://freecrm.com/");
	}

	@And("User clicks on Login Tab")
	public void user_clicks_on_login_tab() {
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
	}

	@And("User enters Username and Password")
	public void user_enters_username_and_password() {
		WebElement email = driver.findElement(By.name("email"));
		email.click();
		email.sendKeys("shahrukh.sufiyaan12@gmail.com");

		WebElement password = driver.findElement(By.name("password"));
		password.click();
		password.sendKeys("12@Qwaszx");
	}

	@And("User clicks on LoginButton")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	}

	@Then("User navigated to dashboard")
	public void user_navigated_to_dashboard() {
	}

	@And("User clicks on SettingIcon")
	public void user_clicks_on_setting_icon() {
		driver.findElement(By.xpath("//div[@id='ui']/div/div/div/div/div/div/i")).click();
	}

	@And("User clicks LogOut")
	public void user_clicks_log_out() {
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
	}

	@Then("User naviggated to LoginPage")
	public void user_naviggated_to_login_page() {
	}

	@And("Close the Browser")
	public void close_the_browser() {
		driver.close();
		driver.quit();
	}

}
