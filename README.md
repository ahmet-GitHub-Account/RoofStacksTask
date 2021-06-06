Roof Stacks UI Automation Testing & Instructions Prepared by:
Ahmet VURDEM

QA Test Automation Engineer

vurdemahmet@gmail.com

https://www.linkedin.com/in/ahmet-vurdem

- Build Tool: Maven

- Test Framework: JUnit

UI Automation Testing:
https://www.lolaflora.com/login

QA:
Generating automation framework for the given task.

System Requirements:

√ Java 13 + SDK

√ Selenium Webdriver

√ Maven

√ JUnit

√ Cucumber Reports

****************************************************************

1) Clone the project

2) Reload maven dependencies from POM

3) Go **src -> test > java > com > roofStacks > runners > CukesRunner

4) To generate "Cucumber Report" ;

* Input following maven command to verify and generate report :
    - mvn clean verify

* Finally, to open the report directly in default browser please run:
    - open target/cucumber-html-reports/overview-features.html

The HTML report of the execution is under :  RoofStacksTask > target/cucumber-html-reports/overview-features.html

****************************************************************

- Test Otomasyonu - UI


1. Google’a “Roof Stack Yazılım” şeklinde arama yapılır.
2. Sonuçlar listesinden https://roofstacks.com adresine girilir.
3. Kariyer sayfasına gidilir.
4. İlanlar arasından Product pozisyonu seçilir.
5. Lead Product Tester seçilir.
6. Lead Product Tester sayfasında sayfanın gelip gelmediği, doğruluğu kontrol edilir.
7. SendCV butonuna basarak bir dosya upload edelim
8. Eposta adresine e-mail adresinizi girelim
9. Sample bir dosya yükleyelim ve upload butonuna basarak dosyayı paylaşalım

Sıralı test adımları:
- Kod tekrarından kurtulmak, okunabilirliğini artırmak ve tekrar kullanılabilirliğini sağlama yönünden dolayı page Object Model kullanıldı. 
- Gherkin language ile feature file içerisine senaryolar yazıldı.
- İlgili senaryolar stepDefinitions içerisinde Java dili kullanılarak automate edildi. 
- Pages package içerisinde sayfa sayfa ilgili locatorlar ve bunlarla ilgili methodlar oluşturuldu ve kullanıldı
- Kodu execute etmek için CukesRunner adı altında bir runner class oluşturuldu.
- Fail olan steplerin bir kere daha koşturulabilmesi için FialedTestRunner adı altında bir class oluşturuldu.
- mvn clean verify terminal comment'iyle birlikte Cucumber report oluşturuldu.

Sonuç : 
Sıralı test adımları Cucumber JUnit ile yazıldı, uygulandı. Execution sonucunda Cucumber report oluşturuldu.

2021 June®
