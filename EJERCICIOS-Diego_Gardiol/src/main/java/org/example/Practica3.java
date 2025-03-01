package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3 {
    public void practica3() {
        System.out.println("******INTRODUCE TU NOMBRE******");

        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        boolean nombreValido = false;

        // Validar que el nombre contenga solo letras
        while (!nombreValido) {
            nombre = entrada.next(); // Lee el nombre

            if (nombre.matches("[a-zA-Z]+")) { // Verifica si el nombre solo contiene letras
                nombreValido = true;
            } else {
                System.out.println("ERROR. El nombre solo debe contener letras. Inténtalo de nuevo:");
            }
        }

        int edad = -1; // Inicializa la variable edad con un valor no válido
        while (edad < 0) { // Continúa solicitando la edad mientras sea negativa
            System.out.println("Hola " + nombre + ". INTRODUCE TU EDAD:");

            try {
                edad = entrada.nextInt(); // Lee la entrada de edad

                if (edad < 0) {
                    System.out.println("ERROR. Valor de edad incorrecto. Por favor, introduce una edad válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR. Debes introducir un número válido para la edad.");
                entrada.next(); // Limpiar el buffer del scanner
            }
        }

        if (edad >= 18) { // Si la edad es igual o mayor a 18
            System.out.println("Enhorabuena " + nombre + ". Puedes votar.");
        } else { // Si no cumple la condición
            int anyosFaltantes = 18 - edad; // Calcula los años faltantes
            System.out.println("****************************************************************");
            System.out.println("Lo siento " + nombre + ". No puedes votar.");
            System.out.println("Te faltan " + anyosFaltantes + " años para ser mayor de edad.");
            System.out.println("****************************************************************");
        }
    }
}
