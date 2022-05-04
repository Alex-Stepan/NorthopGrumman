package com.nrthpGrmmn.pages;

import com.github.javafaker.Faker;
import com.nrthpGrmmn.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    //------------------------------------------------------//

    /** 1. Use initialization of the page: */
        public HomePage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

    //------------------------------------------------------//


    /** 2. WebElements: */

    /*
    @FindBy(xpath = "//button[normalize-space()='Save and Close']")
    public WebElement saveAndCloseButton;
    // used for US_04

    @FindBy(name = "oro_contact_form[firstName]")
    public WebElement firstName;
    // used for US_04

    @FindBy(xpath = "(//span[@class='select2-chosen'])[1]")
    public WebElement owner;
    // used for US_04

    @FindBy(xpath = "(//div[@class='select2-result-label'])[10]")
    public WebElement ownerSelect;
    // used for US_04

    @FindBy(xpath = "//input[@type='email']")
    public WebElement email;
    // used for US_04

    @FindBy(xpath = "//select[@name='oro_contact_form[method]']")
    public WebElement contactMethodDropDown;
    // used for US_04

    @FindBy(xpath = "(//span[@class='select2-chosen'])[4]")
    public WebElement countryDropdown;
    // used for US_04

    @FindBy(className = "select2-result-label")
    public List<WebElement> allCountries;
    // used for US_04

    @FindBy(css = ".message")
    public WebElement successMessage;
    // used for US_04
    */

    //------------------------------------------------------//


    /** 3. Methods: */

//    public void fillForm() {
//        //1. Add Faker (random select)
//        Faker faker = new Faker();
//
//        //2. pick an owner name from the list
//        BrowserUtil.waitFor(3);
//        owner.click();
//        BrowserUtil.waitFor(3);
//        ownerSelect.click();
//
//        //3. Type info
//        firstName.sendKeys(faker.name().firstName());
//        email.sendKeys(faker.internet().emailAddress());
//        BrowserUtil.selectByVisibleText(contactMethodDropDown, "Email");
//        countryDropdown.click();
//        allCountries.get(5).click();
//
//        //4. Print the info
//        System.out.println("\"Form is filled\" = " + "Form is filled");
//    }

    //------------------------------------------------------//


}
