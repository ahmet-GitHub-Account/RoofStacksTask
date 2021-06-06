package com.roofStacks.pages;

import com.roofStacks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
    public GoogleHomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@title = 'Ara']")
    public WebElement searchInput;

    @FindBy(xpath = "//cite[text()  = 'https://roofstacks.com']")
    public WebElement searchedItem;

}
