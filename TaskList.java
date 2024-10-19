//Task List class and single linked list
public class TaskList {
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

//Head of the single linked list
    private Node head;

//Methods: 
//This method adds new task to end of linked list
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

  // This method finds tasks by its description and marks asbeing completed  
    public void markTaskCompleted(String description) {
        Node current = head;
        while (current != null) {
            if (current.task.getDescription().equals(description)) {
                current.task.markCompleted();
                return;
            }
            current = current.next;
        }
    }

//This method prints all tasks in the linked list 
    public void printTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
}