package org.example;

import java.util.Scanner;

public class ejerciciosBucles {
    public void ejer1(){
        Scanner entrada = new Scanner(System.in);
        String pass = "diego123456789";
        String usuario = "diego";
        do {
            System.out.println("Ingrese su nombre de Usuario");
            usuario = entrada.nextLine();

            System.out.println("Ingrese su contraseña");
            pass = entrada.next();

        }while (!pass.equals(pass));
            System.out.println("BIENVENIDO CONTRASEÑA CORRECTA");
    }

    public void ejer2() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el valor de N:");
        int N = entrada.nextInt();

        for (int i=N; i>=1; i--){

            System.out.println(i);
        }
    }
    public void ejer3() {

        for(int i=0;i<50;i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    public void ejer4(){
        String hola = "HOLA";

        for (int i = 0; i < hola.length(); i++) {
            System.out.println(hola.charAt(i));
        }
    }

    public void ejer5(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número para sacar su tabla:");
        int num = entrada.nextInt();

        for(int i=0; i<11; i++){
            int res = i * num;
            System.out.println(i + "x"+num + "="+ res);
        }
    }

    public void ejer6(){
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        System.out.print("¿Cuántos números quieres sumar?: ");
        int N = entrada.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("Inserta el nº" + i + ": ");
            int num = entrada.nextInt();
            suma += num;
        }

        System.out.println("El resultado es: " + suma);
    }

    public void ejer7(){
        Scanner entrada = new Scanner(System.in);
        int factorial=1;
        System.out.print("Número a calcular su factorial: ");

        
        int n = entrada.nextInt();
        for (int i = 1; i <= n; i++) {
          factorial *= i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
    }

    public void ejer8(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una cadena para invertir: ");
        String cadena = entrada.nextLine();

        String cadenaInvertida = "";


        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }

        System.out.println("La cadena invertida es: " + cadenaInvertida);
    }
}

