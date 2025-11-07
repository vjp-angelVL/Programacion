/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Ángel Vegas López
 */
public class Calculadora {
    /**
     * @param num1
     * @param num2
     * @return la suma de los dos números
     */
    public static int suma(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }
    
    /**
     * Método para restar los números  
     * @param num1
     * @param num2     
     * @return la resta de los dos números
     */
    public static int resta(int num1, int num2) {
        return num1 - num2;
    }
    
    /**
     * Método para multiplicar los números
     * 
     * @param num1
     * @param num2
     * 
     * @return el producto de los dos números
     */
    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }
    
    /**
     * Método para dividir los números
     * 
     * @param num1
     * @param num2
     * 
     * @return la división de los dos números
     */
    public static int division(int num1, int num2) {
        return num1 / num2;
    }
    
    // Métodos estáticos de la clase Math
    /**
     * @param num
     * @return la raíz cuadrada
     */
    public static double raizCuadrada(int num) {
        return Math.sqrt(num);
    }
    
    /**
     * @param num
     * @return el cuadrado
     */
    public static double cuadrado(int num) {
        return Math.pow(num, 2);
    }
    
    /**
     * @param num
     * @return el cubo
     */
    public static double cubo(int num) {
        return Math.pow(num, 3);
    }
    
    /**
     * @param num
     * @return el número redodeado a la baja
     */
    public static double redondeoBajo(double num) {
        return Math.floor(num);
    }
    
    /**
     * @param num
     * @return el número redodeado al alza
     */
    public static double redondeoAlto(double num) {
        return Math.ceil(num);
    }
    
    /**
     * @param num
     * @return el resultado del logaritmo del número
     */
    public static double logaritmo(int num) {
        return Math.log(num);
    }
    
    /**
     * @param num1
     * @param num2    
     * @return el valor mayor
     */
    public static int valorMaximo(int num1, int num2) {
        return Math.max(num1, num2);
    }
    
    /**
     * @param num1
     * @param num2
     * @return el valor menor
     */
    public static int valorMinimo(int num1, int num2) {
        return Math.min(num1, num2);
    }
     
}