import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class BookStoreTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://qabookstorepage.ccbp.tech/");


        List<WebElement> readNowButtonList = driver.findElements(By.xpath("//div[@class='recommended-book-container d-flex flex-row']//button"));


        WebElement readNowButton = readNowButtonList.get(0);
        readNowButton.click();


        readNowButton = readNowButtonList.get(1);
        readNowButton.click();




    }
}
