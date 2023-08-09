package org.stepdefn;

import java.util.List;
import java.util.Map;

import org.pagerepo.LoginPageRepository;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class JuneFBstepdefn {
	@Given("Open Facebook and launch")
	public void open_Facebook_and_launch() {
		//since driver is declared as static we are not extending the class we are directly calling it using classname.driver
		CommonMethods.driver.get("https://www.facebook.com");
		
	    
	}
	
	// we have to get values from page repository hence we create an object(we should not extend page repository)
	@When("Enter Username as {string} and Password as {string}")
	public void enter_Username_and_Password(String username, String password) throws InterruptedException {
		LoginPageRepository lpr = new LoginPageRepository();
		//lpr.getUsername().sendKeys("Akshaya");
		//lpr.getPassword().sendKeys("12345");
		
		lpr.getUsername().sendKeys(username);
		lpr.getPassword().sendKeys(password);
	   
	}
	// AS List
	/*@When("Enter data table values")
	public void dtbl(DataTable dt) throws InterruptedException {
		List<String> ls = dt.asList(); //it will add the given values in data table as a list
		System.out.println(ls.get(0));
		System.out.println(ls.get(1));
		System.out.println(ls.get(2));
		
	}*/
	
	//AS Lists
	/*@When("Enter data table values")
	public void dtbl(DataTable dt) throws InterruptedException {
		List<List<String>> ls = dt.asLists();// it will add multiple lists as a list
		System.out.println(ls.get(0));
		System.out.println(ls.get(1));
		System.out.println(ls.get(2));
		
		System.out.println(ls.get(0).get(2));
		System.out.println(ls.get(1).get(1));
		System.out.println(ls.get(2).get(0));
		}*/
	
	//AS Map
	/*@When("Enter data table values")
	public void dtbl(DataTable dt) throws InterruptedException {
		Map<Integer, String> mp = dt.asMap(Integer.class, String.class); //should give datatype.class of key and value
		System.out.println(mp.get(1));//get(key)
		System.out.println(mp.get(2));
		System.out.println(mp.get(3));
	}*/
	
	//AS Maps
	@When("Enter data table values")
	public void dtbl(DataTable dt) throws InterruptedException {
		List<Map<String, String>> lsm = dt.asMaps(); //should be in <String, String> format only
		//username and passwords both are keys
		System.out.println(lsm.get(0));
		System.out.println(lsm.get(1));
		System.out.println(lsm.get(2));
		
		System.out.println(lsm.get(0).get("Username"));
		System.out.println(lsm.get(0).get("Pwd"));
		System.out.println(lsm.get(1).get("Username"));
		System.out.println(lsm.get(1).get("Pwd"));
		System.out.println(lsm.get(2).get("Username"));
		System.out.println(lsm.get(2).get("Pwd"));
		
		
	}
	
	
	
	

	@Then("Close the browser")
	public void close_the_browser() {
	   System.out.println("This test is completed");
	}


}
