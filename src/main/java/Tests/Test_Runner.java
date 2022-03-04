package Tests;

import Functionality.Register_Class;
import Helpers.JavaScriptExecutor;
import Helpers.Take_Screenshot;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_Runner {

    private WebDriver driver =Setup.Setup_Class.startBrowserOfChoice("http://www.kurtosys.com/", "chrome");
    Register_Class register_class=new Register_Class(driver);
    Take_Screenshot screenshot=new Take_Screenshot();

    @Test(description = "Register With Errors")
    public void Register_With_Errors_Test() throws InterruptedException {
        register_class.Select_White_Paper();
        register_class.Select_UCITS_White_Paper();
        register_class.Enter_First_Name("Ntuthuko");
        register_class.Enter_Last_Name("Ntshakala");
        register_class.Enter_Company("Testing PTY LTD");
        register_class.Industry("Banking");
        register_class.Click_Send_Me_A_Copy();
        screenshot.takeSnapShot(driver,"Email Errors");
        register_class.Check_And_Print_Error();
    }
}
