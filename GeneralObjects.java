package Giro3D.TestCasesWithChromeBrowser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralObjects {

    ChromeDriver chromeDriver;
    WebDriverWait wait;

    public GeneralObjects(ChromeDriver chromeDriver){

        this.chromeDriver = chromeDriver;
        wait = new WebDriverWait(chromeDriver, 30);
        PageFactory.initElements(chromeDriver, this);

    }

    //"Home" Button and "click on it" method
    @FindBy(xpath = "//*[@id=\"menu-item-21\"]/a")
    private WebElement homeButton;

    public void homeButtonClick(){
        homeButton.click();
    }

    //"Service" button and "click on it" method
    @FindBy(xpath = "//*[@id=\"menu-item-17\"]/a/span")
    private WebElement servicesButton;

    public void servicesButtonClick(){
        servicesButton.click();
    }

    //"About" button and "click on it" method
    @FindBy(xpath = "//*[@id=\"menu-item-20\"]/a/span")
    private WebElement aboutButton;

    public void aboutButtonClick(){
        aboutButton.click();
    }

    //"Contact US" button and "click on it" method
    @FindBy(xpath = "//*[@id=\"menu-item-16\"]/a/span")
    private WebElement contactUsButtonTop;

    public void contactUsButtonTopClick(){
        contactUsButtonTop.click();
    }

    //"3DGiro logo(button)" button and "click on it" method
    @FindBy(xpath = "//*[@id=\"wrapper\"]/header/div[1]/div[2]/div/div[1]/a/img[1]")
    private WebElement logoButton;

    public void logoButtonClick(){
        logoButton.click();
    }
}
