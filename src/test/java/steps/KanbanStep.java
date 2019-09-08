package steps;

import core.selenium.WebDriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import kanbanflow.ui.pages.AddTask;
import kanbanflow.ui.pages.InviteMember;
import kanbanflow.ui.pages.LoginPage;
import kanbanflow.ui.pages.PageTransporter;


public class KanbanStep {
    LoginPage loginPage;
    PageTransporter pageTransporter;
    InviteMember inviteMember;
    AddTask addTask;
    @Then("The access is successfuly")
    public void theAccessIsSuccessfuly() {
        WebDriverManager.getInstance().getDriver().quit();
    }

    @Given("The user go to the page kanbanflow")
    public void theUserGoToThePageKanbanflow() {
        pageTransporter = new PageTransporter();
        loginPage = pageTransporter.goToLoginPage();
    }

    @When("The user login to kanbanflow")
    public void theUserLoginToKanbanflow() {
        loginPage.signIn("jesus.menacho@fundacion-jala.org", "lapizx123");
    }

    @Given("The user go to the page kanbanflow to login")
    public void theUserGoToThePageKanbanflowToLogin() {
        pageTransporter = new PageTransporter();
        loginPage = pageTransporter.goToLoginPage();
        loginPage.signIn("jesus.menacho@fundacion-jala.org", "lapizx123");
    }

    @When("The user add new member")
    public void theUserAddNewMember() {
        inviteMember.setAddMember("jesus.menacho@fundacion-jala.org");
    }

    @When("The user add new task to do")
    public void theUserAddNewTaskToDo() {
        addTask.setAddNewToDo("Task1");
    }
}
