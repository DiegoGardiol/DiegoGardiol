package org.example;

import java.util.Scanner;
public class CadenaDeCaracteres {

    public void ejercicio1(){

        //0. Muestra el texto original introducido (System.out.println).
        System.out.println("0. Muestra el texto original introducido (System.out.println).");
        System.out.println("Este es el texto original\n");

        //1. Muestra la longitud del texto introducido (length()).
        String texto = "Longuitud del texto introducido";
        System.out.println("1. Muestra la longitud del texto introducido (length()).");
        System.out.println("La longuitud de *Longuitud del texto introducido* es de: " + texto.length() + " caracteres\n");

        //2. Elimina los espacios del texto (si los hay) y muestra como queda (replace(,)).
        System.out.println("2. Elimina los espacios del texto (si los hay) y muestra como queda (replace(,)).");
        System.out.println("Texto con espacios");
        String palabra1 = "Texto con espacios";
        String palabra2 = palabra1.replace( " ","" );
        System.out.println("El texto sin espacios es: " + palabra2 + "\n");

        //3. Divide la cadena de texto en dos partes iguales (por la mitad) para posteriormente concatenarlas y mostrarlas de nuevo, pero con el siguiente formato: "Primera mitad del texto es " + mitad1 + "y la segunda mitad del texto es " + mitad2. (substring + concat).
        System.out.println("3. Divide la cadena de texto en dos partes iguales (por la mitad) para posteriormente concatenarlas y mostrarlas de nuevo, pero con el siguiente formato: \"Primera mitad del texto es \" + mitad1 + \"y la segunda mitad del texto es \" + mitad2. (substring + concat).");
        String frase4 = "Esta es la frase que hay que dividir. Y esta es la segunda mitad";
        String mitad1 = frase4.substring(0,38);
        String mitad2 = frase4.substring(39);
        String mitadC = mitad1.concat(mitad2);

        System.out.println("La primera mitad del texto es: "+ mitad1 + "\ny la segunda mitad del texto es:" + mitad2);
        System.out.println("Este es el texto concatenado: " + mitadC + "\n");

        //4. Transforma la cadena de texto a mayúsculas (toUpperCase()).
        System.out.println("4. Transforma la cadena de texto a mayúsculas (toUpperCase()).");
        String palabra = "Texto de minusculas a mayusculas";
        String palabraM = palabra.toUpperCase();
        System.out.println("La conversion de la frase: "+ palabra + "\nA mayusculas es: " + palabraM);
    }

    public void ejercicio2(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("EJERCICIO 2. Desarrolla un programa que permita leer 2 cadenas de caracteres (palabras) diferentes y nos diga cual es la más larga. ");

        System.out.println("Escribe la primera cadena de caracteres:");
        String cadena1 = entrada.nextLine();


        System.out.println("Escribe la segunda cadena de caracteres:");
        String cadena2 = entrada.nextLine();

        int cadenaN2 = cadena2.length();
        int cadenaN1 = cadena1.length();

        if (cadenaN1 == cadenaN2)
        {
            System.out.println("Las cadenas son iguales: "+ cadenaN1 + " y "+ cadenaN2);
        }
        else {
            if (cadenaN1 < cadenaN2) {
                System.out.println("La cadena: " + cadena2 + " es la mas larga, con (" + cadenaN2 + ") caracteres");
            } else {
                System.out.println("La cadena: " + cadena1 + " es la mas larga, con (" + cadenaN1 + ") caracteres");
            }
        }
    }

    public void ejercicio3(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("3. Programa que quite a una variable numérica N sus m últimas cifras.");

        System.out.print("Escribe el valor que tendra `N`: " );
        int N = entrada.nextInt();

        System.out.print("Escribe el valor que tendra `m`: ");
        int m = entrada.nextInt();

        if (N < 0 || m < 0){
            System.out.println("Debes introducir valores positivos");
        }
        else {

            System.out.println("Este es el valor de N: " + N);
            System.out.println("Este es el valor de m: "+ m);

            String valorN = Integer.toString(N);

            int cadena = valorN.length();
            int cadenaRes = cadena - m;

            String finalito = valorN.substring(0,cadenaRes);
            System.out.println(finalito);
        }

    }
}