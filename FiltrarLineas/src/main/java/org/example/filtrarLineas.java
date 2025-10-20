package org.example;

import java.io.*;

public class filtrarLineas {
    public static void main( String[] args ){
        // Creo un reader que utiliza los datos que la consola ha mostrado
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            String linea;
            // Creo un bucle que lea los datos mostrados en consola
            while((linea = br.readLine())!=null) {
                // Filtro por las lineas mayores a 20 palabras
                if (linea.length() > 20) {
                    System.out.println(linea);
                }
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}


