package Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Register_Class {

    private WebDriver driver;

    public Register_Class (WebDriver driver)
    {
        this.driver=driver;
    }

    public void Select_White_Paper() throws InterruptedException {
        TimeUnit.SECONDS.sleep(20);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//span[contains(.,'Resources')]"))).perform();
        WebElement option = driver.findElement(By.xpath("//span[contains(.,'White Papers & eBooks')]"));
        actions.moveToElement(option).perform();
        option.click();

    }
    public void Select_UCITS_White_Paper() throws InterruptedException {


        TimeUnit.SECONDS.sleep(5);
       WebElement UCITS = driver.findElement(By.xpath("//a[@href='https://www.kurtosys.com/white-papers/eu-rule-change-bolsters-need-for-fast-localized-fund-website-platforms-2/'][contains(.,'UCITS White Paper')]"));
       UCITS.click();
    }
    public void Enter_First_Name(String _fn) throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        driver.switchTo().frame(0);
            WebElement firstname=driver.findElement(By.id("18882_231669pi_18882_231669"));
            firstname.sendKeys(_fn);
    }
    public void Enter_Last_Name(String _ln)
    {
        WebElement lastname=driver.findElement(By.id("18882_231671pi_18882_231671"));
        lastname.sendKeys(_ln);
    }
    public void Enter_Company(String _cmp) throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        WebElement company=driver.findElement(By.id("18882_231675pi_18882_231675"));
        company.sendKeys(_cmp);
    }
    public void Industry(String _ind) throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        WebElement industry=driver.findElement(By.id("18882_231677pi_18882_231677"));
        industry.sendKeys(_ind);
    }
    public void Click_Send_Me_A_Copy() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        WebElement copy=driver.findElement(By.xpath("//p[2]/input"));
        copy.click();
    }
    public void Check_And_Print_Error()
    {
        WebElement error=driver.findElement(By.xpath("//form[@id='pardot-form']/p"));
        System.out.println(error.getText());
        Assert.assertTrue(error.isDisplayed());
    }
}
