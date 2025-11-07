/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio7T4;

import java.util.Scanner;

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio7T4 {
    
    /**
     * @param num1
     * @param num2
     * @param num3
     * @param num4
     */
    
    
    // Creo el metodo ordenar numero donde voy a ordenarlos de menor a mayor
    public static void ordenarNumero(int num1, int num2, int num3, int num4) {
        int aux;// declaro la variable auxiliar que voy a utilizar para la tecnica de los vasos

        // Repito el proceso de los vasos varias veces para ordenar los numeros 
        for (int i = 0; i < 3; i++) {
            if (num1 > num2) {
                aux = num2;
                num2 = num1;
                num1 = aux;
            }
                if (num2 > num3) {
                    aux = num3;
                    num3 = num2;
                    num2 = aux;
                }
                    if (num3 > num4) {
                        aux = num4;
                        num4 = num3;
                        num3 = aux;
                    }
        }

        // Muestro el resultado final con los numeros ordenados de menor a mayor
        System.out.println("El orden de los numeros introducidos es el siguiente: " + num1 + " - " + num2 + " - " + num3 + " - " + num4);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicito los cuatro numeros que quiere ordenar al usuario
        System.out.println("Por favor, introduzca el primer numero: ");// le digo que introduzca el primer numero
        int num1 = entrada.nextInt();

        System.out.println("Ahora, introduzca un segundo numero: ");// le digo que introduzca el segundo numero
        int num2 = entrada.nextInt();

        System.out.println("Introduzca un tercer numero: ");// le digo que introduzca el tercer numero
        int num3 = entrada.nextInt();

        System.out.println("Por ultimo, introduzca el cuarto numero: ");// le digo que introduzca el cuarto numero
        int num4 = entrada.nextInt();

        // Llamamos al metodo ordenarNumero que ordena y muestra los numeros
        ordenarNumero(num1, num2, num3, num4);
    }
    
}