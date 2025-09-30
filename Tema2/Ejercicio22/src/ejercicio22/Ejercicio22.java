package ejercicio22;
/**
 * @author Ángel Vegas López
 */
public class Ejercicio22 {

public class CalculoCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir el precio del producto
        System.out.print("Por favor, introduzca el precio del producto: ");
        double precio = sc.nextDouble();

        // Pedir la cantidad de unidades
        System.out.print("¿Cuántas unidades quiere llevar? ");
        int unidades = sc.nextInt();

        // Calcular el precio total
        double total = precio * unidades;

        // Mostrar el resultado
        System.out.printf("El precio total de su compra es: %.2f Euros.%n", total);

        sc.close();
    }
}

    }

    

