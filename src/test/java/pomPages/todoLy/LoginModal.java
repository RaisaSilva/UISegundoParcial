package pomPages.todoLy;

import controles.Button;
import controles.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
    public TextBox emailTextBox= new TextBox(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$TextBoxEmail']"));
    public TextBox pwdTextBox= new TextBox(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$TextBoxPassword']"));
    public Button loginButton= new Button(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$ButtonLogin']"));


    //login modal todoist
    public TextBox registro = new TextBox(By.xpath("//div[@class='field']//input[@id='email']"));
    public Button registroEmail = new Button(By.xpath("//button[@id='step_one_submit']"));
    public TextBox nombre = new TextBox(By.xpath("//div[@class='field']//input[@id='full_name']"));
    public TextBox pass = new TextBox(By.xpath("//div[@class='toggle_password']//input[@id='pwd']"));
    public Button submit= new Button(By.xpath("//button[@id='step_two_submit']"));


    public LoginModal(){}

    public void loginAction(String user, String pwd){
        emailTextBox.set(user);
        pwdTextBox.set(pwd);
        loginButton.click();
    }
}
