package com.company;

public class TodoItem {
    private String name;
    private boolean completed = false;

    public TodoItem(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean getCompleted() {
        return this.completed;
    }

    public void markComplete() {
        this.completed = true;
    }
}
