package seleniumlocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

    public static void main(String[] args) {
        // Set the path to your chromedriver
    
    	System.setProperty("Webdriver.chrome.driver","C:\\Users\\Dell\\eclipse\\chrome-win64.exe");
        
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize browser window
        driver.manage().window().maximize();
        
        // Navigate to DemoBlaze website
        driver.get("https://www.demoblaze.com");
        
        // Get the title of the page
        String pageTitle = driver.getTitle();
        
        // Verify if the title is "STORE"
        if (pageTitle.equals("STORE")) {
        	System.out.println(driver.getTitle());
            System.out.println("Page landed on correct website");
        } else {
        	System.out.println(driver.getTitle());
            System.out.println("Page not landed on correct website");
        }
        
        // Close the browser
        driver.quit();
    }
}
