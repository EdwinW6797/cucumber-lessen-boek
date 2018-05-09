package Tests;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class capture {
	
	@Given("^the flight (\\w+) is leaving today$")
	public void FlightIsLeavingToday(String vluchtnr) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println(vluchtnr);
		
	}


}
