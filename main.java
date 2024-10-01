public class TodoList {
    // Class to represent a single Todo item with a description and a due date
    class TodoItem {
        String description;
        String dueDate;  // Added from add-date branch

        public TodoItem(String description, String dueDate) {
            this.description = description;
            this.dueDate = dueDate; // Initialize due date
        }

        @Override
        public String toString() {
            return "Task: " + description + ", Due: " + dueDate; // Modified to include due date
        }
    }

    // Array to store the Todo items
    private TodoItem[] todoItems;
    private int count;

    // Constructor
    public TodoList(int size) {
        todoItems = new TodoItem[size];
        count = 0;
    }

    // Method to add a new Todo item (From add-todo branch)
    public void addTodoItem(String description, String dueDate) {
        if (count < todoItems.length) {
            todoItems[count] = new TodoItem(description, dueDate); // Use description and due date
            count++;
        } else {
            System.out.println("Todo list is full!");
        }
    }

    // Method to display all Todo items
    public void displayTodoItems() {
        for (int i = 0; i < count; i++) {
            System.out.println(todoItems[i]);
        }
    }

    public static void main(String[] args) {
        // Create a TodoList object with space for 5 items
        TodoList myTodoList = new TodoList(5);

        // Add a few Todo items
        myTodoList.addTodoItem("Finish project", "2024-10-05");
        myTodoList.addTodoItem("Buy groceries", "2024-10-06");

        // Display all items
        myTodoList.displayTodoItems();
    }
}
