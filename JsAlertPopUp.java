package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);//pausing for 5secs for entire script execution
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
	    System.out.println(text);
	    alert.accept();//to click
	    //alert.dismiss();//to press escape the popup// or dismiss
	    
	    
		
		
		

	}

}
