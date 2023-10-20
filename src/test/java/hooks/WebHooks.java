package hooks;

import elements.PageElementsParams;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class WebHooks extends PageElementsParams {
    @BeforeAll
    public static void allureSubThreadParallel() {
        String listenerName = "AllureSelenide";
        if (!(SelenideLogger.hasListener(listenerName)))
            SelenideLogger.addListener(listenerName,
                    (new AllureSelenide().screenshots(true).savePageSource(false)));
    }

    @Step("Открываем начальную страницу")
    public void chromeTest(String host) {
        open(host);
        getWebDriver().manage().window().maximize();
    }


}