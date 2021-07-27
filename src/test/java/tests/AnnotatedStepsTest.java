package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnnotatedStepsTest {

    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final String ISSUE_NAME = "Listeners NamedBy";

    WebSteps steps = new WebSteps();

    @Test
    @DisplayName("Checking that issue is displayed in the list")
    public void searchIssueAnnotatedStepsTest() {
        steps.openMainPage();
        steps.searchRepository(REPOSITORY);
        steps.openRepository(REPOSITORY);
        steps.openIssuesTab();
        steps.checkIssueIsDisplayed(ISSUE_NAME);
    }
}
