/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

/**
 *
 * @author Ángel Vegas López
 */
import java.util.InputMismatchException;
import java.util.Scanner;//Importo el scanner
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaro las variables
        int num1,num2;
        int operacion;
        int resultado;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduce el primer numero"); //Asigno la variable a el valor
        
        num1 = entrada.nextInt();
        
        System.out.println("Introduce el segundo numero");//Asigno la variable a el valor
        
        num2 = entrada.nextInt();
        
        System.out.println("1.- Sumar los numeros"); //Hago un menu de opciones
        
        System.out.println("2.- Restar los numeros");
        System.out.println("3.- Multiplicar los numeros");
        System.out.println("4.- Dividir los numeros");
        System.out.println("5.- Salir del programa");
        
        operacion = entrada.nextInt();
        
       try { //Hago el control de errores y dentro pongo el switch case
           switch (operacion){
            case 1: { //En caso de 1 suma y muestra el resultado
                resultado = num1+num2;
                System.out.println(num1+"+"+num2+"="+resultado);
            break;
            }
            case 2 : {//En caso de 2 resta y muestra el resultado
                resultado = num1-num2;
                System.out.println(num1+"-"+num2+"="+resultado);
            break;
            }
            case 3: {//En caso de 3 multiplica y muestra el resultado
                resultado = num1*num2;
                System.out.println(num1+"*"+num2+"="+resultado);
            break;
            }
            case 4 : {//En caso de 4 divide y muestra el resultado
                resultado = num1/num2;
                System.out.println(num1+"/"+num2+"="+resultado);
            break;
            }
            case 5 : {//En caso de 5 sale del programa
            System.out.println("Salir del programa");
            }
            default: {
                System.out.println("Introduce un numero del 1 al 5");//Pongo una opcion para que escriba un numero del 1 al 5
            }
           }
       }
            catch(ArithmeticException e){ //Para que no pueda divir entre 0
                    System.out.println("No puedes dividir por 0.");
                    System.out.println(e);
                    }
            catch(InputMismatchException e){ //Para que no pueda escribir un valor incorrecto
                    System.out.println("Has introducido un dato inválido");
            }
    }
}
   