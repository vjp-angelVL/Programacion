/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;
 import java.util.Scanner;

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los tres números al usuario
        System.out.print("Por favor, introduzca el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Por favor, introduzca el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Por favor, introduzca el tercer número: ");
        int numero3 = scanner.nextInt();

        // Calcular la suma y el producto
        int suma = numero1 + numero2 + numero3;
        int producto = numero1 * numero2 * numero3;

        // Mostrar los resultados
        System.out.println("La suma de los números introducidos es: " + suma);
        System.out.println("El producto de los números introducidos es: " + producto);

        scanner.close();
    }
}

    }


