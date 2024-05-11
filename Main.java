package todoList;

public class Main {

    public static void main(String[] args) {
        TodoList todos = new TodoList();
        todos.add("read the course material");
        todos.add("watch the latest fool us");
        todos.add("take it easy");
        todos.print();
        todos.remove(2);
        todos.print();
        todos.add("buy raisins");
        todos.print();
        todos.remove(1);
        todos.remove(1);
        todos.print();
    }

}
