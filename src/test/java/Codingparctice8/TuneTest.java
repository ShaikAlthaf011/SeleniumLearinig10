package Codingparctice8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TuneTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qatunes.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el1=driver.findElement(By.xpath("//select[@id='genre']"));
        Select sc=new Select(el1);
        sc.selectByValue("pop");
        driver.findElement(By.xpath("//button[@id='getButton']")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ol[@id='songsList']")));
        List<WebElement> element=driver.findElements(By.xpath("//li[@class='song-title']"));
      if(element.size()>0){
          System.out.println("Songs Displayed");
      }

        sc.selectByValue("rock");
        driver.findElement(By.xpath("//button[@id='getButton']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ol[@id='songsList']")));
        List<WebElement> element2=driver.findElements(By.xpath("//li[@class='song-title']"));
       if(element2.size()>0){
           System.out.println("Songs Displayed");
       }
       driver.quit();
    }
}
