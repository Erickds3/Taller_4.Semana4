
import java.util.Scanner;

/**
 * Generar un algoritmo que permita calcular y mostrar el costos de una 
 * computadora de escritorio.
 * La misma es comprada por partes; CPU, teclado, pantalla, ratón.
 * @author Erick Cuayal 
 * @version 1.0
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double cpu, teclado, pantalla, raton, costototal;
        System.out.println("Ingrese el costo del cpu");
        cpu = tcl.nextDouble();
        System.out.println("Ingrese el costo del teclado");
        teclado = tcl.nextDouble();
        System.out.println("Ingrese el costo de la pantalla");
        pantalla = tcl.nextDouble();
        System.out.println("Ingrese el costo del raton");
        raton = tcl.nextDouble();
        
        costototal = (cpu + teclado + pantalla + raton);
        System.out.println("El costo total de la computadora es:" + costototal);
        
        
    }
}
/**
run:
Ingrese el costo del cpu
456
Ingrese el costo del teclado
47
Ingrese el costo de la pantalla
98
Ingrese el costo del raton
25
El costo total de la computadora es:626.0
BUILD SUCCESSFUL (total time: 25 seconds)
 */