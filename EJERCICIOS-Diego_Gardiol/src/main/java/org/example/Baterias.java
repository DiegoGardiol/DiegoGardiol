package org.example;
import java.util.Scanner;
public class Baterias {
    public void ejercicio1() {

        System.out.println("Escribe un numero");
        Scanner entrada = new Scanner(System.in);

        int num1 = entrada.nextInt();

        if (num1 < 0) {
            System.out.println("El numero " + num1 + " es negativo");
        } else {
            System.out.println("El numero " + num1 + " es positivo");
        }


    }

    public void ejercicio2() {
        System.out.println("Escribe un numero");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();

        System.out.println("Escribe el segundo numero");
        int num2 = entrada.nextInt();

        if (num1 == num2) {
            System.out.println("No pueden ser iguales");
        } else {
            if (num1 > num2) {
                System.out.println("El numero " + num1 + " es mayor que el numero " + num2);
            } else {
                System.out.println("El numero " + num2 + " es menor que el numero " + num1);
            }
        }
    }

    public void ejercicio3() {

        System.out.println("Escribe un numero");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();

        System.out.println("Escribe el segundo numero que actuara de divisor");
        int num2 = entrada.nextInt();


        if (num2 == 0) {
            System.out.println("El divisor no puede ser equivalente a 0");
        } else {
            int num3 = num1 / num2;
            System.out.println(num1 + " % " + num2 + " = " + num3);
        }
    }

    public void ejercicio4() {

        System.out.println("Escribe el valor de b (base): ");
        Scanner entrada = new Scanner(System.in);
        int b = entrada.nextInt();

        if (b > 0) {
            System.out.println("Escribe el valor de h (altura): ");
            int h = entrada.nextInt();

            if (h > 0) {
                System.out.println("CALCULAMOS EL AREA:");
                System.out.println("A = (b x a) / 2\n");
                System.out.println("SE TRADUCE A:");
                System.out.println("A = (" + b + "x" + h + ") / 2");
                int valor = b * h;
                System.out.println("A = " + valor + " / 2");
                int valor2 = valor / 2;
                System.out.println("A = " + valor2 + "\n");
                System.out.println("El área del triángulo es A=" + valor2);
            } else {
                System.out.println("El valor de la altura tiene que ser positivo");
            }
        } else {
            System.out.println("El valor de la base tiene que ser positivo");
        }

    }

    public void ejercicio5() {

        System.out.println("Escribe el valor del primer número");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();

        System.out.println("Escribe el valor del segundo número");
        int num2 = entrada.nextInt();

        if (num1 == num2) {
            System.out.println("ERROR: hay números introducidos que son iguales");
        } else {
            System.out.println("Escribe el valor del tercer número");
            int num3 = entrada.nextInt();

            if (num3 == num1) {
                System.out.println("ERROR: hay números introducidos que son iguales");
            } else {
                if (num3 == num2) {
                    System.out.println("ERROR: hay números introducidos que son iguales");
                }
                else {
                   //COMPARACION DE NUMEROS
                }
            }
        }
    }

    public void ejercicio6() {
        System.out.println("Tienes tomate");
        Scanner entrada = new Scanner(System.in);
        String tomate = entrada.next();

        if (tomate.equalsIgnoreCase("si")){
            System.out.println("¡No tenemos que ir a comprar!\n");
            System.out.println("Tienes aceite");
            String aceite = entrada.next();

            if (aceite.equalsIgnoreCase("si")){
                System.out.println("¡No tenemos que ir a comprar!\n");
            }
            else {
                System.out.println("¡Tenemos que ir a comprar!");
                System.out.println("Tienes jamon");
                String jamon = entrada.next();
                if (jamon.equalsIgnoreCase("si")){
                    System.out.println("¡No tenemos que ir a comprar!\n");
                }
                else {
                    System.out.println("¡Tenemos que ir a comprar!");
                }
            }
        }
        else {
            System.out.println("¡Tenemos que ir a comprar!");
        }

    }
}
