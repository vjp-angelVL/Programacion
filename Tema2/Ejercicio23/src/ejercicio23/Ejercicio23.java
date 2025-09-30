<package ejercicio3;
/**
 * @author Ángel Vegas López
 */
public class Ejercicio22 {
    import java.util.Scanner;
import java.util.Scanner;

public class NotaMediaDAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la nota de Programación: ");
        double programacion = sc.nextDouble();

        System.out.print("Introduzca la nota de Lenguajes de Marcas: ");
        double lenguajes = sc.nextDouble();

        System.out.print("Introduzca la nota de Bases de Datos: ");
        double basesDatos = sc.nextDouble();

        System.out.print("Introduzca la nota de Entornos de Desarrollo: ");
        double entornos = sc.nextDouble();

        System.out.print("Introduzca la nota de Sistemas Informáticos: ");
        double sistemas = sc.nextDouble();

        System.out.print("Por último, introduzca la nota de Formación y Orientación Laboral: ");
        double fol = sc.nextDouble();

        double media = (programacion + lenguajes + basesDatos + entornos + sistemas + fol) / 6;

        System.out.printf("La nota media del curso es de: %.2f%n", media);

        sc.close();
    }
}
