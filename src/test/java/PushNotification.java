import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PushNotification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions option=new ChromeOptions();
        option.addArguments("--disable-notification");

        WebDriver driver=new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://www.justdial.com/");
    }}
