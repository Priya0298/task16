package seleniumlocator;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wikipediasearch {
    public static void main(String[] args) {
        // Set path to ChromeDriver executable
        System.setProperty("Webdriver.gecko.driver","C:\\Users\\Dell\\Downloads\\geckodriver-v0.34.0-win64.exe");

     
		// Create Chrome driver instance
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Maximize the browser window
        WebDriver driver1 = new FirefoxDriver();

        // Navigate to Wikipedia
        driver1.get("https://www.wikipedia.org/");

        // Find the search input field and enter the query
        WebElement searchInput = driver1.findElement(By.name("search"));
        searchInput.sendKeys("Artificial Intelligence");
        searchInput.submit();

        // Wait for search results to load
        try {
            Thread.sleep(2000); // Adjust this wait time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click on the "History" section link
        WebElement historyLink = driver1.findElement(By.linkText("History"));
        historyLink.click();

        // Get and print the title of the section
        WebElement sectionTitle = driver1.findElement(By.id("firstHeading"));
        System.out.println("Title of the History section: " + sectionTitle.getText());

        // Close the browser
        driver1.quit();
    }
}
