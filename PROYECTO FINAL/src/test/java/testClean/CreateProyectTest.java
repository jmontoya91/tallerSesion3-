package testClean;

import helper.GetProperties;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import page.CenterSection;
import page.LeftSection;
import page.LoginModal;
import page.MainPage;


public class CreateProyectTest extends TestBase {
    //ejecutar primero - obtener el enlace
    MainPage mainPage = new MainPage();
    LoginModal login = new LoginModal();
    LeftSection left = new LeftSection();
    CenterSection center = new CenterSection();




    @DisplayName("Titulo: VERIFICAR LA CREACION DE PROYECTO")
    @Description("Es test permite validar la creacion de un nuevo proyecto.....")
    @Epic("Prueba")
    @Feature("Project2")
    @Owner("JBGroup1")
    @Severity(SeverityLevel.CRITICAL)
    @Link("Jira/222220001")
    @Issue("www.jira1.com/bug/9999999")
    @Order(1)
    @Test
    public void verify() throws InterruptedException {
         String name1 = "PROY12";
        mainPage.loginButton.click();
        login.emailTxtBox.setText(GetProperties.getInstance().getUser());
        login.passwordTxtBox.setText(GetProperties.getInstance().getPwd());
        login.loginButton.click();

        left.addNewProjectButton.click();
        Thread.sleep(3000);
        left.nameProjectTextBox.setText(name1);
        left.addButton.click();

        Thread.sleep(3000);

        String resultEsperado = "PROY12";
        String Actual = center.currentProjectLabel.getText();

        Assertions.assertEquals(resultEsperado, Actual, "ERROR no se creo el projecto");

        left.MenuRight.click();
        Thread.sleep(4000);
        left.CloseSession.click();
    }



}
