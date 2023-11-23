import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.findElement(By.name("firstname")).sendKeys("dhanalakshmi");
        Actions act=new Actions(driver);
        act.sendKeys(Keys.TAB).
                sendKeys("C N").
                sendKeys(Keys.TAB).
                sendKeys("dhanu.nagaraju@gmail.com").
                sendKeys(Keys.TAB).
                sendKeys("9867859775").
                sendKeys(Keys.TAB).
                sendKeys("dhanu0987").
                sendKeys(Keys.TAB).
                sendKeys("dhanu0987").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.SPACE).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).
                build().perform();
    }
}
