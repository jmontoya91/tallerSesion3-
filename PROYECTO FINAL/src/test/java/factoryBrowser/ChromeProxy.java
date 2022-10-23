package factoryBrowser;

import helper.GetProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class ChromeProxy implements  IBrowser{
    @Override
    public WebDriver create() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        // logica para la configuracion del proxy
        Map<String,Object> prefs = new HashMap<>();
        prefs.put("credential_enable_service",false);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--proxy-server="+ GetProperties.getInstance().getOwasp());
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.setExperimentalOption("prefs",prefs);

        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
    }
}
