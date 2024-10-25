package org.example;

import java.util.Scanner;

class Practica3_Comprobador_de_ISBI {
    public void ejer(){
        Scanner escaner = new Scanner(System.in);
        System.out.print("Introduce el ISBN (usa '?' para el dígito desconocido): ");
        String isbn = escaner.nextLine().toUpperCase();

        if (isbn.length() != 10) {
            System.out.println("El ISBN debe tener exactamente 10 caracteres.");
        } else {
            boolean contieneInterrogacion = isbn.contains("?");
            int suma = 0;
            int indiceFaltante = -1;
            boolean esValido = false;

            if (contieneInterrogacion) {
                indiceFaltante = isbn.indexOf('?');

                for (int digitoFaltante = 0; digitoFaltante <= 10; digitoFaltante++) {
                    suma = 0;
                    for (int i = 0; i < 10; i++) {
                        int valor;
                        if (i == indiceFaltante) {
                            valor = (digitoFaltante == 10) ? 10 : digitoFaltante;
                        } else if (isbn.charAt(i) == 'X') {
                            valor = 10;
                        } else {
                            valor = Character.getNumericValue(isbn.charAt(i));
                        }
                        suma += valor * (10 - i);
                    }

                    if (suma % 11 == 0) {
                        esValido = true;
                        System.out.println("El dígito que falta es: " + (digitoFaltante == 10 ? "X" : digitoFaltante));
                        break;
                    }
                }

                if (!esValido) {
                    System.out.println("No es posible determinar un dígito válido.");
                }

            } else {
                for (int i = 0; i < 10; i++) {
                    int valor;
                    if (isbn.charAt(i) == 'X') {
                        valor = 10;
                    } else {
                        valor = Character.getNumericValue(isbn.charAt(i));
                    }
                    suma += valor * (10 - i);
                }

                if (suma % 11 == 0) {
                    System.out.println("El ISBN es válido.");
                } else {
                    System.out.println("El ISBN es inválido.");
                }
            }
        }
        escaner.close();
    }
}




