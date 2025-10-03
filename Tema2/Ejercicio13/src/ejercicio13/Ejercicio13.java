/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración e inicialización de variables
        int num1 = 1;
        int num2 = 2;

        // Mostrar valores originales
        System.out.println("La variable num1 contiene el valor " + num1 + " y la variable num2 contiene el valor " + num2 + ".");

        // Intercambiar valores usando una variable auxiliar
        int aux = num1;
        num1 = num2;
        num2 = aux;

        // Mostrar valores después del intercambio
        System.out.println("Ahora, la variable num1 contiene el valor " + num1 + " y la variable num2 contiene el valor " + num2 + ".");
    }
}

    
    

