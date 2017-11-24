package Giro3D.TestCasesWithChromeBrowser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPageButtons {

    ChromeDriver chromeDriver;
    WebDriverWait wait;

    public MainPageButtons(ChromeDriver chromeDriver){

        this.chromeDriver = chromeDriver;
        wait = new WebDriverWait(chromeDriver, 30);
        PageFactory.initElements(chromeDriver, this);

    }

    //"Watch Our Demo" button and "Click on it" method
    @FindBy(xpath = "//*[@id=\"sliders-container\"]/div/div/ul[1]/li/div[1]/div/div[3]/div/div[3]/a")
     WebElement watchOurDemoButton;

    public boolean watchOurDemoButtonClick(){
        watchOurDemoButton.click();
        return true;
    }


    //"Video 3d button" and "click on it method"
    @FindBy(xpath = "//*[@id=\"post-885\"]/div/div[3]/div/div[5]/div/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/a/div")
     WebElement video3dButton;

    public boolean video3dButtonClick(){
        video3dButton.click();
        return true;
    }

    //"Interactive 3d" button and "Click on it method"
    @FindBy(xpath = "//*[@id=\"post-885\"]/div/div[3]/div/div[5]/div/div[1]/div[3]/div/div[1]/div[1]/div/div[1]/a/div")
     WebElement interactive3dButton;

    public boolean interactive3dButton(){
        interactive3dButton.click();
        return true;
    }

    //"Contact us" button and "Click on it " method
    @FindBy(xpath = "//*[@id=\"post-885\"]/div/div[5]/div[2]/div/div/div[1]/div/div[4]/a")
    WebElement contactUsBottomButton;

    public boolean contactUsBottomButton(){
        contactUsBottomButton.click();
        return true;
    }

}
