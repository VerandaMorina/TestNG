package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CommonMethods {
    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(String URL, String browser) {
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(URL);
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void sendText(String text, WebElement element) {
        element.clear();
        element.sendKeys(text);
    }

    public static void selectOptionByVisibleText(WebElement element, String visibleText) {
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    public static void takeScreenshot(String fileName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenShot = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShot, new File(System.getProperty("user.dir") + "\\Files\\Screenshots\\" + fileName+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
