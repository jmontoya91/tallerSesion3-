package factoryBrowser;

public class FactoryBrowser {

    public static IBrowser make(String typeBrowser){
        IBrowser browser;

        switch (typeBrowser.toLowerCase()){
            case "chrome":
                browser = new Chrome();
                break;
            case "proxy":
                browser = new ChromeProxy();
                break;
            default:
                browser = new Firefox();
                break;
        }
        return browser;
    }
}
