/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, introduzca la nota del alumno (0-10): ");
        int nota = entrada.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("Error: La nota debe estar entre 0 y 10.");
        } else if (nota <= 4) {
            System.out.println("Suspenso.");
        } else if (nota <= 6) {
            System.out.println("Bien.");
        } else if (nota <= 8) {
            System.out.println("Notable.");
        } else { // 9 o 10
            System.out.println("Sobresaliente.");
        }

    }
}
    

    
    

