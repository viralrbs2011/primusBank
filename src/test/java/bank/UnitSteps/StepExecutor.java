package bank.UnitSteps;

import bank.methods.SeleniumOperations;

public class StepExecutor {

	public static void main(String[] args) 
	{
		Object[]input=new Object[2];    // browserLaunch
	    input[0]="Chrome";
	    input[1]="C:\\Automation Support\\chromedriver.exe";
	    SeleniumOperations.browserLaunch(input);
	
	   Object[]input1=new Object[1];     //openApplication   
	   input1[0]="http://primusbank.qedgetech.com/";
	   SeleniumOperations.openApplication(input1);
	   
	   Object[]input2=new Object[2];     //Username  
	   input2[0]="//*[@id='txtuId']";
	   input2[1]= "Admin";
	   SeleniumOperations.sendkey(input2);
	   
	   Object[]input3 =new Object[2];        //password  
	   input3[0]="//*[@name='txtPword']";
	   input3[1]="Admin";
	   SeleniumOperations.sendkey(input3);
	   
	   Object[]input4=new Object[1];          //click 
	   input4[0]="//*[@name='login']";
	   SeleniumOperations.click(input4);
	   
	   Object[]input5=new Object[1];             //click            
	   input5[0]="//*[@src='images/Branches_but.jpg']";
	   SeleniumOperations.click(input5);
	   
	   Object[]input6=new Object[2];                 //drop down
	   input6[0]="//*[@name='lst_countryS']";
	   input6[1]= "INDIA";
	   SeleniumOperations.sendkey(input6);
	   
	   Object[]input7=new Object[2];
	   input7[0]="//*[@id='lst_stateS']";         //select state
	   input7[1]= "Delhi";
	   SeleniumOperations.sendkey(input7);
	   
	   Object[]input8=new Object[2];
	   input8[0]="//*[@id='lst_cityS']";        //select city
	   input8[1]= "Delhi";
	   SeleniumOperations.sendkey(input8);
	   
	   Object[]input9=new Object[1];               //click on search
	   input9[0]="//*[@id='btn_search']";
	   SeleniumOperations.click(input9);
	   
	   Object[]input10=new Object[2];
	   input10[0]="//*[text()='Admin']";   //get text Admin
	   input10[1]="Admin";
	   SeleniumOperations.validation(input10);
	   
	   
	   Object[]input11=new Object[2];
	   input11[0]="//*[@id='lab19']";   //get text Branch Details
	   input11[1]="Branch Details";
	   SeleniumOperations.validation(input11);
	   
	}}
