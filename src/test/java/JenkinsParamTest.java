import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class JenkinsParamTest extends BaseTest{

    @Test
    void openTransportPageTest(){


        open("");

        $(byText("Спецпроекты")).click();
        $(".panel-group__title").shouldHave(text("Новости по рубрике - Спецпроекты"));
    }

    @Test
    void openUrlFromParam(){
        String login = System.getProperty("login");
        String password = System.getProperty("password");
        String url = System.getProperty("url");

        open(url);
        $("#text").setValue(login + password);
    }


}
