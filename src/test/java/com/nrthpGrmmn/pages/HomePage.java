package com.nrthpGrmmn.pages;

import com.nrthpGrmmn.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

        //------------------------------------------------------//

    /** 1. Initialization of the page: */
        public HomePage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

        //------------------------------------------------------//


    /** 2. WebElements: */

            // Top Left Corporate Logo - link for the Home Page
        @FindBy(xpath = "//*[@id=\"top\"]/img")
        public WebElement NorthopGrm_TopCorpLogo;

            // Header Who We Are Bar List
        @FindBy(xpath = "//*[@id=\"menu-item-8736\"]/a")
        public WebElement WhoWeAreBarList;



        @FindBy(partialLinkText = "menu-item menu-item-type-custom menu-item-object-custom menu-item")
        public WebElement WhoWeAreBarListElement;




        //------------------------------------------------------//


    /** 3. Methods: */



        //------------------------------------------------------//


}
