package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ContactsStepDefinition {
	/*WebDriver driver;
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

	@Then("^user enters \"(.*)\" and user enters \"(.*)\"$")
	public void user_enters_username_and_user_enters_password(String uname,String pass){
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pass);	   
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
	
	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() {
		driver.switchTo().frame("mainpanel");
		Actions act =new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	}

	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details_and_and(String fname, String lname, String position) {
		driver.findElement(By.id("first_name")).sendKeys(fname);
		driver.findElement(By.id("surname")).sendKeys(lname);
		driver.findElement(By.id("company_position")).sendKeys(position);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).sendKeys(fname);
	}*/

}
