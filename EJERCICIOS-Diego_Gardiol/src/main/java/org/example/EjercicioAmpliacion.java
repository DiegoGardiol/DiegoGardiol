package org.example;

import java.util.Scanner;

public class EjercicioAmpliacion {
    public void ampliacion(){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe la altura: ");
        int altura = entrada.nextInt();

        if (altura <= 150){
            System.out.println("Persona de altura baja: " + altura + "cm");
        }
        else if (altura >= 151 && altura <= 175){
            System.out.println("Persona de estatura media: "+ altura + "cm");
        } else if (altura > 176) {
            System.out.println("Persona alta: " + altura + "cm");
        }
    }

    public void ampliacion2(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe un numero entre 1-7: ");
        int num = entrada.nextInt();

        switch(num) {
            case 1:
                System.out.println(num + ". LUNES");
                break;
            case 2:
                System.out.println(num + ". MARTES");
                break;
            case 3:
                System.out.println(num + ". MIERCOLES");
                break;
            case 4:
                System.out.println(num + ". JUEVES");
                break;
            case 5:
                System.out.println(num + ". VIERNES");
                break;
            case 6:
                System.out.println(num + ". SABADO");
                break;
            case 7:
                System.out.println(num + ". DOMINGO");
                break;
            default:
                System.out.println("Numero no valido (1-7)");
        }
    }
}
