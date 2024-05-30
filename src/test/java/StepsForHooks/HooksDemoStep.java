package StepsForHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class HooksDemoStep
{

    @Before
    public void browserSetup() {
        System.setProperty("webdriver.edgedriver", "C:\\Users\\pagl\\eclipse-workspace\\CucumberJavaProject\\src\\main\\resources\\drivers\\msedge");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitWait(10, Timeunit, seconds);
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();
        driver.manage().window().setSize(1000, 1000);
    }

        @After
        public void teardown()
        {
        Driver.close();
        driver.quit();


    }

    @BeforeStep
    Public void beforestep()
{
    System.out.println("Inside beforeStep");
}

    @AfterStep (order=0)/(oerder=1)
    Public void afterestep()
{
    System.out.println("Inside aftersetp");
}

public void setup2(){
    System.out.println("Inside setp 2");
}
}




    @Given("user is on login page and user should have valid credentials")

    public void user_is_on_login_page_and_user_should_have_valid_credentials() throws InterruptedException {

        System.out.println("Inside Step- Browser is open");




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
