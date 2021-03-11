package todoLy;

import controls.Button;
import controls.CheckBox;
import controls.Image;
import controls.TextBox;
import org.openqa.selenium.By;

public class MainPage {

    public Image loginImage= new Image(By.xpath("//img[@src='/Images/design/pagelogin.png']"));
    public Image start = new Image(By.xpath("//div[@class='_3BBq0']//a"));

    public Image singUpFree = new Image(By.xpath("//div[@class='HPHeaderSignup']//a"));
    public TextBox fullName = new TextBox(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$TextBoxFullName']"));
    public TextBox email = new TextBox(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$TextBoxEmail']"));
    public TextBox pass = new TextBox(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$TextBoxPassword']"));
    public CheckBox check = new CheckBox(By.xpath("//label[@class='HPLoginTerms']//input"));
    public Button singup = new Button(By.xpath("//input[@name='ctl00$MainContent$SignupControl1$ButtonSignup']"));

    public Button logout = new Button(By.xpath("//a[@id='ctl00_HeaderTopControl1_LinkButtonLogout']"));

    public MainPage(){}
}


