package fr.dawan.enumerator;

import java.io.Serializable;

public class Task implements Serializable {
    private String title;
    private Status status;// "Pending", "In Progress", "Completed"
    private boolean isCompleted;
    private int priority;  // 1 (High), 2 (Medium), 3 (Low)

    public Task(){

    }

    public Task(String title, Status status, boolean isCompleted, int priority) {
        this.title = title;
        this.status = status;
        this.isCompleted = isCompleted;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", status=" + status +
                ", isCompleted=" + isCompleted +
                ", priority=" + priority +
                '}';
    }
}
