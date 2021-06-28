package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();
        todoList.addTodoItem(new TodoItem("dishes"));
        todoList.addTodoItem(new TodoItem("laundry"));
        todoList.getTodoItem(0).markComplete();
        String menuOption;
        do {
            menuOption = Menu.displayMenuAndGetUserChoice(scanner);
            switch(menuOption) {
                case "1":
                    System.out.println(todoList.getItemList());
                    break;
                case "2":
                    System.out.println(todoList.getIncompletedList());
                    break;
                case "3":
                    System.out.println("What would you like to add?");
                    todoList.addTodoItem(new TodoItem(scanner.nextLine()));
                    break;
                case "4":
                    System.out.println("Which item would you like to mark as complete?");
                    System.out.println(todoList.getItemList());
                    int index = scanner.nextInt() - 1;
                    scanner.nextLine();
                    todoList.getTodoItem(index).markComplete();
                    break;
                case "5":
                    System.out.println(todoList.getCompletedList());
                    break;
                case "6":
                    todoList.removeCompletedItems();
                    break;
                case "7":
                    System.out.println("Goodbye");
                    break;
            }
        } while(!menuOption.equals("7"));
    }
}
