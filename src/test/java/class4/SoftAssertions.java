package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.CommonMethods;

public class SoftAssertions extends CommonMethods {
    //precondition



    @BeforeMethod(alwaysRun = true)
    public void OpenBrowserAndNavigate() {
        //    webdriver
        //login into syntax hrms
        //verify that dashboard is displayed
        //verify that the message "is welcome admin"


        openBrowserAndLaunchApplication("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22","chrome");
    }

    @AfterMethod(alwaysRun = true)
    public void closingBrowser() {
       driver.quit();
    }

    @Test(groups = "regression")
    public void verifyTheWelcomeMessage(){
//        /        send username
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");
//       send password
        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

//        click login
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

//      get the message
        WebElement welcomeMsg=driver.findElement(By.id("welcome"));


//      verify is displayed
        boolean isDisplayed=welcomeMsg.isDisplayed();
        SoftAssert soft= new SoftAssert();
        soft.assertTrue(isDisplayed);

//      verify the message is welcome admin
        String actualWelcomeText= welcomeMsg.getText();
        String expectedWelcomeText="Welcome Admin";
        soft.assertEquals(actualWelcomeText,expectedWelcomeText);

//      assert all the assertions has been made
        soft.assertAll();


    }

}
