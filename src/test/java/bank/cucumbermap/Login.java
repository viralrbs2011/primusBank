package bank.cucumbermap;

import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login
{
	
	@When("^user opens \"([^\"]*)\" browser with exe \"([^\"]*)\"$")
	public void user_opens_browser_with_exe(String bname, String exe) throws Throwable
	{
		Object[]input=new Object[2];    // browserLaunch
	    input[0]=bname;
	    input[1]=exe;
	    SeleniumOperations.browserLaunch(input); 
	}

	@When("^user enters url \"([^\"]*)\"$")
	public void user_enters_url(String url) throws Throwable
	{
		 Object[]input1=new Object[1];     //openApplication   
		   input1[0]=url;
		   SeleniumOperations.openApplication(input1);
	}

	@When("^user enters\"([^\"]*)\" as username$")
	public void user_enters_as_username(String uname) throws Throwable
	{
		  Object[]input2=new Object[2];     //Username  
		   input2[0]="//*[@id='txtuId']";
		   input2[1]=uname;
		   SeleniumOperations.sendkey(input2);
	}

	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String password) throws Throwable
	{Object[]input3 =new Object[2];        //password  
	   input3[0]="//*[@name='txtPword']";
	   input3[1]=password;
	   SeleniumOperations.sendkey(input3);
	   
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable
	{ Object[]input4=new Object[1];          //click 
	   input4[0]="//*[@name='login']";
	   SeleniumOperations.click(input4);
	   
	}
	
	@Then("^aaplication navigate on \"([^\"]*)\" page$")
	public void aaplication_navigate_on_page(String Admin) throws Throwable 
	{
		Object[]input10=new Object[2];
		   input10[0]="//*[text()='Admin']";
		   input10[1]="Admin";
		   SeleniumOperations.validation(input10);	
	}

	
}


