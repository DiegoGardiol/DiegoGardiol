package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class controlDeExcepciones {
    public void ejercicio1(){
        //Obtener el año actual
        LocalDateTime hoy = LocalDateTime.now();
        int añoActual = hoy.getYear();

        Scanner scanner = new Scanner(System.in);

        // Preguntar el modo de ejecución
        System.out.println("Elige el modo de ejecución:");
        System.out.println("1. Introducir año de nacimiento.");
        System.out.println("2. Introducir edad.");

        // Comprobar si el usuario ha introducido un entero válido
        if (scanner.hasNextInt()) {
            int modo = scanner.nextInt();

            if (modo == 1) {
                // Modo 1: Introducir el año de nacimiento
                System.out.print("Introduce tu año de nacimiento (AAAA): ");
                scanner.nextLine();  // Limpiar el buffer de entrada
                String añoNacimientoStr = scanner.nextLine();

                try {
                    // Convertir el año de nacimiento a entero
                    int añoNacimiento = Integer.parseInt(añoNacimientoStr);

                    // Validar el año de nacimiento
                    if (añoNacimiento >= 1900 && añoNacimiento <= añoActual) {
                        mostrarGeneracion(añoNacimiento);
                    } else {
                        System.out.println("Error: El año de nacimiento debe estar entre 1900 y " + añoActual);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Formato inválido. Debes introducir un número.");
                }

            } else if (modo == 2) {
                // Modo 2: Introducir la edad
                System.out.print("Introduce tu edad: ");

                if (scanner.hasNextInt()) {
                    int edad = scanner.nextInt();

                    // Validar que la edad sea positiva
                    if (edad >= 0) {
                        int añoNacimiento = añoActual - edad;
                        mostrarGeneracion(añoNacimiento);
                    } else {
                        System.out.println("Error: La edad no puede ser negativa.");
                    }
                } else {
                    System.out.println("Error: Formato inválido. Debes introducir un número.");
                }
            } else {
                System.out.println("Modo inválido. Por favor, selecciona 1 o 2.");
            }
        } else {
            System.out.println("Error: Debes introducir un número entero para seleccionar el modo.");
        }
    }

    // Método para mostrar la generación basada en el año de nacimiento
    public static void mostrarGeneracion(int añoNacimiento) {
        if (añoNacimiento >= 1900 && añoNacimiento <= 1927) {
            System.out.println("Sin Generación bautizada (nacidos entre 1900 y 1927).");
        } else if (añoNacimiento >= 1928 && añoNacimiento <= 1944) {
            System.out.println("Generación Silent (nacidos entre 1928 y 1944).");
        } else if (añoNacimiento >= 1945 && añoNacimiento <= 1964) {
            System.out.println("Baby Boomers (nacidos entre 1945 y 1964).");
        } else if (añoNacimiento >= 1965 && añoNacimiento <= 1981) {
            System.out.println("Generación X (nacidos entre 1965 y 1981).");
        } else if (añoNacimiento >= 1982 && añoNacimiento <= 1994) {
            System.out.println("Generación Y o Millennials (nacidos entre 1982 y 1994).");
        } else if (añoNacimiento >= 1995 && añoNacimiento <= 2009) {
            System.out.println("Generación Z o Centennials (nacidos entre 1995 y 2009).");
        } else {
            System.out.println("Generación sin clasificar o nacidos después de 2009.");
        }
    }
}
