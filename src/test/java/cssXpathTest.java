import Hooks.WebHooks;
import Steps.SingleTaskPageSteps;
import org.junit.Test;

import static Steps.AuthPageSteps.*;
import static Steps.MainPageSteps.*;
import static Steps.TasksPageSteps.*;
import static Steps.SingleTaskPageSteps.*;


import static configuration.Configuration.getProperty;
public class cssXpathTest extends WebHooks {
    @Test
    public void jiraTest() {
        chromeTest(getProperty("host"));
        loginFunc(getProperty("login"), getProperty("password"));
        goToRequiredProject();
        showAmountOfCompletedTasks();
        search("TestSelenium");
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
