import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by Joe on 5/11/2017.
 */

public class Main {
    public static void main(String[] args){
        //if you didn't update the Path system variable to add the full directory path to the executable as above mentioned then doing this directly through code
        System.setProperty("webdriver.chrome.driver", "C:/Users/Joe/IdeaProjects/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.wikipedia.org/");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e){}
        WebElement link = webDriver.findElement(By.id("js-link-box-en"));
        link.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e){}
        WebElement search = webDriver.findElement(By.id("searchInput"));
        search.sendKeys("Byte");
        search.submit();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e){}
        webDriver.quit();
    }


}
