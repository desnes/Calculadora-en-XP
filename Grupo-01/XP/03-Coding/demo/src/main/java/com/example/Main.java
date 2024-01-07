package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Archivo archivo = new Archivo("Grupo-01/XP/03-Coding/demo/src/main/java/com/example/contraseña.txt");
        Scanner scanner = new Scanner(System.in);
        String sitioWeb, clave;
        int opcion;

        do {
            mostrarMenu();
            System.out.print(" Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Cuenta cuenta = new Cuenta();
                    System.out.println("Ingresa el sitio web: ");
                    sitioWeb = scanner.nextLine();
                    cuenta.setSitioWeb(scanner.nextLine());
                    System.out.println("Ingresa la contraseña: ");
                    clave = scanner.nextLine();
                    cuenta.setContraseña(clave);
                    archivo.guardarArchivo(cuenta);
                    break;
                case 2:
                    Cuenta cuenta1 = new Cuenta();
                    System.out.println("Ingresa el sitio web: ");
                    sitioWeb = scanner.nextLine();
                    cuenta1.setSitioWeb(scanner.nextLine());
                    clave = cuenta1.generarContraseña();
                    cuenta1.setContraseña(clave);
                    archivo.guardarArchivo(cuenta1);
                    break;
                case 3:
                    archivo.leerArchivo();
                    break;

                case 4:
                    System.out.println("Finalizado");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
            }

        } while (opcion != 4);
            scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("===== Gestor de contraseñas =====");
        System.out.println("1. Personalizada");
        System.out.println("2. Automática");
        System.out.println("3. Mostrar todo");
        System.out.println("4. Salir");
        System.out.println("=============================");
    }

}