package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googlesearch {
	WebDriver driver = null;


	@Given("Browser is open")
	public void browser_is_open() {

		System.out.println("Inside Step- Browser is open");

		//String projectPath =System.getProperty("user.dir");
		//System.out.println("Prject Path is : "+projectPath);

		System.setProperty("webdriver.edgedriver", "C:\\Users\\pagl\\eclipse-workspace\\CucumberJavaProject\\src\\main\\resources\\drivers\\msedge");


		WebDriver driver = new EdgeDriver();

		
		driver.manage().window().maximize();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.setOut(null);
		driver.quit();
		System.out.println("Executiong is comeplete on windows os ");


		throw new io.cucumber.java.PendingException();
	}

	@And("user present on google search page")
	public void user_present_on_google_search_page() {
		System.out.println("Inside Step- user is present on google search page");
		
		driver.navigate().to("https://www.google.com/");

		throw new io.cucumber.java.PendingException();
	}

	@When("user enter text in serach box")
	public void user_enter_text_in_serach_box() {
		
		System.out.println("Inside Step- user enters search text on search box");

		throw new io.cucumber.java.PendingException();
	}

	@And("and hit on serach button")
	public void and_hit_on_serach_button() {

		System.out.println("Inside Step- user hit on search button");

		throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to the search result page")
	public void user_is_navigated_to_the_search_result_page() {

		System.out.println("Inside Step- user is navigated to the search result page");

		throw new io.cucumber.java.PendingException();
	} 




}
