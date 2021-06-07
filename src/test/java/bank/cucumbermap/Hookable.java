package bank.cucumbermap;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookable 
{
 @Before
 public void before(Scenario scenario)
 {
	 System.out.println("-------------Start of Scenario----------");
	 
 }
@After
public void after(Scenario scenrios)

{
	System.out.println("-------------end of Scenario----------");	
	
}



}
