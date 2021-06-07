package bank.UnitSteps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TemptJava {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation Support\\chromedriver.exe");
	    ChromeDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
        driver.get("http://primusbank.qedgetech.com/");
        Thread.sleep(5000);
        driver.findElementByXPath("//*[@id='txtuId']").sendKeys("Admin");
        driver.findElementByXPath("//*[@name='txtPword']").sendKeys("Admin");
        driver.findElementByXPath("//*[@name='login']").click();
        driver.findElementByXPath("(//*[@face='Verdana'])[1]").getText();
        driver.findElementByXPath("//*[@src='images/Branches_but.jpg']").click();
        Select country = new Select(driver.findElementByXPath("//*[@name='lst_countryS']"));
        country.selectByVisibleText("INDIA");
       // country.selectByIndex(1);
        Select state =new Select(driver.findElementByXPath("//*[@id='lst_stateS']"));
        //state.selectByIndex(2);
        state.selectByVisibleText("Delhi");
       Select city =new Select (driver.findElementByXPath("//*[@id='lst_cityS']"));
        city.selectByVisibleText("Delhi");
        driver.findElementByXPath("//*[@id='btn_search']").click();
        driver.findElementByXPath("//*[@id='lab19']");
       
	}

}