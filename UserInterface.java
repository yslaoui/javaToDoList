package todoList;

import java.util.Scanner;

public class UserInterface {

    Scanner scanner;
    TodoList list ;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.list = new TodoList();
    }

    public void start() {
        String command;
        String task;
        int index;
        do {
            System.out.print("Command: ");
            command = scanner.nextLine();
            if (command.equals("add")) {
                System.out.print("To add: ");
                task = scanner.nextLine();
                list.add(task);
            }
            if (command.equals("list")) {
                list.print();
            }
            if(command.equals("remove")) {
                System.out.print("Which one to remove ?");
                index = scanner.nextInt();
                list.remove(1);
            }

        } while (!(command.equals("stop")));
    }

}
