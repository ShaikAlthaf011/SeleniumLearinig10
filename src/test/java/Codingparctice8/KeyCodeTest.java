package Codingparctice8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class KeyCodeTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qakeycode.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
        element.sendKeys("hello");
        List<WebElement> webelement=driver.findElements(By.xpath("//li[@class='mt-1 keycode-item']"));
        if(webelement.size()>0){
            System.out.println("Found Five Key Codes: "+webelement.size());
        }else{
            System.out.println("Mismatch in Key Code Count");
        }
        element.clear();
        WebElement element1=driver.findElement(By.xpath("//input[@type='text']"));
        element1.sendKeys("world");
        List<WebElement>element2=driver.findElements(By.xpath("//li[@class='mt-1 keycode-item']"));
        if(element2.size()>0){
            System.out.println("Found Ten Key Codes: "+element2.size());

        }else{
            System.out.println("Mismatch in Key Code Count");
        }
        driver.quit();
    }
}
