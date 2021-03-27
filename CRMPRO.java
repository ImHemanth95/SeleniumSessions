package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMPRO {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://crmpro.com/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
//		String xpath = "//a[text()='Devisha Sharma']/parent::td/preceding-sibling::td/input[@type='checkbox']";
//		driver.findElement(By.xpath(xpath)).click();
		getContact("Devisha Sharma");
		String cmpname = getCompanyName("Devisha Sharma");
		System.out.println("Your company name="+cmpname);
		String phone = getPhoneNumber("Devisha Sharma");
		System.out.println("Your phone number="+phone);
		String email = getEmail("Devisha Sharma");
		System.out.println("Your email is="+email);
		driver.getCurrentUrl();
		driver.quit();
	}
	public static void getContact(String name) {
		String xpath = "//a[text()='"+name+"']/parent::td/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();
	}
	public static String getCompanyName(String name) {
		String xpath = "//a[text()='"+name+"']/parent::td/following-sibling::td/a";
		return driver.findElement(By.xpath(xpath)).getText();
	
	}
	public static String getPhoneNumber(String name) {
		String xpath = "//a[text()='"+name+"']/parent::td/following-sibling::td/span";
		return driver.findElement(By.xpath(xpath)).getText();
	}
	public static String getEmail(String name) {
		String xpath = "(//a[text()='"+name+"']/parent::td/following-sibling::td/a)[2]";
		return driver.findElement(By.xpath(xpath)).getText();
	}
}
