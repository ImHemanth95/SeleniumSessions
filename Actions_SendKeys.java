package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_SendKeys {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		By email_ID = By.id("input-email");
		By pass = By.id("input-password");
		By loginbutton = By.xpath("//input[@type='submit']");
//		WebElement email= driver.findElement(email_ID);
//		WebElement passwrd = driver.findElement(pass);
//		WebElement login_button = driver.findElement(loginbutton);
//		
//		Actions act = new Actions(driver);
//		act.sendKeys(email, "test").perform();
//		act.sendKeys(passwrd, "TEST1").perform();
//		act.click(login_button).perform();
		doactionsbySendKeys(email_ID,"TEST@gmail.com");
		doactionsbySendKeys(pass,"TEST@123");
		doActionClick(loginbutton);
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doactionsbySendKeys(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	public static void doActionClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}

}
