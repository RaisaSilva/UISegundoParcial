package ejercicio1A;

import org.junit.Assert;
import org.junit.Test;
import pomPages.todoLy.CenterSection;
import pomPages.todoLy.LoginModal;
import pomPages.todoLy.MainPage;
import pomPages.todoLy.MenuSection;

public class CambiaFullName{

    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection= new MenuSection();
    CenterSection centerSection= new CenterSection();
    String user="juanito@perez.com";
    String pwd="1234";
    String newName = "pedrito";

    @Test
    public void verify_ejer1_todoly() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.emailTextBox.set(user);
        loginModal.pwdTextBox.set(pwd);
        loginModal.loginButton.click();
        Assert.assertTrue("ERROR, no se logueo",menuSection.logoutButton.controlIsDisplayed());

        centerSection.setting.click();
        centerSection.editName.clear();

        //Thread.sleep(2000);
        //this.waitOnSecond(2);
        centerSection.editName.set(newName);
        centerSection.ok.click();
       // this.waitOnSecond(2);
        Assert.assertTrue("ERROR, no se cambio el nombre",menuSection.logoutButton.controlIsDisplayed());

    }
}
