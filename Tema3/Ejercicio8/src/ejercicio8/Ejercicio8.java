/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, indique una cantidad de dinero: ");
        int importe = entrada.nextInt();

        int original = importe;

        int billetes50 = importe / 50;
        importe %= 50;

        int billetes20 = importe / 20;
        importe %= 20;

        int billetes10 = importe / 10;
        importe %= 10;

        int billetes5 = importe / 5;
        importe %= 5;

        int monedas2 = importe / 2;
        importe %= 2;

        int monedas1 = importe; // lo que queda es en monedas de 1 euro

        System.out.println(original + " Euros se descomponen en:");

        if (billetes50 > 0) {
            System.out.println("Billetes de 50: " + billetes50);
        }
        if (billetes20 > 0) {
            System.out.println("Billetes de 20: " + billetes20);
        }
        if (billetes10 > 0) {
            System.out.println("Billetes de 10: " + billetes10);
        }
        if (billetes5 > 0) {
            System.out.println("Billetes de 5: " + billetes5);
        }
        if (monedas2 > 0) {
            System.out.println("Monedas de 2 euros: " + monedas2);
        }
        if (monedas1 > 0) {
            System.out.println("Monedas de 1 euro: " + monedas1);
        }

    }
}

    
    

