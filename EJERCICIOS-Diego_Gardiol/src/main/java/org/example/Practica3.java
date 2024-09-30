package org.example;
import java.util.Scanner;
public class Practica3 {
    public void practica3(){
        System.out.println("*******************************");
        System.out.println("******INTRODUCE TU NOMBRE******");
        System.out.println("*******************************");
        Scanner entrada = new Scanner(System.in);

        String nombre = entrada.next();

        System.out.println("Hola "+ nombre + ". INTRODUCE TU EDAD:");
        int edad = entrada.nextInt();

        if (edad >= 18){
            System.out.println("Enhorabuena "+ nombre + ". Puedes votar.");
        }
        else {
            int anyosFaltantes = 18 - edad;
            System.out.println("****************************************************************");
            System.out.println("Lo siento "+ nombre + ". No puedes votar.");
            System.out.println("Te faltan "+ anyosFaltantes + " años para ser mayor de edad.");
            System.out.println("****************************************************************");
        }

    }
}
