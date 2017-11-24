package Giro3D.TestCasesWithChromeBrowser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

//Scroll method@ es ander eji hmara petq grel

public class Scroll {
    ChromeDriver chromeDriver;
    WebDriverWait wait;

    public Scroll (ChromeDriver chromeDriver){

        this.chromeDriver = chromeDriver;
        wait = new WebDriverWait(chromeDriver, 30);
        PageFactory.initElements(chromeDriver, this);

    }

    public void down() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)chromeDriver;
        jse.executeScript("window.scrollBy(0, 350)", "");
        Thread.sleep(2000);

    }

    public void up() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)chromeDriver;
        jse.executeScript("window.scrollBy(350, 0)", "");
        Thread.sleep(2000);

    }

}
