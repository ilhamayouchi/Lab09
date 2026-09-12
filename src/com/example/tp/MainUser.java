package com.example.tp;

public class MainUser {
    public static void main(String[] args) {
        User[] users = {
            new User("Alice", 30),   
            new User("", 25),        
            new User("Bob", 16)      
        };

        for (User u : users) {
            try {
                u.validate();
                System.out.println("Utilisateur validé : " + u);
            } catch (InvalidUserException e) {
                try (java.io.FileWriter fw = new java.io.FileWriter("error.log", true)) {
                    fw.write("Validation échouée : " + e.getMessage() + "\n");
                } catch (java.io.IOException ioEx) {
                    System.err.println("Impossible d'écrire dans error.log : " + ioEx.getMessage());
                }
            }
        }
    }
}