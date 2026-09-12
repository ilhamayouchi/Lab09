package com.example.tp;

/**
 * Programme de test pour la classe Calculator.
 * Illustre l'utilisation de try–catch–finally pour gérer les exceptions.
 */
public class MainCalc {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        try {
            System.out.println("10 / 2 = " + calc.div(10, 2));

            System.out.println("10 / 0 = " + calc.div(10, 0));

        } catch (ArithmeticException ex) {
            try (java.io.FileWriter fw = new java.io.FileWriter("error.log", true)) {
                fw.write("Erreur de calcul : " + ex.getMessage() + "\n");
            } catch (java.io.IOException ioEx) {
                System.err.println("Impossible d'écrire dans error.log : " + ioEx.getMessage());
            }

        } finally {
            System.out.println("Fin du calcul.");
        }
    }
}