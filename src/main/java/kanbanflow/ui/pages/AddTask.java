package kanbanflow.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *Class let add new task in the board.
 */
public class AddTask {
    @FindBy(className = "columnHeader-addTask")
    private WebElement addTask;
    @FindBy(className = "addTaskDialog-formRow addTaskDialog-nameWrapper")
    private WebElement addTaskName;
    @FindBy(className = "addTaskDialog-buttonWrapper")
    private WebElement sendSave;

    /**
     *Method to let a send a description to the task.
     *
     * @param description this is an argument.
     */
    public void setAddNewToDo(String description) {
        addTask.click();
        addTaskName.sendKeys(description);
        sendSave.click();
    }
}
