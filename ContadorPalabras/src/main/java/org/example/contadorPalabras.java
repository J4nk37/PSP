package org.example;

import java.io.*;

public class contadorPalabras {
    public static void main(String[] args) {
        int total = 0;
        // Creo un reader dentro del try que reciba los datos de la consola
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String linea;
            // Creo un bucle que lea los datos de la consola
            while ((linea = br.readLine()) != null) {
                // Utilizo la funcion trim y split para procesar las lineas 1 a 1
                String[] palabras = linea.trim().split("\\s+");
                // Creo un bucle para que vaya contando las palabras al leerla si estas existen
                for (String p : palabras) {
                    if (!p.isEmpty()) total++;
                }
            }
            System.out.println("Total de palabras: " + total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


