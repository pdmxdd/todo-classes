package com.company;

import java.util.Scanner;

public class Menu {

    public static String displayMenuAndGetUserChoice(Scanner scanner) {
        System.out.println("What would you like to do: ");
        System.out.println("1. View Full Todo List");
        System.out.println("2. View Incomplete Todo Items");
        System.out.println("3. Add Todo Item");
        System.out.println("4. Mark Todo Item as Complete");
        System.out.println("5. View Completed Items");
        System.out.println("6. Remove Completed Items");
        System.out.println("7. EXIT");
        String choice = scanner.nextLine();
        return choice;
    }
}
