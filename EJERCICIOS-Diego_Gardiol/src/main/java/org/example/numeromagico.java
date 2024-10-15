package org.example;

import java.util.Scanner;

public class numeromagico {
    public void numeromagico1(){

        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
        String fechaNacimiento = scanner.nextLine();

        String[] partes = fechaNacimiento.split("/");

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);

        int sumaTotal = dia + mes + anio;

        int numeroDeLaSuerte = sumarCifras(sumaTotal);

        System.out.println("Tu número de la suerte es: " + numeroDeLaSuerte);

        scanner.close();
    }


    public static int sumarCifras(int numero) {
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }

        if (suma >= 10) {
            suma = sumarCifras(suma);
        }

        return suma;

    }
}
