package SeleniumSession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Actions_Class {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		driver.manage().window().maximize();
		doActionsMovetoele(By.className("menulink"));
		Thread.sleep(3000);
		
		//SelectByLinkText(content,"COURSES");
		//SelectByLinkText(content,"ARTICLES");
		doActionsMoveToElementAndClick(By.linkText("COURSES"));
		
		}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doActionsMovetoele(By locator) {
		Actions act  = new Actions(driver);
		act.moveToElement(getElement(locator)).perform();
	}
	public static void doActionsMoveToElementAndClick(By locator) {
//		doActionsMoveToElementAndClick(locator);
		
		//getElement(locator).click();
	}
	
//	public static void doActionsMoveToElement(WebElement locator, String text) throws InterruptedException {
//		Actions act = new Actions(driver);
//		act.moveToElement(locator).perform();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText(text)).click();
//		driver.getCurrentUrl();
//		driver.getTitle();
//		}
	}
