package org.example;

import java.util.Random;

public class Arrays {
    public void ejercicio1(){

        int[] array = new int[8]; //Array de 8 elementos de tipo int

        Random random = new Random();

        int suma = 0;

        System.out.println("*****************************************");
        System.out.println("ESTOS SON LOS ELEMENTOS DE NUESTRO ARRAY:");
        System.out.println("*****************************************");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(501); // Generamos un numero aleatorio entre 0 y 500
            suma += array[i]; //Sumamos el valor de el elemento actual al total
            System.out.print(array[i] + " ");
        }
        System.out.println("\nLa suma de los elementos es: " + suma);
        System.out.println("*****************************************");
    }
}
