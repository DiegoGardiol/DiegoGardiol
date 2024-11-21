package org.example;

import java.util.Scanner;

public class MatricesNivel1 {

    public void e1(){
        int matriz[][] = new int[3][3];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Dime el valor de la posicion (" + i + "," + j + "):");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\n");
        System.out.println("ESTA ES TU MATRZ:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " / ");
            }
            System.out.println("");

        }
        System.out.println("Número a buscar");
        int busqueda = entrada.nextInt();


        boolean encontrado = false;
        System.out.println("Salida:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == busqueda) {
                    System.out.println("(" + i + "," + j + ")");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("El número no se encuentra en la matriz.");
        }
    }
}
