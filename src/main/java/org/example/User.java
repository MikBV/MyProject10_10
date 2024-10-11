package org.example;

public class User {
    private int id;
    static int idCounter = 0;
    public User () {
        id = ++idCounter;
    }
}
