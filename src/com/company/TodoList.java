package com.company;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<TodoItem> items;

    public TodoList() {
        this.items = new ArrayList<TodoItem>();
    }

    public void addTodoItem(TodoItem item) {
        this.items.add(item);
    }

    public TodoItem getTodoItem(int index) {
        return this.items.get(index);
    }

    public String getItemList() {
        String output = "----TODO ITEMS----\n";
        for(int i = 1; i < this.items.size() + 1; i++) {
            TodoItem item = this.items.get(i - 1);
            output += i + ". " + item.getName() + " completed: " + item.getCompleted() + "\n";
        }
        output += "-".repeat(18);
        return output;
    }

    public String getCompletedList() {
        String output = "--COMPLETED ITEMS--\n";
//        System.out.println("--COMPLETED ITEMS--");
        ArrayList<TodoItem> completedItems = new ArrayList<>();
        for(TodoItem item : this.items) {
            if(item.getCompleted()) {
                completedItems.add(item);
            }
        }
        for(int i = 1; i < completedItems.size() + 1; i++) {
            TodoItem item = completedItems.get(i - 1);
            output += i + ". " + item.getName() + " completed: " + item.getCompleted() + "\n";
        }
        output += "-".repeat(19);
        return output;
    }

    public String getIncompletedList() {
        String output = "--INCOMPLETED ITEMS--\n";
        ArrayList<TodoItem> incompletedItems = new ArrayList<>();
        for(TodoItem item : this.items) {
            if(!item.getCompleted()) {
                incompletedItems.add(item);
            }
        }
        for(int i = 1; i < incompletedItems.size() + 1; i++) {
            TodoItem item = incompletedItems.get(i - 1);
            output += i + ". " + item.getName() + " completed: " + item.getCompleted() + "\n";
        }
        output += "-".repeat(21);
        return output;
    }

    public void removeCompletedItems() {
        ArrayList<Integer> removeIndexes = new ArrayList<Integer>();
        for(int i = this.items.size() - 1; i > -1; i--) {
            if(this.items.get(i).getCompleted()) {
                removeIndexes.add(i);
            }
        }
        for(int index : removeIndexes) {
            this.items.remove(index);
        }
    }
}
