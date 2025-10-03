/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // Declarar constante PI y el radio
        final double PI = Math.PI;
        double radio = 5.2;

        // Calcular el área de la circunferencia: área = PI * radio^2
        double area = PI * Math.pow(radio, 2);

        // Mostrar el resultado
        System.out.printf("El área de una circunferencia cuyo radio vale %.1f sería igual a: %.2f centímetros cuadrados.\n", radio, area);
    }
}

    
    

