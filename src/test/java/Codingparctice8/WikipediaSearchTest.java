package Codingparctice8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WikipediaSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qawikisearch.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el1=driver.findElement(By.xpath("//input[@id='searchInput']"));
        el1.sendKeys("HTML");
        driver.findElement(By.xpath("//button[@id='submitButton']")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='searchResults']")));
        List<WebElement> element1=driver.findElements(By.xpath("//div[@class='result-item']"));
        if(element1.size()>0){
            System.out.println("Results Found: "+element1.size());
        }
        driver.quit();
    }
}

