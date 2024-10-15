package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculadora {
    public void calculadora1(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("==BIENVNIDO A LA CALCULADORA DE DIEGO==");
        System.out.println("=======================================");
        System.out.println("(+) --> SUMA                          =");
        System.out.println("(-) --> RESTA                         =");
        System.out.println("(/) --> DIVISION                      =");
        System.out.println("(R) --> RAIZ CUADRADA                 =");
        System.out.println("=======================================");
        int op1 = 0;
        int op2 = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Escribe aqui el primer operador: ");
                op1 = entrada.nextInt();
                validInput = true; // Entrada válida, salir del bucle
            } catch (InputMismatchException e) {
                System.out.println("**ERROR: Solo se permiten números enteros. Inténtalo de nuevo.**");
                entrada.next(); // Limpiar la entrada incorrecta
            }
        }

        System.out.print("Escribe aqui el signo a aplicar: ");
        String sig = entrada.next();



        if (!sig.equals("R")) {
            System.out.print("Escribe aqui el segundo operador: ");
            op2 = entrada.nextInt();
        }

        System.out.println("=======================================");

        switch(sig) {
            case "+":
                int suma = op1 + op2;
                System.out.println("RESULTADO: " + suma);
                break;
            case "-":
                int resta = op1 - op2;
                System.out.println("RESULTADO: " + resta);
                break;
            case "/":
                int division = op1 / op2;
                System.out.println("RESULTADO: " + division);
                break;
            case "R":
                int resultadoR = (int) Math.sqrt(op1);
                System.out.println("RESULTADO: " + resultadoR);
                break;
            default:
                System.out.println("**EROR NO VALIDO**");
        }

        System.out.println("=======================================");

    }
}
