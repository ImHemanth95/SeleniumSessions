package SeleniumSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchDropDownValues {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		//driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]//li/a/span"));
		Thread.sleep(2000);
		
			selectElementbyText("//div[@class='ac_results']//ul//li","T-shirts > Faded Short Sleeve T-shirts");
		 
		Thread.sleep(8000);
		String Expected = driver.findElement(By.xpath("//div[@class='pb-center-column col-xs-12 col-sm-4']/h1")).getText();
		System.out.println("you have selected="+Expected);
		WebElement textpresent = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1"));
		if(textpresent.getText().equals("Faded Short Sleeve T-shirts")) {
			System.out.println("selected element is found="+Expected);
		}
		else {
			System.out.println("Selected element is not present");
			}
		}
	public static void selectElementbyText(String locator,String value){
		 List<WebElement> ele = driver.findElements(By.xpath(locator));
		 for(WebElement e:ele){
			 String text1 = e.getText();
			 System.out.println(text1);
			 if(text1.contains(value)) {
				e.click();
				break;
			}}
//		 for(int i=0; i<ele.size();i++) {
//			 System.out.println(ele.get(i).getText());
//			 if(ele.get(i).getText().contains(value)) {
//				 ele.get(i).click();
//			 }
//		 }

	}
	
}



