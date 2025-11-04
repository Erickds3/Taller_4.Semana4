
import java.util.Scanner;

/**
 * Generar un solución que permita calcular y mostrar el pago mensual de un 
 * préstamo de 1 año de plazo.
 * Se debe ingresar el monto del préstamo y el interés mensual a cobrar.
 * @author Erick Cuayal 
 * @version 1.0
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        double Montoprestamo, Interesmensual, Pagomensual, Tiempopagar = 0;
      
       
        System.out.println("Ingrese el monto del prestamo");
        Montoprestamo = tcl.nextDouble();
       
        System.out.println("Ingrese el Interesmensual (%)");
        Interesmensual = tcl.nextDouble();
       
        System.out.println("Tiempo a pagar (en meses) : " + Tiempopagar );
        Tiempopagar = tcl.nextInt();
        
        double interesDecimal = Interesmensual / 100 ; 
         
        Pagomensual = (Montoprestamo + (Montoprestamo * interesDecimal   * Tiempopagar)) / Tiempopagar;
        
        System.out.println("RESULTADOS");
        
        System.out.println("Interes mensual: "+ Interesmensual);
        
        System.out.println("Pago mensual a relizar:" + Pagomensual);
        
        
                
        
        
        
    }
}
/**
run:
Ingrese el monto del prestamo
13000
Ingrese el Interesmensual (%)
4
Tiempo a pagar (en meses) : 0.0
12
RESULTADOS
Interes mensual: 4.0
Pago mensual a relizar:1603.3333333333333
* 
 */
