package org.example;

import java.util.Scanner;

public class PRE_MATRICES {
    public void triangulo(){
            Scanner entrada = new Scanner(System.in);
        System.out.print("ALTURA: ");
        int altura = entrada.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }


    public void tablas(){

        Scanner entrada = new Scanner(System.in);


        for (int i = 1; i <= 10 ; i++) {
            System.out.println("TABLA DE MULTIPLICAR DEL "+ i);
            for (int j = 1; j <= 10 ; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
        }
    }
}
