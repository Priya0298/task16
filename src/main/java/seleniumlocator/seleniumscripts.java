package seleniumlocator;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumscripts {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.gecko.driver","C:\\Users\\Dell\\Downloads\\geckodriver-v0.34.0-win64.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();;

	}

}
