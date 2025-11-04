
import java.util.Scanner;

/**
 * Se desea desarrollar un algoritmo que permita mostrar la tabla de multiplicar de un número ingresado por el usuario;
 * solo en el caso que el valor del número esté entre 2 y 6. No use aún, ciclos repetitivos.
 * @author Erick Cuayal 
 * @version 1.0
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int tabla;
        System.out.print("Que tabla deseas que te presente");
        tabla = tcl.nextInt();
        if ( (tabla >= 2) && (tabla <= 6) ){
            System.out.println(tabla + " * " + 1 + " = " + (tabla*1));
            System.out.println(tabla + " * " + 2 + " = " + (tabla*2));
            System.out.println(tabla + " * " + 3 + " = " + (tabla*3));
            System.out.println(tabla + " * " + 4 + " = " + (tabla*4));
            System.out.println(tabla + " * " + 5 + " = " + (tabla*5));
            System.out.println(tabla + " * " + 6 + " = " + (tabla*6));
            System.out.println(tabla + " * " + 7 + " = " + (tabla*7));
            System.out.println(tabla + " * " + 8 + " = " + (tabla*8));
            System.out.println(tabla + " * " + 9 + " = " + (tabla*9));
            System.out.println(tabla + " * " + 10 + " = " + (tabla*10));
            System.out.println(tabla + " * " + 11 + " = " + (tabla*11));
            System.out.println(tabla + " * " + 12 + " = " + (tabla*12));
        }
        else
            System.out.println("No se puede presentar esa tabla");
     
        
    }
}

/**
 * Que tabla deseas que te presente 6
6 * 1 = 6
6 * 2 = 12
6 * 3 = 18
6 * 4 = 24
6 * 5 = 30
6 * 6 = 36
6 * 7 = 42
6 * 8 = 48
6 * 9 = 54
6 * 10 = 60
6 * 11 = 66
6 * 12 = 72
BUILD SUCCESSFUL (total time: 5 seconds)
 */