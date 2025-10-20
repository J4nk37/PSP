package org.example;

import java.io.*;

public class lectorTexto {
    public static void main( String[] args ) {
        // Creo la variable que utilizara el entrada.txt como Stream
        InputStream isr = lectorTexto.class.getClassLoader().getResourceAsStream("entrada.txt");

        try {
            // Creo el reader y hago que utilize la variable creada anteriormente
            BufferedReader br = new BufferedReader(new InputStreamReader(isr));
            String linea;
            // Uso el bucle while para leer entrada.txt y que imprima las lineas que vaya encontrando
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }


        } catch (IOException e) {
            System.out.println("Error en el programa: " + e.getMessage());
        }
    }

}
