package Steps;

import Elements.AllAssertions;
import Elements.AuthPageElements;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class AuthPageSteps extends AuthPageElements {
    public static void loginFunc(String loginInputParam, String passwordInputParam) {
        loginInput.setValue(loginInputParam);
        passwordInput.setValue(passwordInputParam);

        AllAssertions.loginFuncCheck(loginInputParam, passwordInputParam);

        loginButton.shouldBe(visible, Duration.ofSeconds(3)).click();
    }
}
