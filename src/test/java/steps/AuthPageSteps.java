package steps;

import elements.AllAssertions;
import elements.AuthPageElements;
import io.qameta.allure.Step;

public class AuthPageSteps extends AuthPageElements {
    @Step("Форма ввода логина, пароля")
    public static void loginFunc(String loginInputParam, String passwordInputParam) {
        loginInput.setValue(loginInputParam);
        passwordInput.setValue(passwordInputParam);

        AllAssertions.loginFuncCheck(loginInputParam, passwordInputParam);

        loginButton.click();

        AllAssertions.loginCheck();
    }
}
