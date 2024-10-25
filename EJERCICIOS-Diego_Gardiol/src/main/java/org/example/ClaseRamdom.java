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
        int min = entrada.nextInt();

        int max;
        do {
            System.out.print("Establece el rango máximo: ");
            max = entrada.nextInt();
            if (max <= min) {
                System.out.println("El máximo debe ser mayor que el mínimo. Intenta de nuevo.");
            }
        } while (max <= min);

        System.out.print("¿Cuántos números aleatorios quieres?: ");
        int cantidad = entrada.nextInt();

        System.out.println("Números aleatorios generados:");
        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = random.nextInt(max - min + 1) + min;
            System.out.println(numeroAleatorio);
        }

        entrada.close();
    }

    public void ejer4(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int tam = caracteres.length();

        Random random = new Random();


        int longitudContrasena = random.nextInt(3) + 6;

        String contrasena = "";
        for (int i = 0; i < longitudContrasena; i++) {
            int indice = random.nextInt(tam);
            contrasena += caracteres.charAt(indice);
        }

        System.out.println("Tu contraseña aleatoria es: " + contrasena);
    }
}

