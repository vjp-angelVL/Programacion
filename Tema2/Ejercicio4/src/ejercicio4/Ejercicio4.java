/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Datos de la asignatura y notas
        String nombreAsignatura = "Programación";
        float nota1 = 8.5f;
        float nota2 = 7.0f;

        // Calcular la media
        float media = (nota1 + nota2) / 2;

        // Mostrar resultados
        System.out.println("Asignatura: " + nombreAsignatura);
        System.out.println("Nota del primer examen: " + nota1);
        System.out.println("Nota del segundo examen: " + nota2);
        System.out.println("Nota media: " + media);
    }
}
