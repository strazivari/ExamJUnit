package steps;

import elements.AllAssertions;
import elements.AuthPageElements;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class AuthPageSteps extends AuthPageElements {
    @Step("Форма ввода логина, пароля")
    public static void loginFunc(String loginInputParam, String passwordInputParam) {
        loginInput.setValue(loginInputParam);
        passwordInput.setValue(passwordInputParam);

        AllAssertions.loginFuncCheck(loginInputParam, passwordInputParam);

        loginButton.shouldBe(visible, Duration.ofSeconds(3)).click();
    }
}
