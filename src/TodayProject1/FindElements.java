package TodayProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromdriver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.navigate().to ("https://www.facebook.com/");
        WebElement forgetlink = driver.findElement(By.linkText("पासवर्ड भूल गए?"));
        forgetlink.click();
        List<WebElement> list = driver.findElements(By.tagName("a"));
        for (WebElement i : list)

              {

        System.out.println(i.getAttribute("href"));

        }
    }



}
