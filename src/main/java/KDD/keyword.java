
package KDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;
import io.github.bonigarcia.wdm.WebDriverManager;

public class keyword {
	public static WebDriver driver;

	public static Logger log = Logger.getLogger(keyword.class);

	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	public static void launchUrl() {

		driver.get("https://www.wayfair.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
}
	public static void minWait() {
		WebDriverWait wait = new WebDriverWait(driver, 50); // Explicite wait

	}

}
