//Tasks class to store tasks and their related data
package TaskManagementSystem.data;

import java.time.LocalDate;
import java.util.Date;

public class Tasks {
    int taskId;
    String taskName;
    int priority;
    LocalDate dueDate;

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Tasks(int taskId, String taskName, int priority, LocalDate dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", priority=" + priority +
                ", dueDate=" + dueDate +
                '}';
    }
}
