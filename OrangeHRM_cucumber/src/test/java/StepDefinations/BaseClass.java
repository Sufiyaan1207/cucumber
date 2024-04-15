package StepDefinations;

import java.time.Duration;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	WebDriver driver = null;



	public String generateWord() {

		return(RandomStringUtils.randomAlphabetic(3));

	}
}
