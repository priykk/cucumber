package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

	WebDriver driver = null;

	@Given("user is on login page and user should have valid credentials")

	public void user_is_on_login_page_and_user_should_have_valid_credentials() throws InterruptedException {

		System.out.println("Inside Step- Browser is open");


		System.setProperty("webdriver.edgedriver", "C:\\Users\\pagl\\eclipse-workspace\\CucumberJavaProject\\src\\main\\resources\\drivers\\msedge");


		WebDriver driver = new EdgeDriver();


		driver.manage().window().maximize();

		Thread.sleep(200);
		
	
//what is paramerterisation 
		//is the process where we add variables and then we take the values from variables 
		
		//data driven testing 
		//the test is run for multiple sets of data
		//i.e feature file will run multiple sets of data the data we provided in csv file called data drivesn testing
		
		

	}
// without paramerterization hard coded values of user name and password 
	
	
	//When("user enters valid username and password")
	//public void user_enters_valid_username_and_password()throws InterruptedException {

	
		//driver.findElement(By.name("username")).sendKeys("abc");
		//Thread.sleep(2000);
		//driver.findElement(By.name("password")).sendKeys("12345");
		//Thread.sleep(2000);

// with parameterization ( where we can run our feature file with multiple sets of data )
	// we have added (.*) because it can accept anything i.e user name and passowrd and we  pass our parameters 
	
	@When("user enters valid (.*) and (.*)")
	public void user_enters_valid_username_and_password(String username,String password)
			throws InterruptedException {

	
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);


	}

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException {
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
	}

	@Then("user navigated to the home page")
	public void user_navigated_to_the_home_page() throws InterruptedException {
		driver.findElement(By.className("title")).isDisplayed();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
	
	

}
