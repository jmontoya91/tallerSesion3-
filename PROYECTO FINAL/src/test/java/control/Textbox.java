package control;
import org.openqa.selenium.By;

public class Textbox extends ControlSelenium {


    public Textbox(By locator, String nameControl) {
        super(locator, nameControl);
    }

    public void setText(String value){
        this.findControl();
        this.stepAllure("set text: ["+value+"] in the control "+this.nameControl);
        this.control.clear();
        this.control.sendKeys(value);
    }



}
