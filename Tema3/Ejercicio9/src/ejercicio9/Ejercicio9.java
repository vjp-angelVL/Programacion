/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ahora, introduzca un segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduzca el tercer numero: ");
        int num3 = scanner.nextInt();

        System.out.print("Por último, introduzca un cuarto numero: ");
        int num4 = scanner.nextInt();

        int[] numeros = {num1, num2, num3, num4};
        Arrays.sort(numeros);

        System.out.println("El orden de los números introducidos es el " 
            + numeros[0] + " - " + numeros[1] + " - " + numeros[2] + " - " + numeros[3]);

        scanner.close();
    }
}

    
    

