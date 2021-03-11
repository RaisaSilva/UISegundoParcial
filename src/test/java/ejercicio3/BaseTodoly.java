package ejercicio3;

import org.junit.After;
import org.junit.Before;
import singletonSession.Session;

import java.io.IOException;

public class BaseTodoly {

    @Before
    public void open(){
        Session.getSession().getDriver().get("http://todo.ly/");
    }

    @After
    public void close() throws IOException {
        Session.getSession().closeSession();
    }

    public void waitOnSecond(int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);
    }

}
