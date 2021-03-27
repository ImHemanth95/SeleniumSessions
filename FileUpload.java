package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		//as the upload file we need to use this sendkeys instead of click;
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\TINYCAMS\\Documents\\NEW.txt");
		driver.findElement(By.name("note")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		}
	}
