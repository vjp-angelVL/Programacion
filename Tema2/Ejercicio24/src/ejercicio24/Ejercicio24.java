/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;
  import java.util.Scanner;

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicito las notas al alumno
        System.out.print("Por favor, introduzca la nota de Programación: ");
        double programacion = entrada.nextDouble();

        System.out.print("Introduzca la nota de Lenguajes de Marcas: ");
        double lenguajesMarcas = entrada.nextDouble();

        System.out.print("Introduzca la nota de Bases de Datos: ");
        double basesDatos = entrada.nextDouble();

        System.out.print("Introduzca la nota de Entornos de Desarrollo: ");
        double entornosDesarrollo = entrada.nextDouble();

        System.out.print("Introduzca la nota de Sistemas Informáticos: ");
        double sistemasInformaticos = entrada.nextDouble();

        System.out.print("Introduzca la nota de Inglés Profesional: ");
        double inglesProfesional = entrada.nextDouble();

        System.out.print("Por último, introduzca la nota de Itinerario Personal para la Empleabilidad: ");
        double itinerarioPersonal = entrada.nextDouble();

        // Calculo la media
        double media = (programacion + lenguajesMarcas + basesDatos + entornosDesarrollo +
                        sistemasInformaticos + inglesProfesional + itinerarioPersonal) / 7;

        // Muestro la media con un decimal
        System.out.printf("Su nota media del curso es de: %.1f\n", media);

    }
}


    