package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {
	WebDriver driver = null;

	//Scenario1: Admin Login
	@Given("Open the Browser")
	public void open_the_browser() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path" +projectPath);
		System.setProperty("webdriver.chrome.driver" , projectPath+ "/src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.manage().window().maximize();
	}

	@And("Enter Website")
	public void enter_website() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@And("Enter Admin Username")
	public void enter_admin_usrname() {
		driver.findElement(By.name("username")).sendKeys("Admin");
	}

	@And("Enter Admin Password")
	public void enter_admin_p_assword() {
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@And("Click on Login")
	public void click_on_login() {
		driver.findElement(By.xpath("//div/div/form/div/button")).click();
	}

	@Then("Admin Logs in")
	public void admin_logs_in() {
	}

	@And("Admin clicks PIM")
	public void admin_clicks_pim() {
		driver.findElement(By.xpath("//div/ul/li[2]/a/span")).click();
	}

	@Then("Navigated to PIM page")
	public void admin_navigated_to_pim_page() {
	}

	@And("Admin clicks ADD button")
	public void admin_clicks_add_button() {
		driver.findElement(By.xpath("//div/div[2]/div[1]/button[1]")).click();
	}

	@Then("Navigated to Add Employee Page")
	public void navigated_to_add_employee_page() {
	}

	@And("Enter First Name")
	public void enter_first_name() {
		driver.findElement(By.name("firstName")).sendKeys("dett");
	}

	@And("Enters Middle Name")
	public void enters_middle_name() {
		driver.findElement(By.name("middleName")).sendKeys("sfsd");
	}

	@And("Enters Last Name")
	public void enters_last_name() {
		driver.findElement(By.name("lastName")).sendKeys("vfsf");
	}

	@And("Clicks on Save")
	public void clicks_on_save() {
		driver.findElement(By.xpath("//div/form/div/button[2]")).click();

		driver.close();
	}

		

}