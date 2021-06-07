package bank.cucumbermap;

import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search
{
	@When("^user click on Branches$")
	public void user_click_on_Branches() throws Throwable 
	{
		Object[]input5=new Object[1];             //click            
		   input5[0]="//*[@src='images/Branches_but.jpg']";
		   SeleniumOperations.click(input5); 
	}
	
	@When("^user select Country \"([^\"]*)\" as Country$")
	public void user_select_Country_as_Country(String Country) throws Throwable
	{
		Object[]input6=new Object[2];                 //drop down
	   input6[0]="//*[@name='lst_countryS']";
	   input6[1]= Country;
	   SeleniumOperations.sendkey(input6);
	 
	}

	@When("^user select State \"([^\"]*)\" as state$")
	public void user_select_State_as_state(String State) throws Throwable
	{  
		Object[]input7=new Object[2];
	   input7[0]="//*[@id='lst_stateS']";         //select state
	   input7[1]= State;
	   SeleniumOperations.sendkey(input7);
	 
	}

	@When("^user select City \"([^\"]*)\" as city$")
	public void user_select_City_as_city(String City) throws Throwable
	{
		   Object[]input8=new Object[2];
		   input8[0]="//*[@id='lst_cityS']";        //select city
		   input8[1]= City;
		   SeleniumOperations.sendkey(input8);
	}

	@When("^user click on Search button$")
	public void user_click_on_Search_button() throws Throwable
	{
		   Object[]input9=new Object[1];               //click on search
		   input9[0]="//*[@id='btn_search']";
		   SeleniumOperations.click(input9);
		   
	   
	}

	@Then("^application navatigate for \"([^\"]*)\" page$")
	public void application_navatigate_for_page(String arg1) throws Throwable
	{
		Object[]input11=new Object[2];
		   input11[0]="//*[@id='lab19']";   //get text Branch Details
		   input11[1]="Branch Details";
		   SeleniumOperations.validation(input11);
	
	}
	
	
}
