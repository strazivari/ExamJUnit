import Hooks.WebHooks;
import Steps.SingleTaskPageSteps;
import org.junit.jupiter.api.Test;
import static Steps.AuthPageSteps.*;
import static Steps.MainPageSteps.*;
import static Steps.TasksPageSteps.*;

import static configuration.Configuration.getProperty;
public class cssXpathTest extends WebHooks {
    @Test
    public void jiraTest() {
        chromeTest();
        loginFunc(getProperty("login"), getProperty("password"));
        goToRequiredProject();
        showAmountOfCompletedTasks();
        search("TestSelenium");
        SingleTaskPageSteps.taskCheck(taskStatusCheckInWorkParam, versionFieldParam);
        SingleTaskPageSteps.createTask(issueTypeParam,
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
