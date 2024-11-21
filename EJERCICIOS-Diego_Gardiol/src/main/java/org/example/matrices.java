package org.example;

import java.util.Scanner;

public class matrices {
    public void prueba() {

        int matriz[][] = new int[3][4];

        int matriz2[][] = {{12, 32, 44, 1}, {33, 2, 90, 56}};


        System.out.println(matriz2[0][2]);


        System.out.println("TAMAÑO FILA: " + matriz2.length);
        System.out.println("TAMAÑO COLUMNA: " + matriz2[0].length);

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.println(matriz2[i][j] + " ");
            }
        }

        for (int[] filas : matriz2) {
            for (int columnas : filas) {
                System.out.println(columnas + " ");
            }
            System.out.println("\n");
        }

        System.out.println("-------------------------------------------------------------------\n");
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Dime el valor de la posicion (" + i + "," + j + "):");
                matriz[i][j] = entrada.nextInt();
            }
        }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
            System.out.println("");

        }


        int matrize[][] = new int [5][5];

        for (int i = 0; i < matrize.length; i++) {
            for (int j = 0; j < matrize[i].length; j++) {
                if(i==j){
                    matrize[0][j] = 1;
                }
            }
        }

        for (int[] filas:matrize){
            for(int columnas:filas){
                System.out.println(columnas + " ");
            }
            System.out.println("\n");
        }
    }
}
