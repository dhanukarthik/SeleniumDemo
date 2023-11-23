import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverCommands {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver",".//drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //1.get() used to open the specified URL's web page
        driver.get("http://omayo.blogspot.com/");

        //2.manage() command used to maximize the current web page
        driver.manage().window().maximize();

        //Used to minimize the current web page
        //driver.manage().window().minimize();

        driver.findElement(By.xpath("//input[@title='search' and @class='gsc-input']"));

        //3.getTitle() used to retrieve the title of the current webpage

        String title=driver.getTitle();
        System.out.println("Title of the webpage" + title);

        //4.getCurrentUrl() used to retrieve the  url of the  webpage
        String url= driver.getCurrentUrl();
        System.out.println("url of the current page" + url);

        //5.getPageSource() used to fetch the source of the webpage
        String pagesource= driver.getPageSource();
        System.out.println("Source code of the webpage" +pagesource);

        driver.findElement(By.id("selenium143")).click();

        //6.close() command used to close the current browser or active window
        //driver.close();

        //7.quit() command used to close the all the browser windows
        //driver.quit();

        //8.navigate() command used to perform the operation like

        //navigate to forward page
        driver.navigate().forward();
        // navigate back to previous page
        driver.navigate().back();
        //refreshing the current page
        driver.navigate().refresh();
        //navigate to the specified URL
        driver.navigate().to("http://selenium143.blogspot.com/");


    }
}


