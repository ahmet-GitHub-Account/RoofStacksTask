package com.roofStacks.pages;

import com.roofStacks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestLeadPage {
    public TestLeadPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//small[contains(text(), 'Send CV')]")
    public WebElement sendCV;

    @FindBy(id = "email")
    public WebElement mailInput;

    @FindBy(css = "#file")
    public WebElement chooseFile;

    @FindBy(xpath = "//input[@id='btn_upload']")
    public WebElement submitBtn;

    @FindBy(xpath = "//div[@id = 'percent']")
    public WebElement uploadedSuccessfully;

}
