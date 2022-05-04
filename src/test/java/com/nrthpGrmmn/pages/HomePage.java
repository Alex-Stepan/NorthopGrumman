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




        //------------------------------------------------------//


    /** 3. Methods: */



        //------------------------------------------------------//


}
