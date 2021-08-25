package TodayProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClose {
    public static void main(String[] args)  throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromdriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement link=driver.findElement(By.linkText("Click Here"));
        link.click();
        driver.close();
        Thread.sleep(5000);
        driver.quit();
    }


}
