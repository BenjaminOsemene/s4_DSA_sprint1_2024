//The User class has user name and to-do list(single linked list)
public class User {
    private String name;
    private TaskList todoList;

//Constructor initializes new user with name and empty to-do-list 
    public User(String name) {
        this.name = name;
        this.todoList = new TaskList();
    }

//Getter method  
    public String getName() {
        return name;
    }

//Method to add new task to user to-do list  
    public void addTask(String description) {
        todoList.addTask(new Task(description));
    }

//Method to mark task as completed  in user to-do list
    public void markTaskCompleted(String description) {
        todoList.markTaskCompleted(description);
    }

//Method to print all tasks in user to-do list
    public void printTasks() {
        System.out.println("Tasks for " + name + ":");
        todoList.printTasks();
        System.out.println();
    }
}