package com.nrthpGrmmn.step_definitions;

import com.nrthpGrmmn.utilities.DriverTestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HomePage_NavigateTo_CompanyLeadership extends DriverTestBase {

    @Given("User is on the Home Page")
        public void user_is_on_the_home_page() {
            //1. driver navigate to ____
                setupWebDriver();
                driver.get("https://www.northropgrumman.com/");
            //2. driver manipulation with window page
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            //3. getTitle()
                driver.getTitle();
                String homePageTitel = driver.getTitle();
                System.out.println("Home page Title is: " + driver.getTitle());
            //4. verify getTitle with "homePage title"
                if (homePageTitel.equals("Home - Northrop Grumman")){
                    System.out.println("Correct. You are on Home Page");
                }else {
                    System.out.println("WRONG. You are not on the Home Page");
                }
        }

    @Then("User hover over to the WwA Bar List")
        public void user_hover_over_to_the() {
            //5. locate the Who We Are Bar List element
                WebElement WhoWeAreBarList = driver.findElement(By.xpath("//*[@id=\"menu-item-8736\"]/a"));
            //6. create Actions class for passing driver object
                Actions action = new Actions(driver);
            //7. hover over the Who We Are Bar List
                action.moveToElement(WhoWeAreBarList).perform();
                System.out.println("Hover over is moved to the Who We Are Bar List");
        }

    @And("User navigates to the Company Leadership link")
        public void user_navigates_to_companyLeadershipLink() {
            //8. locate the Investors link
                driver.findElement(By.id("menu-item-880831")).click();
            //9.verify getTitle with "Investors Page" title
                driver.getTitle();
                if (driver.getTitle().equals("Company Leadership - Northrop Grumman")) {
                    System.out.println("The page title is: " + driver.getTitle());
                }else {
                    System.out.println("You are at the WRONG Page");
                }
            //10. driver quit()
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                driver.quit();
        }
}
