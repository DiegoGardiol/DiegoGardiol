package org.example;
import java.util.Scanner;
public class Baterias {
    public void ejercicio1 (){

        System.out.println("Escribe un numero");
        Scanner entrada=new Scanner(System.in);

        int num1=entrada.nextInt();

        if (num1<0){
            System.out.println("El numero " + num1 + " es negativo");
        }
        else {
            System.out.println("El numero " + num1 + " es positivo");
        }


    }

    public void ejercicio2 (){
        System.out.println("Escribe un numero");
        Scanner entrada=new Scanner(System.in);
        int num1=entrada.nextInt();

        System.out.println("Escribe el segundo numero");
        int num2=entrada.nextInt();

        if (num1==num2) {
            System.out.println("No pueden ser iguales");
        }
        else {
            if (num1 > num2) {
                System.out.println("El numero " + num1 + " es mayor que el numero " + num2);
            } else {
                System.out.println("El numero " + num2 + " es menor que el numero " + num1);
            }
        }
    }

    public void ejercicio3() {

        System.out.println("Escribe un numero");
        Scanner entrada=new Scanner(System.in);
        int num1=entrada.nextInt();

        System.out.println("Escribe el segundo numero que actuara de divisor");
        int num2=entrada.nextInt();


        if (num2==0){
            System.out.println("El divisor no puede ser equivalente a 0");
        }
        else {
            int num3 = num1/num2;
            System.out.println(num1 + " % " + num2 + " = " + num3);
        }
    }
}
