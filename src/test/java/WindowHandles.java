import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {

    static WebDriver driver;
    static Set<String> childWindows;

    public  static void childWindows(String title){
        Iterator<String> itr=childWindows.iterator();
        while(itr.hasNext()){

            String popupWindow=itr.next();
            driver.switchTo().window(popupWindow);

            if(driver.getTitle().equals(title)){
                break;
            }

        }


       }


    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chrome",".//drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("ta1")).sendKeys("I god good offer in product base company");
        driver.findElement(By.linkText("Blogger")).click();
        String parentWindow= driver.getWindowHandle();
        childWindows=driver.getWindowHandles();
        childWindows("Blogger.com - Create a unique and beautiful blog easily.");
        driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
        driver.switchTo().window(parentWindow);
        driver.findElement(By.name("userid")).sendKeys("Dhanalakshmi");
        driver.findElement(By.name("pswrd")).sendKeys("abcdef@123");

    }
 }
