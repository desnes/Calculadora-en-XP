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
            String automatica;

            switch (opcion) {
                case 1:
                    Cuenta cuenta = new Cuenta();
                    System.out.println("Ingresa el sitio web: ");
                    sitioWeb = scanner.nextLine();
                    cuenta.setSitioWeb(scanner.nextLine());
                    System.out.println("Ingresa la contraseña: ");
                    clave = scanner.nextLine();
                    while (clave.length()<8) {
                        System.out.println("Ingrese una contraseña mayor a 8 caracteres: ");
                        clave = scanner.nextLine();
                    }
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
                    Cuenta cuenta2 = new Cuenta();
                    System.out.println("Ingresa el sitio web: ");
                    sitioWeb = scanner.nextLine();
                    cuenta2.setSitioWeb(scanner.nextLine());
                    System.out.println("¿Desea añadir una contraseña automática? SI/NO: ");
                    automatica = scanner.nextLine();
                    if (automatica.equalsIgnoreCase("SI")) {
                        clave = cuenta2.generarContraseña();
                        cuenta2.setContraseña(clave);
                        archivo.actualizarArchivo(cuenta2.getSitioWeb(), clave);
                    }else{
                        System.out.println("Ingresa la contraseña: ");
                        clave = scanner.nextLine();
                        while (clave.length()<8) {
                            System.out.println("Ingrese una contraseña mayor a 8 caracteres: ");
                            clave = scanner.nextLine();
                        }
                        cuenta2.setContraseña(clave);
                        archivo.actualizarArchivo(cuenta2.getSitioWeb(), clave);
                    }
                    break;

                case 5:
                    System.out.println("Ingresa el sitio web: ");
                    scanner.nextLine(); // Consumir la nueva línea pendiente
                    sitioWeb = scanner.nextLine();
                    archivo.eliminarCuenta(sitioWeb);
                    break;

                case 6:
                    System.out.println("Finalizado");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
            }

        } while (opcion != 6);
            scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("========== Gestor de contraseñas =========");
        System.out.println("1. Crear contraseña personalizada");
        System.out.println("2. Crear contraseña automática");
        System.out.println("3. Mostrar todas las contraseñas");
        System.out.println("4. Actualizar contraseña");
        System.out.println("5. Eliminar contraseña");
        System.out.println("5. Salir");
        System.out.println("==========================================");
    }

}