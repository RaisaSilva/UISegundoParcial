package singletonSession;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class Session1 {

    private static Session1 session=null;
    private WebDriver driver;

    private Session1(){

        //this.driver= FactoryBrowser.make("firefox").create();
        this.driver= FactoryBrowser.make("chrome").create();
    }

    public static Session1 getSession(){
        if (session==null)
            session= new Session1();
        return session;
    }

    public WebDriver getDriver(){

        return driver;
    }

    public void closeSession(){
        driver.quit();
        session=null;
    }


}
