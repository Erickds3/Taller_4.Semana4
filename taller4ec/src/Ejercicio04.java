
import java.util.Scanner;

/**
 * Generar un algoritmo que permita calcular y mostrar el valor de la planilla 
 * de teléfono de un casa.
 * Se debe ingresar el costo por minutos, el número de minutos consumidos en el
 * mes.
 * @author Erick Cuayal 
 * @version 1.0
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double CostoMinutos, MinutosMes,  ValorPlantilla;
        System.out.println("Ingrese el CostoMinutos: ");
        CostoMinutos = tcl.nextDouble();
        System.out.println("Ingrese los MinutosMes: ");
        MinutosMes = tcl.nextDouble();
         
        ValorPlantilla = (CostoMinutos*MinutosMes);
        
        System.out.println("El valor de la plantilla es: "+ValorPlantilla);
    }
}
/**run:
Ingrese el CostoMinutos: 
12
Ingrese los MinutosMes: 
24
El valor de la plantilla es: 288.0
BUILD SUCCESSFUL (total time: 7 seconds)

 */