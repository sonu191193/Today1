package TodayProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssUse {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("https://www.facebook.com/");
        driver.get("file:///C:/Users/Dell/Desktop/index.html");
        driver.manage().window().maximize();
        //driver.findElement(By.cssSelector("input[id=email]")).sendKeys("SONU");
        //driver.findElement(By.cssSelector("input#email")).sendKeys("SONU");
        //driver.findElement(By.cssSelector("input.inputtext._58mg._5dba._2ph-")).sendKeys("SONU");
        WebElement pass = driver.findElement(By.xpath("/html/body/input[2]"));
        pass.sendKeys("SONU");

    }
    }


