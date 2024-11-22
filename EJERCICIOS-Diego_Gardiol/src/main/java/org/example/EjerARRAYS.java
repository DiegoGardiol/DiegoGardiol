package org.example;

import java.util.Random;

public class EjerARRAYS {
    public void ejer1(){
        Random aleatorio = new Random();

        double total = 0;
        int[] numeros = new int[8];
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(501);
            total += numeros[i];
        }

        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        System.out.println("TOTAL: "+ total);
    }

    public void ejer2(){
      int[] numero = new int[5];
      
    }
}
