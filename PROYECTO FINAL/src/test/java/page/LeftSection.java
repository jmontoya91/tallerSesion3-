package page;
import control.Button;
import control.Textbox;
import org.openqa.selenium.By;

public class LeftSection {


    public Button addNewProjectButton =new Button(By.xpath("//*[@class=\"a8af2163 _98cd5c3f _45ffe137 ef4c88db f9408a0e\"]"),"[Nuevo Proyecto] clic en nuevo Proyecto");
    public Textbox nameProjectTextBox = new Textbox(By.xpath("//input[@id=\"edit_project_modal_field_name\"]"),"[Nombre de Proyecto] Ingresar");
    public Button addButton = new Button(By.xpath("//button[@class=\"ist_button ist_button_red\"]"),"[Agregar] Clic en el boton agregar Proyecto");

    //Menu Cerrar
    public Button MenuRight=new Button(By.xpath("//*[@class=\"+syWHcL nim+ugS settings_avatar f9408a0e\"]"), "[Menu] Clic para abrir Menu");
    // //cerrar Session//para id dinamicos
    public Button CloseSession=new Button(By.xpath("//*[@role='menuitem']//following-sibling::button[2]"),"[Cerrar] Para cerrar sesion");

////*[@class="+syWHcL nim+ugS settings_avatar f9408a0e"]
    ////img[contains(@src,"https://avatars.doist.com?fullName=J&email=jmontoya1%40prueba.com&size=100&bg=ffffff")]


}
