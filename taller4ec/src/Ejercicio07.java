
import java.util.Scanner;

/**
 * Generar un algoritmo que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
 * Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes.
 * Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.
 * @author MARDIEG DIAZ
 * @version 1.0
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double kilovatiohora, kilovatiosmes, edad, descuento, valorpagar;
        System.out.println("Ingresar el valor de kilovatio/hora: ");
        kilovatiohora = tcl.nextDouble();
        System.out.println("Ingresar el valor de kilovatios consumidos en el mes: ");
        kilovatiosmes = tcl.nextDouble();
        System.out.println("Ingresar la edad del usuario: ");
        edad = tcl.nextInt();
        System.out.println("Ingresar el valor del descuento: ");
        descuento = tcl.nextInt();
        
        
        valorpagar = kilovatiohora * kilovatiosmes;
        if (edad > 65) {
            descuento = valorpagar * 0.10 ;
            valorpagar = valorpagar - descuento;
            
        }
        System.out.println("Costo por kilovatio/hora $" + kilovatiohora);
        System.out.println("Numero de Kilovatios consumidos al mes " + kilovatiosmes);
        System.out.println("Edad del usuario" + edad);
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Valor a pagar: " + valorpagar);
        
    }
}
/**
run:
Ingresar el valor de kilovatio/hora: 
22
Ingresar el valor de kilovatios consumidos en el mes: 
560
Ingresar la edad del usuario: 
63
Ingresar el valor del descuento: 
10
Costo por kilovatio/hora $22.0
Numero de Kilovatios consumidos al mes 560.0
Edad del usuario63.0
Descuento aplicado: 10.0
Valor a pagar: 12320.0
BUILD SUCCESSFUL (total time: 33 seconds)
 */