package org.example;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public void ejercicio1(){
        //SUMAR TODOS LOS VALORES DE UN ARRAY ALEATORIO DE 8 VALORES

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
    public void ejercicio2(){
        //INVERTIR ARRAY

        int[] array = {10,9,8,7,6,5,4,3,2,1};

        System.out.println("\n************************");
        System.out.println("ARRAY NORMAL:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n************************");

        System.out.println("ARRAY INVERTIDO:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n************************");
    }

        public void ejercicio3() {
        //CONTAR NUMEROD E VECES QUE APARECE UN DIGITO EN UN ARRAY ALEATORIO
            int[] numeros = new int[25];
            Random random = new Random();

            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = random.nextInt(101);
            }

            System.out.print("Array generado: ");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + " / ");
            }
            System.out.println();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa un dígito para buscar [0-9]: ");
            String digitoBuscado = scanner.next();

            if (digitoBuscado.length() != 1 || !Character.isDigit(digitoBuscado.charAt(0))) {
                System.out.println("Por favor, ingresa solo un dígito (0-9).");
                return;
            }

            int contador = 0;
            for (int num : numeros) {
                String numeroComoTexto = String.valueOf(num);
                for (char c : numeroComoTexto.toCharArray()) {
                    if (String.valueOf(c).equals(digitoBuscado)) {
                        contador++;
                    }
                }
            }

            System.out.println("El dígito " + digitoBuscado + " aparece " + contador + " veces en el array.");
        }

        public void ejercicio4(){
        //ELIMINAR POSICION DE UN ARRAY
            int[] array = {1, 3, 5, 7 ,9};
            Scanner entrada = new Scanner(System.in);

            System.out.println("ARRAY INICIAL");

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " / ");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("POSICIONES");
            System.out.println("0 / 1 / 2 / 3 / 4 /");

            System.out.println("");
            System.out.print("Ingrese la posicion a eliminar (0-4): ");
            int indx = entrada.nextInt();


            if (indx < 0 || indx > 4){
                System.out.println("**ERROR**. El array solo cuenta con 4 posiciones.");
            }
            else {

                int[] arrayN = new int[array.length - 1];

                for (int i = 0, j = 0; i < array.length; i++) {
                    if (i != indx) {
                        arrayN[j++] = array[i];
                    }
                }

                for (int i = 0; i < arrayN.length; i++) {
                    System.out.print(arrayN[i] + " / ");
                }
            }
        }

        public void ejercicio5(){
        //MOVER UNA POSICION A LA DERECHA EL ARRAY

        int[] array = new int[10];

            Scanner entrada = new Scanner(System.in);

            System.out.println("**ESTABLECE TU ARRAY**");
            for (int i = 0; i < array.length; i++) {
                System.out.print("VALOR " + i + ": ");
                array[i] = entrada.nextInt();
            }

            System.out.println("**ESTE ES TU ARRAY**");
            for(int n : array) {
                System.out.print(n +" / ");
            }

        }

}