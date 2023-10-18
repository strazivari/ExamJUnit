package Steps;

import Elements.TasksPageElements;
import io.qameta.allure.Step;

import static Elements.AllAssertions.completeTaskCheck;

public class TasksPageSteps extends TasksPageElements {
    @Step("Провека количества задач в проекте")
    public static void showAmountOfCompletedTasks() {
        tasksPage.click();
        String text = completedTasks.getText();
        String[] words = text.split(" ");
        System.out.println("Количество задач в проекте:" + words[2]);

    }

    public static void search(String searchInputParam) {
        searchInput.setValue(searchInputParam);
        firstSearchResult.click();
    }

    public static void completeTask(String searchSortTestParam,
                                    String searchFilterTestParam,
                                    String taskStatusCheckDoneParam,
                                    String taskStatusCheckInWorkParam,
                                    String taskStatusCheckReopenParam,
                                    String taskStatusCheckFinishedParam,
                                    String taskStatusCheckFinished2Param) {

        searchFilter.click();
        myOpenedTasks.click();
        completeTaskCheck(searchFilterTest, searchFilterTestParam);

        filterActivation.click();
        filterByDate.click();
        completeTaskCheck(searchSortTest, searchSortTestParam);

        lastTask.click();

        inProgressTask.click();
        completeTaskCheck(taskStatusCheck, taskStatusCheckInWorkParam);

        businessProcessTask.click();
        executedTask.click();
        submitButtonTask.click();
        completeTaskCheck(taskStatusCheck, taskStatusCheckDoneParam);

        businessProcessTask.click();
        reopenedTask.click();
        submitButtonTask.click();
        completeTaskCheck(taskStatusCheck, taskStatusCheckReopenParam);

        businessProcessTask.click();
        inWorkTask.click();
        completeTaskCheck(taskStatusCheck, taskStatusCheckInWorkParam);

        businessProcessTask.click();
        executedTask.click();
        submitButtonTask.click();
        completeTaskCheck(taskStatusCheck, taskStatusCheckDoneParam);

        businessProcessTask.click();
        approvedTask.click();
        submitButtonTask.click();
        completeTaskCheck(taskStatusCheck, taskStatusCheckFinishedParam);

        doneTask.click();
        completeTaskCheck(taskStatusCheck2, taskStatusCheckFinished2Param);

    }
}
