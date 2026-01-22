package fr.dawan.collections.exos;

public class Task {
    private String title;
    private String status; // "Pending", "In Progress", "Completed"
    private int priority;  // 1 (High), 2 (Medium), 3 (Low)
    private int duration;  // Duration in hours


    public Task(String title, String status, int priority, int duration) {
        this.title = title;
        this.status = status;
        this.priority = priority;
        this.duration = duration;
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


    public int getDuration() {
        return duration;
    }


    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", status='" + status + '\'' +
                ", priority=" + priority +
                ", duration=" + duration +
                '}';
    }

}
