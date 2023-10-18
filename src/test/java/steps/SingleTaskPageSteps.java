package steps;

import elements.AllAssertions;
import elements.SingleTaskPageElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.sleep;

public class SingleTaskPageSteps extends SingleTaskPageElement {
    @Step("Проверка статуса и версии задания")
    public static void taskCheck(String taskStatusCheckInWorkParam, String versionFieldParam) {
        try {
            AllAssertions.taskCheck(taskStatusCheckInWorkParam, versionFieldParam);
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }

    @Step("Заполнение при созданнии задания")
    public static void createTask(String issueTypeParam,
                                  String issueValueParam,
                                  String versionFieldParam,
                                  String priorityFieldParam,
                                  String labelSelectTestParam,
                                  String descriptionAreaParam,
                                  String testEnvironmentAreaParam) {
        create.click();
        if (!issueType2.getValue().equals(issueTypeParam)) {
            issueType.click();
            sleep(1000);
            issueTypeBug.click();
        }
        issueValue.setValue(issueValueParam);
        descriptionArea.sendKeys(descriptionAreaParam);
        versionField.click();
        if (!priorityFieldMedium.getValue().equals(priorityFieldParam)) {
            priorityField.click();
            priorityFieldMedium.click();
        }
        labelSelect.sendKeys(labelSelectTestParam);
        labelSelect.sendKeys(Keys.RETURN);
        testEnvironmentArea.sendKeys(testEnvironmentAreaParam);
        usedVersions.click();
        chooseExecutor.click();

        AllAssertions.taskTest(issueTypeParam,
                               issueValueParam,
                               versionFieldParam,
                               priorityFieldParam,
                               labelSelectTestParam,
                               descriptionAreaParam,
                               testEnvironmentAreaParam);

        createTaskSubmit.click();
        tasksPage.click();
    }
}
