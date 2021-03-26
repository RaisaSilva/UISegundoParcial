package pass;

import org.junit.Assert;
import org.junit.Test;
import pomPages.todoLy.*;
import singletonSession.Session;


public class pass extends BaseTodoly {
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    LeftSection leftSection = new LeftSection();
    MenuSection menuSection = new MenuSection();
    CenterSection centerSection = new CenterSection();
    String user = "raisa";

    String pwd = "raisa123";
    String newPwd= "raisa1234";

    @Test
    public void verify_pass() throws InterruptedException {
        //------LOGIN
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.loginImage.click();
        loginModal.loginAction(user, pwd);

        centerSection.setting.click();

        centerSection.editOldPass.click();
        centerSection.editOldPass.set(pwd);
        centerSection.editNewPass.click();
        centerSection.editNewPass.set(newPwd);
        centerSection.ok.click();
        this.waitOnSecond(2);

        mainPage.logout.click();
        this.waitOnSecond(2);
        mainPage.loginImage.click();
        loginModal.loginAction(user, newPwd);
        Assert.assertTrue("ERROR",menuSection.logoutButton.controlIsDisplayed());





    }
}
