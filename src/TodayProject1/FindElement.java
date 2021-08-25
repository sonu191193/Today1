package TodayProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.linkText("पासवर्ड भूल गए?")).click();
    }


}