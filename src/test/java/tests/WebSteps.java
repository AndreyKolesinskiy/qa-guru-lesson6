package tests;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class WebSteps {

    @Step("Open main page")
    public void openMainPage() {
        open("https://github.com/");
    }

    @Step("Search repository: [{repository}]")
    public void searchRepository(String repository) {
        $("[name=q]").val(repository).pressEnter();
    }

    @Step("Open repository: [{repository}]")
    public void openRepository(String repository) {
        $(linkText(repository)).click();
    }

    @Step("Open Issues tab")
    public void openIssuesTab() {
        $("#issues-tab").click();
    }

    @Step("Check issue by name: [{issueName}]")
    public void checkIssueIsDisplayed(String issueName) {
        $(byText(issueName)).shouldBe(visible);
    }
}
