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
        System.out.print("Introduce un numero para sacar su tabla:");
        int num = entrada.nextInt();

        for(int i=0; i<11; i++){
            int res = i * num;
            System.out.println(i + "x"+num + "="+ res);
        }
    }

    public void ejer6(){

    }
}

