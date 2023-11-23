import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrogandDrop {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/p/page3.html");
        WebElement minLabel=driver.findElement(By.xpath("//a[@aria-labelledby= 'price-min-label']"));
        Actions act=new Actions(driver);
        act.dragAndDropBy(minLabel,100,0).perform();
    }
}
