/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner; ;

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario el número de segundos
        System.out.println("Por favor, introduzca un número de segundos:");
        long totalSegundos = entrada.nextLong();

        // Cálculos de días, horas, minutos y segundos
        long dias = totalSegundos / 86400; // 1 día = 86400 segundos
        long resto = totalSegundos % 86400;

        long horas = resto / 3600; // 1 hora = 3600 segundos
        resto = resto % 3600;

        long minutos = resto / 60;
        long segundos = resto % 60;

        // Muestro el resultado
        System.out.printf("%d segundos hacen un total de: %d días, %d horas, %d minutos y %d segundos.\n",
                totalSegundos, dias, horas, minutos, segundos);
    }
}

    

