import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class JenkinsParamTest extends BaseTest{

    @Test
    void openTransportPageTest(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        open("/kazan/transport?cd=1");

        $("h1").shouldHave(text("Транспорт и запчасти"));
    }
}