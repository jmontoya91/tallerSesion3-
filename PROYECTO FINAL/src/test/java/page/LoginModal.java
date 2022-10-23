package page;
import control.Button;
import control.Textbox;
import org.openqa.selenium.By;

public class LoginModal {
 // Login
    public Textbox emailTxtBox = new Textbox(By.xpath("//input[@id=\"element-0\"]"),"[email] Ingreso email");
    public Textbox passwordTxtBox = new Textbox(By.xpath("//input[@id=\"element-3\"]"),"[clave] Ingreso clave");
    public Button loginButton = new Button(By.xpath("//*[contains(@type,'submit')]"),"[login] Click Boton");
}
