import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) throws Exception {
        System.out.println("Selenium Testing");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        System.out.println("Browser testing: ");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.google.com");
            Thread.sleep(3000);
            String pageTitle = driver.getTitle();
            System.out.println("pagetitle: " + pageTitle);
        } finally {
            driver.quit();
            System.out.println("Browser tested");
        }
    }
}