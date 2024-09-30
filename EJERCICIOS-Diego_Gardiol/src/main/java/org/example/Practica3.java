package org.example;
import java.util.Scanner;
public class Practica3 {
    public void practica3(){
        System.out.println("******INTRODUCE TU NOMBRE******");//Aparece por pantalla el texto de introducir nombre

        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();//Lee la entrada de el teclado y lo guarda en una variable nombre en formato string

        System.out.println("Hola "+ nombre + ". INTRODUCE TU EDAD:");//Aparecera por pantalla el texto + la variable nombre para mostrar el valor de la variable
        int edad = entrada.nextInt();//Ahora leemos la entrada de el teclado y guardarlo en la variable edad en formato int

        if (edad >= 18){//Si la variable edad es igual o mayor a 18
            System.out.println("Enhorabuena "+ nombre + ". Puedes votar.");//Texto si la condicion se cumple
        }
        else {//Si no se cumple
            int anyosFaltantes = 18 - edad;//Establezco una variable int anyosFaltantes que su valor sera 18 - la variable edad
            System.out.println("****************************************************************");
            System.out.println("Lo siento "+ nombre + ". No puedes votar.");//Aparece por pantalla el resultado de si la condicion no se cumple
            System.out.println("Te faltan "+ anyosFaltantes + " años para ser mayor de edad.");//Aparece por pantalla los años faltantes
            System.out.println("****************************************************************");
        }

    }
}
