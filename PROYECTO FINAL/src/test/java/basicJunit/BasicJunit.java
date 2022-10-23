package basicJunit;

import factoryBrowser.FactoryBrowser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class BasicJunit {

    @BeforeEach
    public void setup(){
        System.out.println("setup");
    }
    @AfterEach
    public void cleanup(){
        System.out.println("cleanup");
    }

    @Test
    @Disabled
    public void verifySomeThing() throws InterruptedException {
        System.out.println("test");
      //  FactoryBrowser.make("proxy").create().get("http://todo.ly/");
        Thread.sleep(2000);
    }
}
