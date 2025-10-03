/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;
import java.util.Scanner;


/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número al usuario
        System.out.print("Por favor, introduzca un número de 4 cifras: ");
        int numero = scanner.nextInt();

        // Validar que el número tenga exactamente 4 cifras
        if (numero >= 1000 && numero <= 9999) {
            // Obtener cada cifra
            int primera = numero / 1000;
            int segunda = (numero / 100) % 10;
            int tercera = (numero / 10) % 10;
            int cuarta = numero % 10;

            // Mostrar los resultados
            System.out.println("La primera cifra es: " + primera);
            System.out.println("La segunda cifra es: " + segunda);
            System.out.println("La tercera cifra es: " + tercera);
            System.out.println("La cuarta cifra es: " + cuarta);
        } else {
            System.out.println("El número introducido no tiene 4 cifras.");
        }

        scanner.close();
    }
}

    }
    

