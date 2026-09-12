package com.example.tp;

public class InvalidUserException extends Exception {
   
    public InvalidUserException(String message) {
        super(message);
    }
}