
import java.util.Scanner;

/**
 * Se debe generar una solución que permita calcular y mostrar el valor total a 
 * pagar mensual de servicios digitales de una persona. 
 * Los servicios digitales son: netflix, youtube premium, dropbox, spotify.
 * Si la persona es menor a 30 años se descuenta el 20% del total mensual.
 * @author Erick Cuayal 
 * @version 1.0
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double netflix, youtube_premium, dropbox, spotify, edad, descuento, total_mensual;
        System.out.println("Ingrese el valor de netflix");
        netflix = tcl.nextDouble();
        System.out.println("Ingrese el valor de youtube premium");
        youtube_premium = tcl.nextDouble();
        System.out.println("Ingrese el valor de dropbox");
        dropbox = tcl.nextDouble();
        System.out.println("Ingrese el valor de spotify");
        spotify = tcl.nextDouble();
        System.out.println("Ingresa tu edad");
        edad = tcl.nextDouble();
        System.out.println("Ingrese el valor del descuento");
        descuento = tcl.nextDouble(); 
        
        total_mensual = (netflix + youtube_premium + dropbox + spotify);
        
        if (edad <= 30 ) {
            descuento = total_mensual * 0.2 / 100; 
            total_mensual = total_mensual - descuento; 
            
        }
        System.out.println("El total mensual es:" + total_mensual);
    }
}
/**
run:
Ingrese el valor de netflix
25
Ingrese el valor de youtube premium
35
Ingrese el valor de dropbox
12
Ingrese el valor de spotify
23
Ingresa tu edad
45
Ingrese el valor del descuento
20
El total mensual es:95.0
BUILD SUCCESSFUL (total time: 23 seconds)

 */