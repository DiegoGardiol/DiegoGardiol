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


    }

    public void ejer2() {
        int matrize[][] = new int[5][5];


        for (int i = 0; i < matrize.length; i++) {
            for (int j = 0; j < matrize[i].length; j++) {
                if (i == j) {
                    matrize[i][j] = 1;
                } else {
                    matrize[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrize.length; i++) {
            for (int j = 0; j < matrize[i].length; j++) {
                if (matrize[i][j] == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");

        for (int[] filas : matrize) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.print("\n");
        }

        System.out.println("____________________________________________________");
        System.out.println("INVERTIDO");
        System.out.println("____________________________________________________");

        for (int i = 0; i < matrize.length; i++) {
            for (int j = 0; j < matrize[i].length; j++) {
                if (i + j == matrize.length - 1) {
                    matrize[i][j] = 1;
                } else {
                    matrize[i][j] = 0;
                }
            }
        }


        for (int i = 0; i < matrize.length; i++) {
            for (int j = 0; j < matrize[i].length; j++) {
                if (matrize[i][j] == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println("");
        }

        System.out.println("-----------------------------------");

        System.out.println("Matriz numérica:");
        for (int[] filas : matrize) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println();
        }
    }

    public void ejer3() {
        int A[][] = {{1, 5, 9}, {20, 17, 2}};
        int B[][] = {{6, 7, 5}, {15, 10, 0}};

        int M[][] = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] > B[i][j]) {
                    M[i][j] = A[i][j];
                } else {
                    M[i][j] = B[i][j];
                }
            }
        }


        System.out.println("MATRIZ M:");
        for (int[] filas : M) {
            System.out.print("[");
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println("]");
        }
    }
}

