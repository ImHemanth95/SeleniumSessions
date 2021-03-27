package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricBuzzDotCom {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/sri-lanka-tour-of-west-indies-2020-21-1252062/west-indies-vs-sri-lanka-1st-test-1252073/full-scorecard");
		driver.manage().window().maximize();
		
		System.out.println(getWicketKeeperName("Nkrumah Bonner"));
		System.out.println(getWicketKeeperName("Kraigg Brathwaite"));
		List<String> scorelistofPlayer = getPlayerScoreCard("Kraigg Brathwaite");
		System.out.println(scorelistofPlayer);

		}
	public static String getWicketKeeperName(String playername) {
		String xpath = "//a[contains(text(),'"+playername+"')]//parent::td//following-sibling::td/span";
	    return driver.findElement(By.xpath(xpath)).getText();
	}
	public static List<String> getPlayerScoreCard(String playername) {
		List<String> scorevaluelist = new ArrayList<String>();
		List<WebElement> listofele = driver.findElements(By.xpath("//a[contains(text(),'"+playername+"')]//parent::td//following-sibling::td"));
		for(int i=1;i<listofele.size();i++) {
			String score = listofele.get(i).getText();
			if(!score.isEmpty()) {
				scorevaluelist.add(score);
			}
			
		}
		return scorevaluelist;
	}
}
/* String playernamexpath = "//a[contains(text(),'"+name+"')]//parent::td/a";
		String nameofplayer = driver.findElement(By.xpath(playernamexpath)).getText();
		System.out.println(nameofplayer);
		String PlayerStatusxpath = "//a[contains(text(),'"+name+"+')]//parent::td//following-sibling::td";
		String playerstatus = driver.findElement(By.xpath(PlayerStatusxpath)).getText();
		System.out.println(playerstatus);
 */
