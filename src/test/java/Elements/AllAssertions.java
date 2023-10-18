package Elements;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import static Elements.AuthPageElements.*;
import static Elements.SingleTaskPageElement.*;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllAssertions {
    public static void loginFuncCheck(String loginInputParam, String passwordInputParam) {
        assertAll("Login, Password fields fill check",
                () -> assertEquals(loginInput.getValue(), loginInputParam),
                () -> assertEquals(passwordInput.getValue(), passwordInputParam)
        );
    }

    public static void loginCheck() {
        assertAll("Login, Password fields fill check",
                () -> Assertions.assertTrue((!loginInput.exists()))
        );
    }

    public static void taskTest(String issueTypeParam,
                                String issueValueParam,
                                String versionFieldParam,
                                String priorityFieldParam,
                                String labelSelectTestParam,
                                String descriptionAreaParam,
                                String testEnvironmentAreaParam) {
        assertAll("Task fields fill check",
                () -> assertEquals(issueType.getValue(), issueTypeParam),
                () -> assertEquals(issueValue.getValue(), issueValueParam),
                () -> assertEquals(versionField.getText(), versionFieldParam),
                () -> assertEquals(priorityField.getValue(), priorityFieldParam),
                () -> assertEquals(labelSelectTest.getText(), labelSelectTestParam),
                () -> assertEquals(descriptionArea.getValue(), descriptionAreaParam),
                () -> assertEquals(testEnvironmentArea.getValue(), testEnvironmentAreaParam)
        );

    }

    public static void taskCheck(String taskStatusCheckInWorkParam, String versionFieldParam) {
        assertAll("Version, Status of task check",
                () -> assertEquals(taskStatusCheckInWorkParam, status.getText()),
                () -> assertEquals(versionFieldParam, version.getText())
        );

    }

    public static void completeTaskCheck(SelenideElement statusField, String statusParam) {
        sleep(2000);
        assertAll("Status of task check",
                () -> assertEquals(statusField.getText(), statusParam));
    }
}
