package Codingparctice8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BlogPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qabloglist.ccbp.tech/");
        driver.manage().window().maximize();
        List<WebElement> element=driver.findElements(By.xpath("//li[@class='blog-item']"));
        if(element.size()>0){
            System.out.println("5 Blog Items: "+element.size());
        }else{
            System.out.println("Mismatch in Blog Item Count");
        }
        List<WebElement> element1=driver.findElements(By.xpath("//h1[@class='blog-title']"));
        if(element1.size()>0) {
            System.out.println("5 Blog Titles Found: " + element1.size());
        }else{
            System.out.println("Mismatch in Blog Title Count");
        }
        List<WebElement> element2=driver.findElements(By.xpath("//p[@class='blog-description']"));
        if(element2.size()>0) {
            System.out.println("5 Blog Descriptions Found: " + element2.size());
        }else{
            System.out.println("Mismatch in Blog Description Count");
        }
        driver.quit();
    }

}
