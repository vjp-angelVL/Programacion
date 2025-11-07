/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio14T4;

import java.util.Scanner;

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio14T4 {
    
     // Creo el metodo para comprobar que el numero es mayor que 0
    public static boolean comprobarNumero(int numero) {
        return numero > 0;
    }

    // Creo el mtodo para calcular y mostrar los multiplos de 3
    public static void mostrarMultiplosDeTres(int numero) {
        int contador = 0;// declaro la variable contador y la inicializo en 0

        System.out.println("Multiplos de 3 entre 1 y " + numero + " : ");
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                contador++;// compruebo que el numero es multiplo de 3
            }
        }
        //Muestro al usuario el total de multiplos de 3
        System.out.println("Total de multiplos de 3 mostrados: " + contador);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;// creo la variable numero y la inicializo

        // Creo un metodo while para pedir un numero al usuario
        while (true) {
            System.out.print("Introduce un numero mayor que 0: ");// Pido al usuario un numero mayor que cero
            numero = scanner.nextInt();
            
            //Hago un if else en el que comprueba el numero
            if (comprobarNumero(numero)) {
                break; // Sale del bucle si el numero es valido
            } else {
                System.out.println("Error: El numero debe ser mayor que 0");// Le dice al usuario que el numero debe ser mayor que cero
            }
        }

        mostrarMultiplosDeTres(numero);
    }
}
