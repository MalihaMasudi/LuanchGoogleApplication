package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class loginSteps {
    WebDriver driver=null;
    @Given("I open the Google homepage")
    public void i_open_the_google_homepage() {
    System.out.println("Inside Steps-I open the Google homepage");
//        set the path to the driver to link it with our class    on Mac u don't need .exe on Windows u need .exe
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
// create a WebDriver instance
            WebDriver driver= new ChromeDriver();
//        use the get() function to open up the required website
            driver.get("https://www.google.com/");
//        get the url of the website
            String  url=driver.getCurrentUrl();
//        print the url
            System.out.println(url);

//        get the title
            String title=driver.getTitle();
//        print the title
            System.out.println(title);
//        close the chrome
            driver.quit();






                driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
    }
     //System.setProperty("webdriver.chrome.driver", ""https://www.google.com/"");
    @When("I enter {string} into the search bar")
    public void i_enter_into_the_search_bar(String string) {
        System.out.println("Inside Steps-I enter {string} into the search bar");

    }

    @And("I click the Google  Search button")
    public void i_click_the_google_search_button() {
        System.out.println("Inside Steps-I click the Google  Search button");
    }

    @Then("I should see search results")
    public void i_should_see_search_results() {
        System.out.println("Inside Steps-I should see search results");

    }

}
