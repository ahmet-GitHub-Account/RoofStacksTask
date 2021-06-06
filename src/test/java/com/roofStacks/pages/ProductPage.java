package com.roofStacks.pages;

import com.roofStacks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    public ProductPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//h4[text()  = 'Lead Product Tester']")
    public WebElement leadProductTester;

    @FindBy(xpath = "//*[@class='section-title full-width']")
    public WebElement head;


}
