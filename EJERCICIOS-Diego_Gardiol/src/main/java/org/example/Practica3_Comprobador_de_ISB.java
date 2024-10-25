package org.example;

import java.util.Scanner;

class Practica3_Comprobador_de_ISBI {
    public void ejer(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el ISBN (usa '?' para el dígito desconocido): ");
        String isbn = scanner.nextLine().toUpperCase();

        if (isbn.length() != 10) {
            System.out.println("El ISBN debe tener exactamente 10 caracteres.");
        } else {
            boolean containsQuestionMark = isbn.contains("?");
            int sum = 0;
            int missingIndex = -1;
            boolean isValid = false;

            if (containsQuestionMark) {
                // Si hay un '?' en el ISBN, encontramos el índice y probamos cada posible dígito
                missingIndex = isbn.indexOf('?');

                // Probamos reemplazar '?' con valores de 0 a 10
                for (int missingDigit = 0; missingDigit <= 10; missingDigit++) {
                    sum = 0;
                    for (int i = 0; i < 10; i++) {
                        int value;
                        if (i == missingIndex) {
                            // Reemplazamos '?' con el dígito que estamos probando
                            value = (missingDigit == 10) ? 10 : missingDigit;
                        } else if (isbn.charAt(i) == 'X') {
                            value = 10;
                        } else {
                            value = Character.getNumericValue(isbn.charAt(i));
                        }
                        sum += value * (10 - i);
                    }

                    // Verificamos si la suma es múltiplo de 11
                    if (sum % 11 == 0) {
                        isValid = true;
                        System.out.println("El dígito que falta es: " + (missingDigit == 10 ? "X" : missingDigit));
                        break;
                    }
                }

                if (!isValid) {
                    System.out.println("No es posible determinar un dígito válido.");
                }

            } else {
                // Si no hay '?', comprobamos directamente la validez del ISBN
                for (int i = 0; i < 10; i++) {
                    int value;
                    if (isbn.charAt(i) == 'X') {
                        value = 10;
                    } else {
                        value = Character.getNumericValue(isbn.charAt(i));
                    }
                    sum += value * (10 - i);
                }

                if (sum % 11 == 0) {
                    System.out.println("El ISBN es válido.");
                } else {
                    System.out.println("El ISBN es inválido.");
                }
            }
        }

        scanner.close();
    }
}




