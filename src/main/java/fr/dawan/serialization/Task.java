package fr.dawan.serialization;

import java.io.Serializable;

public class Task implements Serializable {
    private String title;
    private String status;// "Pending", "In Progress", "Completed"
    private boolean isCompleted;
    private int priority;  // 1 (High), 2 (Medium), 3 (Low)

    public Task(){

    }

    public Task(String title, String status, boolean isCompleted, int priority) {
        this.title = title;
        this.status = status;
        this.isCompleted = isCompleted;
        this.priority = priority;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public String getTitle() {
        return title;
    }


    public String getStatus() {
        return status;
    }


    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", status='" + status + '\'' +
                ", isCompleted=" + isCompleted +
                ", priority=" + priority +
                '}';
    }
}
