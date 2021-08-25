package TodayProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocTest {

public static WebDriver driver;
     public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("file:///C:/Users/Dell/Desktop/index.html");
        //WebElement link = driver.findElement(By.tagName("a"));
        //WebElement link = driver.findElement(By.id("fb"));
       //WebElement link =  driver.findElement(By.name("facebook"));
        //WebElement link =  driver.findElement(By.className("fblogin"));
       // WebElement link =  driver.findElement(By.linkText("Click here to login facebook"));
       // WebElement link =  driver.findElement(By.partialLinkText("Click here to "));
       // WebElement link =  driver.findElement(By.partialLinkText(" to login facebook"));
        WebElement pass = driver.findElement(By.cssSelector("input[type=['password']"));
        pass.sendKeys("sonu");


    }
    }
