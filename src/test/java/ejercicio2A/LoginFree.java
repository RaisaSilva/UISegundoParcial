package ejercicio2A;

import org.junit.Assert;
import org.junit.Test;
import pomPages.todoLy.CenterSection;
import pomPages.todoLy.LoginModal;
import pomPages.todoLy.MainPage;
import pomPages.todoLy.MenuSection;

public class LoginFree extends BaseTodolyEj2{
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    MenuSection menuSection = new MenuSection();
    CenterSection centerSection = new CenterSection();
    String fullname="juanito";
    String email="juanito@perez.com";
    String pass="123456";


    @Test
    public void verify_one_todoly() throws InterruptedException {
        mainPage.singUpFree.click();
        mainPage.fullName.set(fullname);
        mainPage.email.set(email);
        mainPage.pass.set(pass);
        mainPage.check.click();
        mainPage.singup.click();

        //this.waitOnSecond(2);
        Assert.assertTrue("ERROR, no se logueo",menuSection.logoutButton.controlIsDisplayed());


    }
}
