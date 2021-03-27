package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitAlertPopup {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.name("proceed")).click();
		//wait for alert
		WebDriverWait wait = new WebDriverWait(driver,10);
		Alert alert =wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();
	}
	public static Alert waitForAlertPresent(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	public String getAlertText(int timeout) {
		return waitForAlertPresent(timeout).getText();
	}
	public void acceptAlert(int timeout) {
		waitForAlertPresent(timeout);
	}
	public void dismissAlert(int timeout) {
		waitForAlertPresent(timeout).dismiss();
	}
	

}
