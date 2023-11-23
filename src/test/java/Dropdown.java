import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        WebElement dropdown = driver.findElement(By.id("drop1"));
        Select dropdownList=new Select(dropdown);
        dropdownList.selectByIndex(3);

        List<WebElement> list=dropdownList.getOptions();
        for(WebElement drop:list){

            System.out.println(drop.getText());
        }


    }
}
