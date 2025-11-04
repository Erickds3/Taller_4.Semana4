
import java.util.Scanner;

/**
 * Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de familia;
 * calcular y mostrar el total de gastos de los hijos del padre de familia.
 * @author Erick Cuayal
 * @version 1.0
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double hijo1, hijo2, hijo3, respuesta;
        System.out.println("Ingrese el gasto del hijo1");
        hijo1 = tcl.nextDouble();
        System.out.println("Ingrese el gasto del hijo2");
        hijo2 = tcl.nextDouble();
        System.out.println("Ingrese el gasto del hijo3");
        hijo3 = tcl.nextDouble();
        
        respuesta = (hijo1 + hijo2 + hijo3) ;
        System.out.println("El gasto de los tres hijos es: $" + respuesta);
        
        
    }
}

/**
 * Ingrese el gasto del hijo1
24
Ingrese el gasto del hijo2
42
Ingrese el gasto del hijo3
54
El gasto de los tres hijos es: $120.0
BUILD SUCCESSFUL (total time: 13 seconds)
 */