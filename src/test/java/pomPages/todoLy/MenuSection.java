package pomPages.todoLy;

import controls.Button;
import org.openqa.selenium.By;

public class MenuSection {
    public Button logoutButton = new Button(By.xpath("//a[contains(.,'Logout')]"));

    //menu todoist
    public Button avatar = new Button(By.xpath("//button[@type='button']/img[@class='user_avatar big settings_avatar']"));

    public MenuSection() {
    }
}
