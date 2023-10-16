package Steps;

import Elements.AllAssertions;
import Elements.MainPageElements;
import org.junit.jupiter.api.Assertions;

import static Elements.AuthPageElements.loginInput;

public class MainPageSteps extends MainPageElements {
    public static void goToRequiredProject() {
        listOfCurrentProjects.click();
        requiredProject.click();

        AllAssertions.loginCheck();
    }

}
