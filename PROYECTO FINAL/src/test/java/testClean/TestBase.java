package testClean;

import helper.GetProperties;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import session.SingletonSession;

public class TestBase {

    @BeforeEach
    public void openBrowser(){
        SingletonSession.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
        SingletonSession.getInstance().closeSession();
    }


}
