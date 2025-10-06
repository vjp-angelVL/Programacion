/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;

/**
 *
    * @author Ángel Vegas López
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un numero: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número introducido es positivo");
        } else if (numero < 0) {
            System.out.println("El número introducido es negativo");
        } else {
            System.out.println("El número introducido es cero");
        }

        scanner.close();
    }
}

    
    

