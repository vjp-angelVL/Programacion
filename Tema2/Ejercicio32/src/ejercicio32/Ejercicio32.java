/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad al usuario
        System.out.print("Por favor, indique una cantidad de dinero: ");
        int cantidad = scanner.nextInt();

        int original = cantidad;

        // Calcular el número de billetes y monedas
        int billetes50 = cantidad / 50;
        cantidad %= 50;

        int billetes20 = cantidad / 20;
        cantidad %= 20;

        int billetes10 = cantidad / 10;
        cantidad %= 10;

        int billetes5 = cantidad / 5;
        cantidad %= 5;

        int monedas2 = cantidad / 2;
        cantidad %= 2;

        int monedas1 = cantidad;

        
       
        // Mostrar el resultado
        System.out.println(original + " Euros se descomponen en:");
        System.out.println(billetes50 + " billetes de 50");
        System.out.println(billetes20 + " billetes de 20");
        System.out.println(billetes10 + " billetes de 10");
        System.out.println(billetes5 + " billetes de 5");
        System.out.println(monedas2 + " monedas de 2 euros");
        System.out.println(monedas1 + " monedas de 1 euro");

        scanner.close();
    }
}

    
    

