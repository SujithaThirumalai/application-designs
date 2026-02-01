import java.util.ArrayList;

// Task class
class Task {
    int id;
    String title;
    boolean isCompleted;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.isCompleted = false;
    }
}

// TodoList class
class TodoList {
    ArrayList<Task> tasks = new ArrayList<>();
    int taskIdCounter = 1;

    // Add a new task
    public void addTask(String title) {
        Task task = new Task(taskIdCounter, title);
        tasks.add(task);
        taskIdCounter++;
        System.out.println("Task added successfully.");
    }

    // View all tasks
    public void getAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        for (Task task : tasks) {
            System.out.println(
                "ID: " + task.id +
                ", Title: " + task.title +
                ", Completed: " + task.isCompleted
            );
        }
    }

    // Mark task as completed
    public void markTaskCompleted(int id) {
        for (Task task : tasks) {
            if (task.id == id) {
                if (task.isCompleted) {
                    System.out.println("Task already completed.");
                } else {
                    task.isCompleted = true;
                    System.out.println("Task marked as completed.");
                }
                return;
            }
        }
        System.out.println("Invalid task ID.");
    }
}

// Main class
public class TodoListApp {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        todoList.addTask("Learn Java");
        todoList.addTask("Practice DSA");
        todoList.addTask("Push code to GitHub");

        System.out.println("\nAll Tasks:");
        todoList.getAllTasks();

        System.out.println("\nMarking task 2 as completed:");
        todoList.markTaskCompleted(2);

        System.out.println("\nUpdated Tasks:");
        todoList.getAllTasks();
    }
}

