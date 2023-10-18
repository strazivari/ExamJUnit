package steps;

import elements.AllAssertions;
import elements.MainPageElements;
import io.qameta.allure.Step;

public class MainPageSteps extends MainPageElements {
    @Step("Открытие списка тестов, выбор конкретного теста")
    public static void goToRequiredProject() {
        listOfCurrentProjects.click();
        requiredProject.click();

        AllAssertions.loginCheck();
    }

}
