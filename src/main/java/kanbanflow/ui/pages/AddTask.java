package kanbanflow.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddTask {
    @FindBy(className = "columnHeader-addTask")
    private WebElement addTask;
    @FindBy(className = "addTaskDialog-formRow addTaskDialog-nameWrapper")
    private WebElement addTaskName;
    @FindBy(className = "addTaskDialog-buttonWrapper")
    private WebElement sendSave;

    public void setAddNewToDo(String description) {
        addTask.click();
        addTaskName.sendKeys(description);
        sendSave.click();
    }
}
