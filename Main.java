// Main class creates users and add them to array
//Add tasks to users to-do list
//Mark tasks as completed
//Print all tasks for every user
public class Main {
    public static void main(String[] args) {
        User[] users = new User[10];
        users[0] = new User("Alex");
        users[1] = new User("Bab");
        users[2] = new User("Babby");
        users[3] = new User("Bob");
        users[4] = new User("Bobby");
        users[5] = new User("Chad");
        users[6] = new User("Chadly");
        users[7] = new User("Dad");
        users[8] = new User("Daddy");
        users[9] = new User("Dan");

        users[0].addTask("Buy groceries");
        users[0].addTask("Finish homework");
        users[0].addTask("Call mom");
        users[0].addTask("Prepare presentation");
        users[9].addTask("Go to the gym");
        users[1].addTask("Buy fruits");
        users[1].addTask("Finish cooking");
        users[1].addTask("Call doctor");
        users[1].addTask("Schedule dentist appointment");
        users[1].addTask("Pay electricity bill");
        users[2].addTask("Clean the kitchen");
        users[2].addTask("Update resume");
        users[2].addTask("Start a new book");
        users[2].addTask("Plan weekend trip");
        users[2].addTask("Water the plants");
        users[3].addTask("Organize closet");
        users[9].addTask("Backup computer files");
        users[3].addTask("Learn a new recipe");
        users[3].addTask("Write in journal");
        users[3].addTask("Practice meditation");
        users[4].addTask("Attend yoga class");
        users[4].addTask("Call grandparents");
        users[4].addTask("Fix leaky faucet");
        users[4].addTask("Renew library books");
        users[4].addTask("Schedule car maintenance");
        users[5].addTask("Buy birthday gift for friend");
        users[5].addTask("Update social media profiles");
        users[5].addTask("Research new phone plans");
        users[5].addTask("Organize digital photos");
        users[5].addTask("Plan meal prep for the week");
        users[6].addTask("Prepare presentation");
        users[6].addTask("Go to the gym");
        users[6].addTask("Finish project report");
        users[6].addTask("Buy new running shoes");
        users[6].addTask("Schedule team meeting");
        users[7].addTask("Read industry article");
        users[7].addTask("Call client for feedback");
        users[8].addTask("Prepare monthly budget");
        users[8].addTask("Research new software");

        users[0].markTaskCompleted("Buy groceries");
        users[0].markTaskCompleted("Finish homework");
        users[0].markTaskCompleted("Call mom");
        users[1].markTaskCompleted("Buy fruits");
        users[1].markTaskCompleted("Finish cooking");
        users[1].markTaskCompleted("Call doctor");
        users[1].markTaskCompleted("Schedule dentist appointment");
        users[2].markTaskCompleted("Start a new book");
        users[2].markTaskCompleted("Plan weekend trip");
        users[2].markTaskCompleted("Water the plants");
        users[3].markTaskCompleted("Write in journal");
        users[3].markTaskCompleted("Practice meditation");
        users[4].markTaskCompleted("Fix leaky faucet");
        users[4].markTaskCompleted("Renew library books");
        users[5].markTaskCompleted("Buy birthday gift for friend");
        users[5].markTaskCompleted("Update social media profiles");
        users[5].markTaskCompleted("Research new phone plans");
        users[6].markTaskCompleted("Go to the gym");
        users[6].markTaskCompleted("Finish project report");
        users[7].markTaskCompleted("Read industry article");
        users[8].markTaskCompleted("Prepare monthly budget");
        users[9].markTaskCompleted("Backup computer files");

        for (User user : users) {
            user.printTasks();
        }
    }
}