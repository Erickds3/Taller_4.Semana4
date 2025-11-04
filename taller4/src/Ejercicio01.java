
import java.util.Scanner;

/**
 * Generar un algoritmo que permite calcular y presentar el área de un triángulo. Los datos deben ser pedidos al usuario.
 * @author Erick Cuayal 
 * @version 1.0
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base, altura, respuesta;
        System.out.println("Dame la base y la altura del triangulo: ");
        base = tcl.nextDouble();
        altura = tcl.nextDouble();
        respuesta = (base*altura) / 2;
        System.out.println("Area del triangulo es: "+respuesta);
       
    }
}

/**
 run:
Dame la base y la altura del triangulo: 
6
9
Area del triangulo es: 27.0
BUILD SUCCESSFUL (total time: 6 seconds)
 */