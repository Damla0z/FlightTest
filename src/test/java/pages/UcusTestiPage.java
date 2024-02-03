package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UcusTestiPage {


    public UcusTestiPage() {PageFactory.initElements(Driver.getDriver() , this);}



    @FindBy (xpath = "(//*[@fill='currentColor'])[1]")
    public WebElement fromKutusu;

    @FindBy (xpath = "(//*[@fill='currentColor'])[2]")
    public WebElement toKutusu;


    @FindBy (xpath = "(//*[@role='option'])[1]")
    public WebElement secenekFromIstanbul;


    @FindBy (xpath = "//*[@id='headlessui-combobox-option-:r2o:']")
    public WebElement secenekToIstanbul;

    @FindBy (xpath = "//*[@class='overflow-hidden rounded-xl border border-gray-200']")
    public List<WebElement> bulunanUrunListesi;

    @FindBy (xpath = "//*[@id='headlessui-combobox-input-:Rqhlla:']")
    public WebElement Rome;



    @FindBy (xpath = "//*[@role='listbox']")
    public List<WebElement> fromboxTumUrunlerList;


    @FindBy (xpath = "(//*[@role='option']) [1]")
    public WebElement Istanbul;


    @FindBy (xpath = "//*[@id='headlessui-combobox-input-:Rq9lla:']")
    public WebElement fromBoslukAlanı;

    @FindBy (xpath = "//*[@role='listbox']")
    public  List<WebElement> toboxTumUrunlerList;


    @FindBy (xpath = "(//*[@role='combobox'])[2]")
    public  WebElement toBoslukAlani;



}
