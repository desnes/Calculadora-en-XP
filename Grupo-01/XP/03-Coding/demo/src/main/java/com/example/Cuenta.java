package com.example;

import java.security.SecureRandom;

public class Cuenta {
    private String sitioWeb;
    private String contraseña;

    //Constructor Vacio
    public Cuenta() {
        
    }
    
    //Constructor con parámetros tipo String
    public Cuenta(String sitioWeb, String contraseña) {
        this.sitioWeb = sitioWeb;
        this.contraseña = contraseña;
    }

    //Obtener el sitio web
    public String getSitioWeb() {
        return sitioWeb;
    }
    
    //Retornar el sitio web
    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }
    
    ////Obtener la contraseña
    public String getContraseña() {
        return contraseña;
    }
    
    //Retornar la contraseña
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    //Retornar verdadero si la contraseña se genera automáticamente
    public boolean esGenerada() {
        return true;
    }
    
    //Método que genera una contraseña de forma aleatoria
    public String generarContraseña() {
        int longitud = 10;
        // Caracteres permitidos
        String caracteresMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String caracteresMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolosEspeciales = "!@#$%^&*()=+[]{}|'<>/?";

        // Combinación de caracteres.
        String caracteresTotales = caracteresMayusculas + caracteresMinusculas + numeros + simbolosEspeciales;
        SecureRandom random = new SecureRandom();
        char mayuscula = caracteresMayusculas.charAt(random.nextInt(caracteresMayusculas.length()));
        char minuscula = caracteresMinusculas.charAt(random.nextInt(caracteresMinusculas.length()));
        char numero = numeros.charAt(random.nextInt(numeros.length()));
        char simbolo = simbolosEspeciales.charAt(random.nextInt(simbolosEspeciales.length()));

        // Restar 4 para dejar espacio para los caracteres ya seleccionados
        int longitudRestante = longitud - 4;

        // Generar la parte restante de la clave
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longitudRestante; i++) {
            char caracter = caracteresTotales.charAt(random.nextInt(caracteresTotales.length()));
            sb.append(caracter);
        }

        // Mezclar todos los caracteres y devolver la clave
        return ("" + mayuscula + minuscula + numero + simbolo + sb.toString());
    }

    



}
