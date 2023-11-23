import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WebdriverCommands2 {



    public static void main(String[] args) {

        System.setProperty("webdriver.driver.chrome", ".//drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("ta1")).sendKeys("I got job in good company");
        String parentWindow=driver.getWindowHandle();
        driver.findElement(By.linkText("Blogger")).click();
        Set<String> allWindows=driver.getWindowHandles();

        Iterator<String> itr = allWindows.iterator();
        while(itr.hasNext()) {

            String childWindows = itr.next();
            driver.switchTo().window(childWindows);
            if (driver.getTitle().equals("Blogger.com - Create a unique and beautiful blog easily.")) {
                driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
                break;
            }
        }


            driver.switchTo().window(parentWindow );

                driver.findElement(By.xpath("//*[@name='userid']")).sendKeys("Dhanalakshmi");
                driver.findElement(By.xpath("//*[@name='pswrd']")).sendKeys("abcdef@123");

            }
        }





