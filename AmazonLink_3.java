package SeleniumSession;
import java.util.List;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLink_3 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> listamaz1 = driver.findElements(By.xpath("//*[@id=\"navFooter\"]/div[5]/table//a"));
		try{
			for(WebElement e:listamaz1) {
			System.out.println(e.getText());
			if(e.getText().contains("Audible")) {
				e.click();
			}
			}
		}
			catch (Exception e2) {
				// TODO: handle exception
			}
		}
}


		