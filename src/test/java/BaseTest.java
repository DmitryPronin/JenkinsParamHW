import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {
    static String browser = System.getProperty("browser", "chrome");
    static String browserVersion = System.getProperty("browserVersion", "92");
    static String browserSize = System.getProperty("browserSize", "600x600");


    @BeforeAll
    static void setUp(){
        Configuration.baseUrl= "https://www.google.com/";
        Configuration.browser = browser;
        Configuration.browserVersion = browserVersion;
        Configuration.browserSize = browserSize;

        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }
}
