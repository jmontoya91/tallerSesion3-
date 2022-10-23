package session;

import factoryBrowser.FactoryBrowser;
import helper.GetProperties;
import org.openqa.selenium.WebDriver;

public class SingletonSession {
    // debemos tener un atributo del mismo tipo
    private static SingletonSession instance = null;
    private WebDriver browser;
    // el constructor debe ser privado
    private SingletonSession(){
        browser= FactoryBrowser.make(GetProperties.getInstance().getBrowser()).create();
    }

    // metodo estatico public para controlar la instancia unica
    public static SingletonSession getInstance(){
        if (instance == null)
            instance = new SingletonSession();
        return instance;
    }

    public void closeSession(){
        browser.quit();
        instance=null;
    }

    public WebDriver getBrowser(){
        return browser;
    }
}
