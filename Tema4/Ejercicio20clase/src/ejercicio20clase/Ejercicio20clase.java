package ejercicio20clase;

import java.util.Scanner;

/**
 * @author Ángel Vegas
 */
public class Ejercicio20clase {
    
    // Constantes con las respuestas correctas
    public final static String RESPUESTA1 = "Madrid";
    public final static String RESPUESTA2 = "Colón";
    
    // Constantes con las preguntas
    public final static String PREGUNTA1 = "¿Cuál es la capital de España?";
    public final static String PREGUNTA2 = "¿Quién descubrió América?";
    
    // Valor de puntuación por cada acierto
    public final static int PUNTUACION = 5;
    
    // Método para pedir respuesta al usuario
    public static String pedirRespuesta() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    // Método para comprobar si la respuesta es correcta
    public static boolean comprobarRespuesta(String respuestaUsuario, String respuestaCorrecta) {
        return respuestaUsuario.equalsIgnoreCase(respuestaCorrecta);
    }
    
    // Método para hacer la primera pregunta
    public static int pregunta1() {
        System.out.println("1ª PREGUNTA: " + PREGUNTA1);
        String respuestaUsuario = pedirRespuesta();
        
        if (comprobarRespuesta(respuestaUsuario, RESPUESTA1)) {
            System.out.println("Muy bien, respuesta correcta.");
            return PUNTUACION;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + RESPUESTA1);
            return 0;
        }
    }
    
    // Método para hacer la segunda pregunta
    public static int pregunta2() {
        System.out.println("2ª PREGUNTA: " + PREGUNTA2);
        String respuestaUsuario = pedirRespuesta();
        
        if (comprobarRespuesta(respuestaUsuario, RESPUESTA2)) {
            System.out.println("Muy bien, respuesta correcta.");
            return PUNTUACION;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + RESPUESTA2);
            return 0;
        }
    }
    
    // Método principal
    public static void main(String[] args) {
        System.out.println("EXAMEN DE CULTURA GENERAL");
        
        int puntuacionFinal = 0;
        
        puntuacionFinal += pregunta1();
        puntuacionFinal += pregunta2();
        
        System.out.println("NOTA DEL EXAMEN: " + puntuacionFinal);
    }
}

    