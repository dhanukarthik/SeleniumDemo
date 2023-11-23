import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseandKeyboardAction {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        WebElement menu=driver.findElement(By.id("blogsmenu"));
        Actions action=new Actions(driver);
        action.moveToElement(menu).perform();
        driver.findElement(By.xpath("//span[contains(text(),'SeleniumOneByArun')]")).click();
    }
}
