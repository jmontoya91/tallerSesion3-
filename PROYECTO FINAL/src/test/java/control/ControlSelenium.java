package control;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.SingletonSession;

public class ControlSelenium {
    protected WebElement control;
    protected By locator;
    protected  String nameControl;

    public ControlSelenium(By locator,String nameControl){
        this.locator=locator;
        this.nameControl=nameControl;
    }


    protected void findControl(){
        this.control= SingletonSession.getInstance().getBrowser().findElement(this.locator);
    }

    @Step("{0}")
    public void stepAllure(String action){}


    public void click(){
        stepAllure("click "+nameControl);
        this.findControl();
        this.control.click();
    }


    public boolean isControlDisplayed(){
        try {
            this.findControl();
            stepAllure("is displayed "+nameControl+" ? true");
            return this.control.isDisplayed();
        }catch (Exception e){
            stepAllure("is displayed "+nameControl+" ? false");
            return false;
        }
    }

    public String getText(){
        this.findControl();
        stepAllure("get the text: "+control.getText());
        return this.control.getText();
    }



}
