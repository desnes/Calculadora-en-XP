package com.example;

public class Main {
    public static void main(String[] args) {
        Archivo archivo = new Archivo("Grupo-01/XP/03-Coding/demo/src/main/java/com/example/contraseña.txt");
        Cuenta cuenta1 = new Cuenta("Facebook", "andresito123");
        Cuenta cuenta2 = new Cuenta("Gmail", cuenta1.generarContraseña());
        archivo.guardarArchivo(cuenta1);
        archivo.guardarArchivo(cuenta2);
        archivo.leerArchivo();
    }

}