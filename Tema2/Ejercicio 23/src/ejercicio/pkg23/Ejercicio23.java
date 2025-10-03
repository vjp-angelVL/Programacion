/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg23;

 import java.util.Scanner;

/**
 *
 * @author Ángel Vegas López
 */

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar precio del producto
        System.out.print("Por favor, introduzca el precio del modelo de ordenador que desea comprar:\n");
        double precio = scanner.nextDouble();

        // Solicitar número de unidades
        System.out.print("¿Cuántas unidades quiere llevarse? ");
        int unidades = scanner.nextInt();

        // Calcular el precio total
        double total = precio * unidades;

        // Mostrar el resultado
        System.out.printf("El precio total de su compra es de: %.2f Euros.\n", total);

        scanner.close();
    }
}

    
    

