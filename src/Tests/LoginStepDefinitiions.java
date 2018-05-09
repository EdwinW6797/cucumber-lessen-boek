package Tests;

import static org.junit.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;
import junit.framework.Assert;
//import junit.framework.Assert;


public class LoginStepDefinitiions {

	WebDriver driver = null;
	
	@Given("^User (?:navigates to|launches|is on) (http.*com)$")
	public void NavigateTo(String url) throws Throwable {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);

	}

	@When("^User clicks on login link$")
	public void user_clicks_on_myaccount_link() throws Throwable {

			WebElement MyAccountLink = driver.findElement(By.className("ico-login"));
			MyAccountLink.click();

	}

	@And("^user logs in using valid username (.*) and password (.*)$")
	public void LoginDemoQA (String userName, String password) throws Throwable {

			WebElement LoginField = driver.findElement(By.id("Email"));
	//		LoginField.click(); 
			LoginField.sendKeys(userName);

			WebElement PasswordField = driver.findElement(By.id("Password"));
			PasswordField.sendKeys(password);
	//		PasswordField.sendKeys(Keys.RETURN);
			
			WebElement LoginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
			LoginButton.click();
			

			
	}

	@Then("^user is taken to the myaccount page$")
	public void user_is_taken_to_the_myaccount_page() throws Throwable {
		WebElement logoutButton = null;
		try
		{
			logoutButton = driver.findElement(By.className("ico-logout"));
		}
		catch(Exception exp)
		{
			System.out.println("Not able to find element. Not logged in!!");
	
		}
		
		assertNotNull("Logout button is not available", logoutButton);
	
	}
	
	@Then("^User navigates to apparel page$")
	public void user_navigates_to_apparel_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement AparelLink = driver.findElement(By.linkText("Apparel & Shoes"));
		AparelLink.click();


	}

	@Then("^User clicks on the Blue Jeans Add to cart button$")
	public void user_clicks_on_the_Blue_Jeans_Add_to_cart_button() throws Throwable {

		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")).click();
	//	driver.findElement(By.xpath("//img[contains(@src,’Profile’)]")).click();
	//	BlueJeansLink.click();
		
	//	WebElement BlueJeansAddToCart = driver.findElement(By.id("add-to-cart-button-36"));
	//	WebElement BlueJeansAddToCart = driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']"));
	//	BlueJeansAddToCart.click();
		
	}

	@Then("^One blue jeans is added to the cart$")
	public void one_blue_jeans_is_added_to_the_cart() throws Throwable {

		String expectedMessage = "(4)";
		
		String CartInhoud = driver.findElement(By.className("cart-qty")).getText();

		assertEquals(CartInhoud, expectedMessage);
		
		
		
		
		
	}

	private void assertEquals(String cartInhoud, String expectedMessage) {
		// TODO Auto-generated method stub
		
	}


}
