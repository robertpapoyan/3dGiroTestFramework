package Giro3D.TestCasesWithChromeBrowser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPageVideoObjects {

    ChromeDriver chromeDriver;
    WebDriverWait wait;

    private WebElement video1;
    private WebElement video2;
    private WebElement video3;
    private WebElement video4;
    private WebElement video5;
    private WebElement video6;

    public MainPageVideoObjects(ChromeDriver chromeDriver){

        this.chromeDriver = chromeDriver;
        wait = new WebDriverWait(chromeDriver, 30);
        PageFactory.initElements(chromeDriver, this);

    }


    //"3D Animation Product" video and "Click on it" method: VIDEO 1
    public void youtubeVideo1ObjectCreation(){
        chromeDriver.switchTo().defaultContent();
        chromeDriver.switchTo().frame("player_1");
        video1 = chromeDriver.findElementById("player");
    }

    public boolean youtubeVideo1ObjectClick(){
        video1.click();
        return true;
    }

    //"3d explanatory.." video and "Click onb it method": VIDEO 2
    public void youtubeVideo2ObjectCreation(){
        chromeDriver.switchTo().defaultContent();
        chromeDriver.switchTo().frame("player_2");
        video2 = chromeDriver.findElementById("player");
    }

    public boolean youtubeVideo2ObjectClick(){
       video2.click();
       return true;
    }

    //"Construction 3d animation" video and "Click onb it method: VIDEO 3
    public void youtubeVideo3ObjectCreation(){
        chromeDriver.switchTo().defaultContent();
        chromeDriver.switchTo().frame("player_3");
        video3 = chromeDriver.findElementById("player");
    }

    public boolean youtubeVideo3ObjectClick(){
        video3.click();
        return true;
    }

    //"3d animation simx world" video and "click ont method": VIDEO 4
    public void youtubeVideo4ObjectCreation(){
        chromeDriver.switchTo().defaultContent();
        chromeDriver.switchTo().frame("player_4");
        video4 = chromeDriver.findElementById("player");
    }

    public boolean youtubeVideo4ObjectCLick(){
        video4.click();
        return true;
    }

    //"'Construction shop" video and "Click on it " method: VIDEO 5
    public void youtubeVideo5ObjectCreation(){
        chromeDriver.switchTo().defaultContent();
        chromeDriver.switchTo().frame("player_5");
        video5 = chromeDriver.findElementById("player");
    }

    public boolean youtubeVideo5ObjectClick(){
        video5.click();
        return true;
    }

    //"Product presentation" video and "Click on it" method: VIDEO 6
    public void youtubeVideo6ObjectCreation() {
        chromeDriver.switchTo().defaultContent();
        chromeDriver.switchTo().frame("player_6");
        video6 = chromeDriver.findElementById("player");
    }

    public boolean youtubeVideo6ObjectClick (){
        video6.click();
        return true;
    }

}
