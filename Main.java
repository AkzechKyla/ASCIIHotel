import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Action {
    String name;

    Action(String name) {
        this.name = name;
    }

    abstract void call();
}

class UserInteraction {
    final Scanner scanner = new Scanner(System.in);

    void nextInput(Action[] choices) {
        System.out.println("\nChoose your option:");

        for (int i = 0; i < choices.length; i++) {
            System.out.println(String.format("%d. %s", i + 1, choices[i].name));
        }

        System.out.print("\n>> ");
        int choice;

        try {
            choice = scanner.nextInt() - 1;
        } catch (InputMismatchException e) {
            choice = -1;
        }

        if (choice >= 0 && choice < choices.length) {
            Action action = choices[choice];
            action.call();
        } else {
            System.out.println("Invalid choice!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        final Action[] choices = {
            new Action("Play") {
                void call() {
                    System.out.println("Hello, World!");
                }
            },
            new Action("Exit") {
                void call() {
                    System.out.println("Goodbye!");
                }
            }
        };

        final UserInteraction inter = new UserInteraction();

        System.out.println("ASCII HOTEL");
        inter.nextInput(choices);
    }
}
