import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");

        WebElement textbox = driver.findElement(By.id("textbox1"));
        //1.clear command used to clear the text available in the text box or text area
        textbox.clear();

        //2.sendkeys Used to enter the text in text box and text area fields
        textbox.sendKeys("dhanu");

        //3.click command used to click the different UI elements like button,link,check box and radio button etc
        WebElement checkbox = driver.findElement(By.id("alert1"));
        checkbox.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //4.getText Used to retrieve the element text
        WebElement text = driver.findElement(By.id("pah"));
        System.out.println("text value is" + text.getText());

        //5.getAtribute command used to retrieve the value stored in
        // the specified attribute value of the html element

        String search = driver.findElement(By.xpath("//input[@value='Search']")).getAttribute("value");
        System.out.println("attribute value is" + search);

        //6.isDisplayed used to verify the element is displayed or not
        WebElement button = driver.findElement(By.id("but2"));
        System.out.println("verify the element is displayed or not" + button.isDisplayed());

        //7.isEnabled used to verify the element is enabled or not
        System.out.println("Verify the element is enabled or not" + button.isEnabled());

        //8.isSelected used to verify the element is selected or not
        WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
        System.out.println("Verify the element is selected or not" + checkbox1.isSelected());

        //9.getAtribute command used to retrieve the value stored in
        // the specified attribute value of the html element
        driver.findElement(By.className("gsc-search-button")).getAttribute("value");

        driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.id("input-email")).sendKeys("Dhanalakshmi");
        driver.findElement(By.id("input-password")).sendKeys("dhanu@123");
        //10.submit() is used to submit the form
        driver.findElement(By.xpath("//*[@type='submit']")).submit();
        driver.navigate().to("http://omayo.blogspot.com/");
        //11.getTagName() command used to get the html tag of the provided element
        String tagname = driver.findElement(By.xpath("//*[@cols='30']")).getTagName();
        System.out.println("Tagname is " + tagname);

        //12.getCssValue() command used to find  the css value of the element
        String cssValue = driver.findElement(By.id("prompt")).getCssValue("background-color");
        System.out.println("Css value of the element is" + cssValue);
        //13.getSize() command used to find the width and height of the element
        Dimension dimension = driver.findElement(By.xpath("//*[text()='Login']")).getSize();
        System.out.println("Element size is " + dimension.height);
        System.out.println("Element size is " + dimension.width);
    }
}