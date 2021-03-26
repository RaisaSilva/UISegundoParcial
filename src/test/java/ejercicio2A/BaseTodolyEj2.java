package ejercicio2A;

import org.junit.After;
import org.junit.Before;
import sessionSingleton1.Session;


import java.io.IOException;

public class BaseTodolyEj2 {

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
