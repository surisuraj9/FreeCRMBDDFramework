package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealStepDefinition {
	WebDriver driver;
	@Given("^user is available on login page$")
	public void user_is_available_on_login_page(){
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");	
	}

	@When("^tittle of login page is Free CRM$")
	public void tittle_of_login_page_is_Free_CRM(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer "
				+ "relationship management, sales, and support.", title);	   
	}


	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginBtn);	    
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page(){
		String homePageTitle = driver.getTitle();
		System.out.println("Home Page tittle is:"+homePageTitle);
		Assert.assertEquals(homePageTitle, "CRMPRO");
	}

	@Then("^close the browser$")
	public void close_the_brwoser(){
		driver.quit();
	}
	
	@Then("^user enters username and user enters password$")
	public void user_enters_username_and_user_enters_password(DataTable credentials){
		List<List<String>> data =credentials.raw();
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));	
	}

	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() {
		driver.switchTo().frame("mainpanel");
		Actions act =new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}

	/*@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable deal_data) {
		List<List<String>> dealvalues=deal_data.raw();
		driver.findElement(By.id("title")).sendKeys(dealvalues.get(0).get(0));
		driver.findElement(By.id("amount")).sendKeys(dealvalues.get(0).get(1));
		driver.findElement(By.id("probability")).sendKeys(dealvalues.get(0).get(2));
		driver.findElement(By.id("commission")).sendKeys(dealvalues.get(0).get(3));
	}*/
	
	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable deal_data) {
		for (Map<String, String> dealvalues : deal_data.asMaps(String.class, String.class)) {
			driver.findElement(By.id("title")).sendKeys(dealvalues.get("title"));
			driver.findElement(By.id("amount")).sendKeys(dealvalues.get("amount"));
			driver.findElement(By.id("probability")).sendKeys(dealvalues.get("probability"));
			driver.findElement(By.id("commission")).sendKeys(dealvalues.get("commission"));
		}
	}

}
