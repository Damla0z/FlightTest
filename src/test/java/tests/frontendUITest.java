package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.UcusTestiPage;
import utilities.ConfigReader;
import utilities.Driver;

public class frontendUITest {

    WebDriver driver;

    @Test

    public void UITest () {

        Driver.getDriver().get(ConfigReader.getProperty("flightsUrl"));
        UcusTestiPage ucusTestiPage = new UcusTestiPage();


        ucusTestiPage.fromBoslukAlanı.click();

        for (int i = 0; i < ucusTestiPage.fromboxTumUrunlerList.size(); i++) {
            for (int j = 0; j < ucusTestiPage.toboxTumUrunlerList.size(); j++) {

            }
            if (ucusTestiPage.fromboxTumUrunlerList.get(i).equals(ucusTestiPage.toboxTumUrunlerList.size())){
                System.out.println("bug bulundu, from ve to boxlarına aynı şehir ismi girilemez");
            }
        }


        Driver.quitDriver();

    }
}

