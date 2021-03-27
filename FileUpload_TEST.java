package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_TEST {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://formstone.it/components/upload/");
		driver.manage().window().maximize();
		driver.getTitle();
		//fileupload
		driver.findElement(By.xpath("//div[@class='upload fs-upload-element fs-upload fs-light']")).sendKeys("C:\\Users\\TINYCAMS\\Pictures\\surf.jpg");
		
	}

}
