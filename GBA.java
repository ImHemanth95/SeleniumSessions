package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GBA {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://192.168.10.4:8007/");
		driver.manage().window().maximize();
		driver.switchTo().frame("profile");
		driver.findElement(By.xpath("//input[@id='txt-UserName']")).sendKeys("superuser");
		String text = driver.findElement(By.xpath("//input[@id='txt-UserName']")).getAttribute("username");
		System.out.println(text);
		
		driver.findElement(By.xpath("//input[@id='txt-Password']")).sendKeys("General19");
		driver.findElement(By.xpath("//button[@id='btn-login']")).click();
		String geturl = driver.getCurrentUrl();
		System.out.println(geturl);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("profile");
		//driver.findElement(By.xpath("//span[@id='spnEmpExpense']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sales')]")).click();
		}
}
