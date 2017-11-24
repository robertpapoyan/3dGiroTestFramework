package Giro3D.TestCasesWithChromeBrowser;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {

    ChromeDriver chromeDriver;
    GeneralObjects generalObjects;
    MainPageVideoObjects mainPageVideoObjects;
    MainPageButtons mainPageButtons;
    Scroll scroll;

    @BeforeClass
    public static void driverSetUp(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Administrator\\Desktop\\Selenium drivers\\chromedriver.exe");
    }

    @Before
    public void setUp(){

        System.out.println("Open the page...");

        chromeDriver = new ChromeDriver();
        chromeDriver.get("http://3dgiro.com");
        chromeDriver.manage().window().maximize();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        generalObjects = new GeneralObjects(chromeDriver);
        mainPageVideoObjects = new MainPageVideoObjects(chromeDriver);
        mainPageButtons = new MainPageButtons(chromeDriver);
        scroll = new Scroll(chromeDriver);
    }

    @Test
    public void test1GeneralObjectsDisplayed(){

        System.out.println("Check the elements existing");

        //Home button
        Assert.assertTrue(chromeDriver.findElementByXPath("//*[@id=\"menu-item-21\"]/a").isDisplayed());
        //Service button
        Assert.assertTrue(chromeDriver.findElementByXPath("//*[@id=\"menu-item-17\"]/a/span").isDisplayed());
        //About button
        Assert.assertTrue(chromeDriver.findElementByXPath("//*[@id=\"menu-item-20\"]/a/span").isDisplayed());
        //Contact us button
        Assert.assertTrue(chromeDriver.findElementByXPath("//*[@id=\"menu-item-16\"]/a/span").isDisplayed());
        //Logo button
        Assert.assertTrue(chromeDriver.
                findElementByXPath("//*[@id=\"wrapper\"]/header/div[1]/div[2]/div/div[1]/a/img[1]")
                .isDisplayed());

    }

    @Test
    public void test2GeneralObjectsFunctionality() throws InterruptedException {

        System.out.println("Home button");
        generalObjects.homeButtonClick();
        Assert.assertTrue(chromeDriver.getCurrentUrl().contains("http://3dgiro.com"));
        Thread.sleep(3000);

        System.out.println("Works!");
        System.out.println("_____");

        System.out.println("Services button");
        generalObjects.servicesButtonClick();
        Assert.assertTrue(chromeDriver.getCurrentUrl().contains("http://3dgiro.com/services/"));
        Thread.sleep(3000);

        System.out.println("Works!");
        System.out.println("_____");

        System.out.println("Logo button");
        generalObjects.logoButtonClick();
        Assert.assertTrue(chromeDriver.getCurrentUrl().contains("http://3dgiro.com"));
        Thread.sleep(3000);

        System.out.println("Works!");
        System.out.println("_____");

        System.out.println("About button");
        generalObjects.aboutButtonClick();
        Assert.assertTrue(chromeDriver.getCurrentUrl().contains("http://3dgiro.com/about/"));

        System.out.println("Works!");
        System.out.println("_____");

        System.out.println("Contact us button");
        generalObjects.contactUsButtonTopClick();
        Assert.assertTrue(chromeDriver.getCurrentUrl().contains("http://3dgiro.com/contact-us/"));

        System.out.println("Works!");
        System.out.println("_____");
    }

    @Test
    public void test3HomePageVideos() throws InterruptedException {

        scroll.down();
        scroll.down();

        mainPageVideoObjects.youtubeVideo1ObjectCreation();
        Assert.assertTrue(mainPageVideoObjects.youtubeVideo1ObjectClick());
        Thread.sleep(2000);
        mainPageVideoObjects.youtubeVideo1ObjectClick();

        mainPageVideoObjects.youtubeVideo2ObjectCreation();
        Assert.assertTrue(mainPageVideoObjects.youtubeVideo2ObjectClick());
        Thread.sleep(2000);
        mainPageVideoObjects.youtubeVideo2ObjectClick();

        mainPageVideoObjects.youtubeVideo3ObjectCreation();
        Assert.assertTrue(mainPageVideoObjects.youtubeVideo3ObjectClick());
        Thread.sleep(2000);
        mainPageVideoObjects.youtubeVideo3ObjectClick();

        mainPageVideoObjects.youtubeVideo4ObjectCreation();
        Assert.assertTrue(mainPageVideoObjects.youtubeVideo4ObjectCLick());
        Thread.sleep(2000);
        mainPageVideoObjects.youtubeVideo4ObjectCLick();

        mainPageVideoObjects.youtubeVideo5ObjectCreation();
        Assert.assertTrue(mainPageVideoObjects.youtubeVideo5ObjectClick());
        Thread.sleep(2000);
        mainPageVideoObjects.youtubeVideo5ObjectClick();

        mainPageVideoObjects.youtubeVideo1ObjectCreation();
        Assert.assertTrue(mainPageVideoObjects.youtubeVideo1ObjectClick());
        Thread.sleep(2000);
        mainPageVideoObjects.youtubeVideo1ObjectClick();

        mainPageVideoObjects.youtubeVideo6ObjectCreation();
        Assert.assertTrue(mainPageVideoObjects.youtubeVideo6ObjectClick());
        Thread.sleep(2000);

    }

    @Test
    public void test4HomePageButtons() throws InterruptedException {

        Assert.assertTrue(mainPageButtons.watchOurDemoButton.isDisplayed());
        Assert.assertTrue(mainPageButtons.watchOurDemoButtonClick());
        Thread.sleep(2500);
        chromeDriver.findElementByClassName("ilightbox-close").click();

        Thread.sleep(2000);

        Assert.assertTrue(mainPageButtons.video3dButton.isDisplayed());
        Assert.assertTrue(mainPageButtons.video3dButtonClick());

        Thread.sleep(1500);
        scroll.down();
        Thread.sleep(1500);

        Assert.assertTrue(chromeDriver.getCurrentUrl().contains("http://3dgiro.com/services/"));
        Thread.sleep(3500);
        generalObjects.homeButtonClick();

        Thread.sleep(2000);

        Assert.assertTrue(mainPageButtons.interactive3dButton.isDisplayed());
        Assert.assertTrue(mainPageButtons.interactive3dButton());
        Assert.assertTrue(chromeDriver.getCurrentUrl().contains("http://3dgiro.com/services/#inter"));
        Thread.sleep(3500);
        generalObjects.homeButtonClick();

        Thread.sleep(2000);

        Assert.assertTrue(mainPageButtons.contactUsBottomButton.isDisplayed());
        mainPageButtons.contactUsBottomButton();
        Assert.assertTrue(chromeDriver.getCurrentUrl().contains("http://3dgiro.com/contact-us/"));
        Thread.sleep(3500);
        generalObjects.homeButtonClick();
    }

    @After
    public void closeBrowser() throws InterruptedException {
        if (chromeDriver != null){
            Thread.sleep(2000);
            chromeDriver.quit();
        }
    }
}
