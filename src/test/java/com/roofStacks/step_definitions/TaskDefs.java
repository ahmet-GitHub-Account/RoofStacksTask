package com.roofStacks.step_definitions;


import com.roofStacks.pages.*;
import com.roofStacks.utilities.BrowserUtils;
import com.roofStacks.utilities.ConfigurationReader;
import com.roofStacks.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskDefs {

    GoogleHomePage googleHomePage = new GoogleHomePage();
    HomePage homePage = new HomePage();
    CareerPage careerPage = new CareerPage();
    ProductPage productPage = new ProductPage();
    TestLeadPage testLeadPage = new TestLeadPage();


    @Given("Google’a {string} şeklinde arama yapılır.")
    public void google_a_şeklinde_arama_yapılır(String searchWords) {

        Driver.get().get(ConfigurationReader.get("url"));

        googleHomePage.searchInput.sendKeys(searchWords);
        BrowserUtils.waitFor(1);
        googleHomePage.searchInput.sendKeys(Keys.ENTER);


    }

    @When("Sonuçlar listesinden https:\\/\\/roofstacks.com adresine girilir.")
    public void sonuçlar_listesinden_https_roofstacks_com_adresine_girilir() {
        googleHomePage.searchedItem.click();
    }

    @Then("Kariyer sayfasına gidilir.")
    public void kariyer_sayfasına_gidilir() {
        homePage.careerBtn.click();
    }

    @Then("İlanlar arasından Product pozisyonu seçilir.")
    public void i̇lanlar_arasından_Product_pozisyonu_seçilir() {

        try {
            careerPage.getPosition("Product");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("Lead Product Tester seçilir.")
    public void lead_Product_Tester_seçilir() {
        productPage.leadProductTester.click();
    }

    @Then("Lead Product Tester sayfasında sayfanın gelip gelmediği, doğruluğu kontrol edilir.")
    public void lead_Product_Tester_sayfasında_sayfanın_gelip_gelmediği_doğruluğu_kontrol_edilir() {
        BrowserUtils.waitFor(1);
        assertEquals("Lead Product Tester", productPage.head.getText());

        assertTrue(Driver.get().getTitle().contains("Lead Product Tester"));
    }

    @Then("SendCV butonuna basarak bir dosya upload edelim")
    public void sendcv_butonuna_basarak_bir_dosya_upload_edelim() {
        testLeadPage.sendCV.click();
    }

    @Then("Eposta adresine e-mail adresinizi girelim")
    public void eposta_adresine_e_mail_adresinizi_girelim() {
        testLeadPage.mailInput.sendKeys(ConfigurationReader.get("email"));
    }

    @Then("Sample bir dosya yükleyelim ve upload butonuna basarak dosyayı paylaşalım")
    public void sample_bir_dosya_yükleyelim_ve_upload_butonuna_basarak_dosyayı_paylaşalım() {

        testLeadPage.chooseFile.sendKeys(" /Users/ahmetvurdem/Desktop/AHMET VURDEM resume.pdf");
        testLeadPage.submitBtn.click();

        WebDriverWait wait = new WebDriverWait(Driver.get(), 20);
        wait.until(ExpectedConditions.textToBePresentInElement(testLeadPage.uploadedSuccessfully, "100%"));

        assertEquals("100%", testLeadPage.uploadedSuccessfully.getText());
    }
}
