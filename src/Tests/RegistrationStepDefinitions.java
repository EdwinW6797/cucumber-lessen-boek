package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.xml.internal.xsom.impl.scd.Iterators.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

	
public class RegistrationStepDefinitions {

	WebDriver driver = new FirefoxDriver();

@Given("^User goes to demoqa\\.com/registration$")
public void GotoRegistrationPage() throws Throwable {
	driver.get("http://www.demoqa.com/registration/");

}

@When("^user fills in the given details in the registration form$")
public void FillTheForm(DataTable testData) throws Throwable {

	java.util.Map<String, String> testDataAsMap = testData.asMap(String.class, String.class);
	
//	List<String> testDataAsList =  testData.asList(String.class);
//	System.out.println(testDataAsList.toString());
	
	driver.findElement(By.id("name_3_firstname")).sendKeys(testDataAsMap.get("FirstName"));
	driver.findElement(By.id("name_3_lastname")).sendKeys(testDataAsMap.get("LastName"));
	driver.findElement(By.id("phone_9")).sendKeys(testDataAsMap.get("PhoneNumber"));
	driver.findElement(By.id("username")).sendKeys(testDataAsMap.get("UserName"));

	System.out.println(testDataAsMap.toString());

	
}	


}
