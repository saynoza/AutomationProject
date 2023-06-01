package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class AddItemsToCart {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoblaze.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        List<WebElement> items = driver.findElements(By.xpath("//a[@class='hrefch']"));

                items.get(0).click();

                WebElement addToCartBtn = driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']"));
                addToCartBtn.click();
                Thread.sleep(2000);
                Alert alert = driver.switchTo().alert();
                alert.accept();
                Thread.sleep(2000);
                driver.navigate().to("https://demoblaze.com/");
                 Thread.sleep(2000);
                items = driver.findElements(By.xpath("//a[@class='hrefch']"));
                items.get(1).click();
                addToCartBtn = driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']"));
                addToCartBtn.click();
        Thread.sleep(2000);
                alert = driver.switchTo().alert();
                alert.accept();

                WebElement cartLink = driver.findElement(By.xpath("//a[text()='Cart']"));
                cartLink.click();
                Thread.sleep(3000);

                List <WebElement> cartItems = driver.findElements(By.xpath("//tr[@class='success']/td[2]"));
                for(WebElement item : cartItems){
                    System.out.println(item.getText());
                }
                driver.quit();





    }
}
