import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysFunction {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
       WebElement link= driver.findElement(By.xpath("//a[contains(text(),'compendiumdev')]"));
        Actions act=new Actions(driver);
        act.keyDown(Keys.CONTROL).moveToElement(link).click().keyUp(Keys.CONTROL).build().perform();
    }

}
