package core.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class readProperties {

    private String userName;
    private String password;
    private String url;
    private static readProperties ourInstance = new readProperties();

    public static readProperties getInstance() {

        return ourInstance;
    }

    private readProperties() {
        try (InputStream input = new FileInputStream(System.getProperty("user.dir") +"core/config/" +"/application.properties")) {
            Properties properties = new Properties();
            properties.load(input);

            userName= properties.getProperty("browser");
            password = properties.getProperty("implicit");
            url = properties.getProperty("explicit");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

}
