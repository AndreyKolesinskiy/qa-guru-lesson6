package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class LambdaStepsTest {

    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final String ISSUE_NAME = "Listeners NamedBy";

    @Test
    @DisplayName("Checking that issue is displayed in the list")
    public void searchIssueLambdaStepsTest() {
        step("Open main page", () -> {
            open("https://github.com/");
        });
        step("Search repository: " + REPOSITORY, () -> {
            $("[name=q]").val(REPOSITORY).pressEnter();
        });
        step("Open repository", () -> {
            $(linkText(REPOSITORY)).click();
        });
        step("Open Issues tab", () -> {
            $("#issues-tab").click();
        });
        step("Check issue by name: " + ISSUE_NAME, () -> {
            $(byText(ISSUE_NAME)).shouldBe(visible);
        });
    }
}
