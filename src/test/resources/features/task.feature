Feature: RoofStack Task
  @roofStackTask
  Scenario: UI Task Steps
    Given Google’a 'Roof Stacks Yazılım' şeklinde arama yapılır.
    When Sonuçlar listesinden https://roofstacks.com adresine girilir.
    Then Kariyer sayfasına gidilir.
    And İlanlar arasından Product pozisyonu seçilir.
    And Lead Product Tester seçilir.
    And Lead Product Tester sayfasında sayfanın gelip gelmediği, doğruluğu kontrol edilir.
    And SendCV butonuna basarak bir dosya upload edelim
    And Eposta adresine e-mail adresinizi girelim
    And Sample bir dosya yükleyelim ve upload butonuna basarak dosyayı paylaşalım