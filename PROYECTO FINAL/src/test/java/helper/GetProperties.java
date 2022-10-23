package helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetProperties {
    private static GetProperties instance =null;
    private String host;
    private String user;
    private String pwd;
    private String owasp;
    private String browser;



    private GetProperties(){
        Properties properties = new Properties();
        String nameFile = "qa.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);

        if (inputStream != null){
            try {
                properties.load(inputStream);
                host=properties.getProperty("host");
                user=properties.getProperty("user");
                pwd=properties.getProperty("pwd");
                owasp=properties.getProperty("owasp");
                browser=properties.getProperty("browser");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }

    public static GetProperties getInstance(){
        if (instance == null)
            instance= new GetProperties();
        return instance;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPwd() {
        return pwd;
    }

    public String getOwasp() {
        return owasp;
    }

    public String getBrowser() {
        return browser;
    }
}
