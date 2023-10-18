package Steps;

import Elements.AllAssertions;
import Elements.MainPageElements;

public class MainPageSteps extends MainPageElements {
    public static void goToRequiredProject() {
        listOfCurrentProjects.click();
        requiredProject.click();

        AllAssertions.loginCheck();
    }

}
