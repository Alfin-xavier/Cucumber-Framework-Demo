package stepdefinitions;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;		
	

public class Steps
{				
    WebDriver driver;			
    		
    @Given("^Open the Firefox and launch the application$")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
       System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");					
       driver= new ChromeDriver();					
       driver.manage().window().maximize();			
       driver.get("https://en-gb.facebook.com/login/");					
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       driver.findElement(By.id("email")).sendKeys("username12");							
       driver.findElement(By.id("pass")).sendKeys("password12");							
    }		

    @Then("^Reset the credential$")					
    public void login_to_the_application() throws Throwable 							
    {		
       driver.findElement(By.name("login")).click();					
    }
}