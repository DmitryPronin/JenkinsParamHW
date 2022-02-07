import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    static void setUp(){
        Configuration.baseUrl= "https://avito.ru";
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion", "92");
        Configuration.browserSize = System.getProperty("browserSize", "600x600");
    }
}
