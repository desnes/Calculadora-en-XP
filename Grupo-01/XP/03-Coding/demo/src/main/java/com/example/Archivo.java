package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {
    String rutaArchivo;

    public Archivo(String rutaDelArchivo) {
        this.rutaArchivo = rutaDelArchivo;
    }

    public void leerArchivo() {
        try {
            File archivo = new File(rutaArchivo);
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Leer cada línea del archivo y mostrarla en la consola
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarArchivo(Cuenta cuenta) {
        try {
            FileWriter fileWriter = new FileWriter(this.rutaArchivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(cuenta.getSitioWeb().toUpperCase() + ": " + cuenta.getContraseña());
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
            System.out.println("Contraseña guardada");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
