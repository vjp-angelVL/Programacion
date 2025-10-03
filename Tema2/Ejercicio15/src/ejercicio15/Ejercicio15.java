/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo = 10000; // tiempo en segundos

        // Cálculo de horas, minutos y segundos
        int horas = tiempo / 3600;
        int restoSegundos = tiempo % 3600;
        int minutos = restoSegundos / 60;
        int segundos = restoSegundos % 60;

        // Mostrar el resultado
        System.out.printf("%,d segundos hacen un total de: %d horas, %d minutos y %d segundos.\n", tiempo, horas, minutos, segundos);
    }
}
