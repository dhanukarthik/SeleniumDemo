import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DriverSetup {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver",".//drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.dentalcare.com/en-us");
        driver.manage().window().maximize();
        List<WebElement> linkText=driver.findElements(By.tagName("a"));

        for(WebElement links:linkText){
            String list=links.getText();
            System.out.println(list);
        }



    }
}
