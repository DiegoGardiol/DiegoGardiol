package org.example;

import java.lang.ref.Cleaner;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PreExamen {
    public void ejer1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números a ingresar: ");
        int n = scanner.nextInt();
        int mayores = 0, menores = 0, iguales = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();
            if (numero > 0) {
                mayores++;
            } else if (numero < 0) {
                menores++;
            } else {
                iguales++;
            }
        }

        System.out.println("Números mayores que 0: " + mayores);
        System.out.println("Números menores que 0: " + menores);
        System.out.println("Números iguales a 0: " + iguales);
    }

    public void ejer2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        double base = scanner.nextDouble();
        System.out.print("Introduce el exponente: ");
        int exponente = scanner.nextInt();

        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        System.out.println("El resultado de " + base + " ^ " + exponente + " es: " + resultado);
    }

    public void ejer3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de meses de financiación: ");
        int meses = scanner.nextInt();

        int pago = 10;
        int totalPagado = 0;

        for (int i = 1; i <= meses; i++) {
            System.out.println("Mes " + i + ": " + pago + "€");
            totalPagado += pago;
            pago *= 2;
        }

        System.out.println("Total a pagar después de " + meses + " meses: " + totalPagado + "€");
    }

    public void ejer4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una nota numérica (entera): ");
        int nota = scanner.nextInt();

        String calificacion;

        switch (nota) {
            case 0: case 1: case 2: case 3: case 4:
                calificacion = "INSUFICIENTE";
                break;
            case 5:
                calificacion = "SUFICIENTE";
                break;
            case 6:
                calificacion = "BIEN";
                break;
            case 7: case 8:
                calificacion = "NOTABLE";
                break;
            case 9: case 10:
                calificacion = "SOBRESALIENTE";
                break;
            default:
                calificacion = "No válido";
        }

        System.out.println("La calificación cualitativa es: " + calificacion);
    }

    public void ejer5() {
        Scanner scanner = new Scanner(System.in);
        double[] sueldos = new double[5];
        double sueldoMaximo = 0;
        int countMasDeMil = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el sueldo " + (i + 1) + ": ");
            sueldos[i] = scanner.nextDouble();
            if (sueldos[i] > sueldoMaximo) {
                sueldoMaximo = sueldos[i];
            }
            if (sueldos[i] > 1000) {
                countMasDeMil++;
            }
        }

        System.out.println("El sueldo máximo es: " + sueldoMaximo);
        System.out.println("Cantidad de sueldos mayores a 1000€: " + countMasDeMil);
    }

    public void ejer6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de alumnos: ");
        int n = scanner.nextInt();

        int sumaEdades = 0;
        int sumaAlturas = 0;
        int mayoresDe18 = 0;
        int masDe175cm = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce la edad del alumno " + (i + 1) + ": ");
            int edad = scanner.nextInt();
            System.out.print("Introduce la altura en cm del alumno " + (i + 1) + ": ");
            int altura = scanner.nextInt();

            sumaEdades += edad;
            sumaAlturas += altura;

            if (edad > 18) {
                mayoresDe18++;
            }
            if (altura > 175) {
                masDe175cm++;
            }
        }

        double edadMedia = (double) sumaEdades / n;
        double alturaMedia = (double) sumaAlturas / n;

        System.out.println("Edad media: " + edadMedia);
        System.out.println("Altura media: " + alturaMedia + " cm");
        System.out.println("Cantidad de alumnos mayores de 18 años: " + mayoresDe18);
        System.out.println("Cantidad de alumnos con altura superior a 175 cm: " + masDe175cm);
    }

    public void ejer7(){
        Scanner scanner = new Scanner(System.in);

        int termino = 0;

        boolean salidavalida = false;
        while (!salidavalida) {
            try {
                System.out.print("Cuantos términos de secuencia deseas ver (números enteros y positivos): ");
                termino = scanner.nextInt();
                salidavalida = true;

                if (termino <= 0){
                    System.out.println("**ERROR: Solo se permiten números enteros y positivos. Inténtalo de nuevo.**");
                    salidavalida=false;
                }
            } catch (InputMismatchException e) {
                System.out.println("**ERROR: Solo se permiten números enteros y positivos. Inténtalo de nuevo.**");
                scanner.next();
            }
            catch (ArithmeticException e){
                System.out.println("**ERROR: Solo se permiten números enteros y positivos. Inténtalo de nuevo.**");
                scanner.next();
            }
        }
        int a = 0, b = 1, c;
        System.out.print("Secuencia de Números: ");
        for (int i = 0; i < termino; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}