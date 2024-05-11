package todoList;

import java.util.ArrayList;

public class TodoList {
    ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void remove(int index) {
        this.tasks.remove(index - 1);
    }

    public void print() {
        int index;
        for (int i=0; i<this.tasks.size(); i++) {
            index = i + 1;
            System.out.println(index + ": " + tasks.get(i));
        }
    }

}
