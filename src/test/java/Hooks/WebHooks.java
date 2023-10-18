package Hooks;

import Elements.PageElementsParams;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
public class WebHooks extends PageElementsParams {
    public void chromeTest(String host) {
        open(host);
        getWebDriver().manage().window().maximize();
    }
}