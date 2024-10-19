//The task class has description and completion status
public class Task {
    private String description;
    private boolean completed;

//Constructor initializes task as not completed
    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

//Getter method  
    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

//Method to mark task completed
    public void markCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return description + " - " + (completed ? "Completed" : "Pending");
    }
}
