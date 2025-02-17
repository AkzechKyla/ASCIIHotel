package src;
import java.util.InputMismatchException;
import java.util.Scanner;

import src.utils.PrettyPrint;

public class UserInteraction {
    final Scanner scanner = new Scanner(System.in);

    public void nextInput(Action[] choices) {
        PrettyPrint.border("Welcome to ASCII Hotel!");

        System.out.println("\nChoose your option:");

        for (int i = 0; i < choices.length; i++) {
            System.out.println(String.format("%d. %s", i + 1, choices[i].name));
        }

        System.out.print("\n>> ");
        int choice;

        try {
            choice = scanner.nextInt() - 1;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            choice = -1;
        }

        if (choice >= 0 && choice < choices.length) {
            Action action = choices[choice];
            action.call(this);
        } else {
            System.out.println("Invalid choice!");
            nextInput(choices);
        }
    }
}
