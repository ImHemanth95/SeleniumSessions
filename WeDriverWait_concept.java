package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WeDriverWait_concept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		By username = By.name("username");
		By password = By.name("password");
		By Loginbutton = By.name("//input[@value='Login']");
		
		//webdriver wait
		//until will be implemented in fluent class
		//An expectation for checking that an element is present on the DOM of a page.
		//This does not necessarily mean that the element is visible.(Presence of elemements)
		
		WebDriverWait wait = new WebDriverWait(driver,8);
		WebElement user = wait.until(ExpectedConditions.presenceOfElementLocated(username));
		user.sendKeys("groupautomation");
		
		driver.findElement(password).sendKeys("Test@12345");
		driver.findElement(Loginbutton).click();
		}
	//If present then it will click, it may work as it can be present or not present
	public static WebElement waitForElementPresent(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	//it will wait untill the element is present or not., once the element is visible then only it will locate and perform the actions
	public static WebElement waitForElementVisibleWithElement(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
		}
}
