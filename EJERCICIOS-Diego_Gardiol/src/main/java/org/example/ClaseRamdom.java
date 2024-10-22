package org.example;

import java.util.Random;
import java.util.Scanner;

public class ClaseRamdom {

    public void ejer1(){
        Random aleatorio = new Random();
        int dado1 = aleatorio.nextInt(6) + 1;
        System.out.println("El valor del dado 1 es " + dado1);
        int dado2 = aleatorio.nextInt(6) + 1;
        System.out.println("El valor del dado 2 es " + dado2);

        System.out.println("El resultado es " + (dado1 + dado2));
    }

    public void ejer2(){

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int tam = caracteres.length();

        Random random = new Random();

        int longuitud_contrasenya = 12;
        int indice;
        String contrasenya = "";
        for (int i=0; i<longuitud_contrasenya; i++){
            indice = random.nextInt(tam);
            contrasenya += caracteres.charAt(indice);
        }
        System.out.println("Tu contraseña aleatoria es: " + contrasenya);
    }

    public void ejer3(){
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Establece el rango mínimo: ");
        int ent1 = entrada.nextInt();

        System.out.print("Establece el rango máximo:");
        int ent2 = entrada.nextInt();

        System.out.print("Cuantos numeros aleatorios quieres: ");
        int ent3 = entrada.nextInt();






    }
}
