/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
 

    public static void main(String[] args) {
        int totalEuros = 130;

        int billetes50 = totalEuros / 50; // Número de billetes de 50
        int resto = totalEuros % 50;

        int billetes10 = resto / 10; // Número de billetes de 10

        System.out.printf("%d euros hacen un total de: %d billetes de 50 euros y %d billetes de 10 euros.\n",
                          totalEuros, billetes50, billetes10);
    }
}