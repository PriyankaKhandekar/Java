package LaunchBrowser;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pushkraj\\eclipse-workspace\\ChromeDriverEXE\\chromedriver_win32\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		List<String> all = new ArrayList<>();
		String[] linklists = new String[allLinks.size()];
		
		for(WebElement k:allLinks)
		{
			all.add(k.getText());
			System.out.println(all);
		}System.out.println(all.size());

	}

}
