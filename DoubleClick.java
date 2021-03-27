package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
//		Actions act = new Actions(driver);
//		act.doubleClick(driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"))).perform();
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//	    System.out.println(text);
//	    alert.accept();
		WebElement mylocator = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		doubleclicknow(mylocator);
		driver.quit();
		}
	public static void doubleclicknow(WebElement mylocator) {
		Actions act = new Actions(driver);
		act.doubleClick((mylocator)).perform();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
	    System.out.println(text);
	    alert.accept();
		
	}
	}
