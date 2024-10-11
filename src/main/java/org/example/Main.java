package org.example;

import java.sql.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        User user1 = new User();
        try {
            Connection connection = DriverManager.getConnection("mytestdb");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}