package bank.methods;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class SeleniumOperations
{
	public static WebDriver driver =null;
	public static void browserLaunch(Object[]inputParameters)   // browserLaunch
	{try {
		String strBroserName=(String)inputParameters[0];
		String webDriverExePath=(String)inputParameters[1];
	if(strBroserName.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Support\\chromedriver.exe");
		     driver=new ChromeDriver();
		     driver.manage().window().maximize();		
	}
    else if	(strBroserName.equalsIgnoreCase("FF"))
    {
		System.setProperty("webdriver.gecko.driver", "C:\\Automation Support\\chromedriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	public static void openApplication(Object[]inputParameters)    //openApplication
	{try {
		String strUrl=(String)inputParameters[0];
		driver.get(strUrl);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 }
            catch(Exception e)
	    {
		System.out.print(e);
	    }
	}
	public static void sendkey(Object[]inputParameters)                //sendkey
	{try {
		String path=(String)inputParameters[0];
	    String value1=(String)inputParameters[1];
	    driver.findElement(By.xpath(path)).sendKeys(value1);
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
	}catch (Exception e) 
	  {
	     System.out.println(e);	
	   }
	}
	public static void click(Object[]inputParameters)  	                //click
	{try {
		String path1 =(String)inputParameters[0];
		driver.findElement(By.xpath(path1)).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	} catch(Exception e)
	  {
	     System.out.println(e);	
	   }
	}
	
	public static void selectdropdown(Object[]inputParameters)   	//dropdown
	{try {
		String path2=(String)inputParameters[0];
		String value3=(String)inputParameters[1];
		Select s =new Select(driver.findElement(By.xpath(path2)));
		s.selectByVisibleText("INDIA");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	catch (Exception e)
	{
		System.out.println(e);	
	}
	}
	
	
public static void validation(Object[]inputParameters)
{
	String path3=(String)inputParameters[0];
	String Value4=(String)inputParameters[1];
	WebElement web=driver.findElement(By.xpath(path3));
	String Value5=web.getText();
	try {
		
		if(Value4.equalsIgnoreCase(Value5))
		{
			System.out.println("Test case Pass");
		} else
		{
			System.out.println("Test case fail");
		}
		
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	
}
		
	}

	

