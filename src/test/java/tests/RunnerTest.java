package tests;

import hooks.WebHooks;
import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import static steps.AuthPageSteps.*;
import static steps.MainPageSteps.*;
import static steps.TasksPageSteps.*;
import static steps.SingleTaskPageSteps.*;

import static configuration.Configuration.getProperty;

public class RunnerTest extends WebHooks {
    @Test
    @Owner("Владислав Ахметов")
    @Link(name = "EduJira", url = "https://edujira.ifellow.ru")
    @Description("Ui тестирование EduJira")
    public void jiraTest() {
        chromeTest(getProperty("host"));
        loginFunc(getProperty("login"), getProperty("password"));
        goToRequiredProject();
        showAmountOfCompletedTasks();
        search(searchInputParam);
        taskCheck(taskStatusCheckInWorkParam, versionFieldParam);
        createTask(issueTypeParam,
                issueValueParam,
                versionFieldParam,
                priorityFieldParam,
                labelSelectTestParam,
                descriptionAreaParam,
                testEnvironmentAreaParam);
        completeTask(searchSortTestParam,
                searchFilterTestParam,
                taskStatusCheckDoneParam,
                taskStatusCheckInWorkParam,
                taskStatusCheckReopenParam,
                taskStatusCheckFinishedParam,
                taskStatusCheckFinished2Param);
    }
}
