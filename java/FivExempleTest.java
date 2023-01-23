import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.sql.DriverManager.getDriver;

public class FivExempleTest {

    public class  FivExempl extends FivExempleTest{

        @Test
        void myActiontest() throws InterruptedException {
            new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.saucedemo.com"));
            Assertions.assertTrue(getDriver().getTitle().contains("Магазин"), "Поле Username\" заполнено");

            Actions search = new Actions(getDriver());

            search.click(getDriver().findElement(By.xpath(".//input[@id='user-name']")))
                    .pause(1000l)
                    .sendKeys(getDriver().findElement(By.cssSelector(".//input[@id='password']")))
                    .pause(1000l)
                    .click(getDriver().findElement(By.cssSelector(".//input[@id='login-button']")))
                    .pause(1000l)
                    .build()
                    .perform();

            Thread.sleep(1000);
        }


    }
}
