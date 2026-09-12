package com.example.tp;

import java.io.*;
import java.util.*;

/**
 * Classe utilitaire pour lire un fichier de nombres entiers.
 */
public class FileUtil {

    /**
     * Lit toutes les lignes du fichier spécifié, convertit chacune
     * en Integer, et renvoie la liste des valeurs valides.
     *
     * @param path chemin vers le fichier (par ex. "numbers.txt")
     * @return liste des entiers lus (vide en cas d’erreur)
     */
    public static List<Integer> readNumbers(String path) {
        List<Integer> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                list.add(Integer.parseInt(line));
            }

        } catch (IOException e) {
            try (FileWriter fw = new FileWriter("error.log", true)) {
                fw.write("I/O error: " + e.getMessage() + "\n");
            } catch (IOException ioEx) {
                System.err.println("Impossible d'écrire dans error.log : " + ioEx.getMessage());
            }

        } catch (NumberFormatException e) {
            try (FileWriter fw = new FileWriter("error.log", true)) {
                fw.write("Format invalide dans le fichier: " + e.getMessage() + "\n");
            } catch (IOException ioEx) {
                System.err.println("Impossible d'écrire dans error.log : " + ioEx.getMessage());
            }
        }

        return list;
    }
}