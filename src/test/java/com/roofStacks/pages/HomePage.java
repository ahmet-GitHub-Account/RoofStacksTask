package com.roofStacks.pages;

import com.roofStacks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[text()  = 'Career']")
    public WebElement careerBtn;
}
