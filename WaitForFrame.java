package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForFrame {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://192.168.10.4:8007/");
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("profile"));
		//driver.switchTo().frame("profile");
		//waitForFrameAndSwitchToIT_ID_NAME("profile",15);
		//By frame = By.name("profile");
		//waitForFrameAndSwitchToIT_ID_NAME("profile",15);
		
		driver.findElement(By.xpath("//input[@id='txt-UserName']")).sendKeys("superuser");
		String text = driver.findElement(By.xpath("//input[@id='txt-UserName']")).getAttribute("username");
		System.out.println(text);
		driver.findElement(By.xpath("//input[@id='txt-Password']")).sendKeys("General19");
		driver.findElement(By.xpath("//button[@id='btn-login']")).click();
		
		}
	    public static void waitForFrameAndSwitchToIT_ID_NAME(String idORName,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idORName));
	}
	    public static void waitForFrameAndSwitchToITELE(WebElement frameElement ,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
}
