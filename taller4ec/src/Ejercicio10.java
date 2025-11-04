
import java.util.Scanner;

/**
 * El programa debe calcular el área del polígono. La figura se compone de un 
 * cuadrado perfecto (A), 
 * tres triángulos rectángulos iguales (B, C, E), cuya base mide lo mismo que 
 * uno de los lados del cuadrado, 
 * y un rectángulo (D) cuyo ancho mide lo mismo que uno de los 
 * lados del cuadrado, 
 * mientras que la altura mide lo mismo que la altura de los triángulos. 
 * Se pide que haga un programa que calcule el área total.
 * Por cultura general, sabemos que el área de un rectángulo 
 * se calcula multiplicando su base por su altura; 
 * el área de un triángulo rectángulo se calcula multiplicando
 * su base por su altura, 
 * y luego dividiendo el resultado entre dos; finalmente, 
 * el área de un cuadrado se calcula elevando al cuadrado la medida de uno de 
 * sus lados.
 * @author Erick Cuayal 
 * @version 1.0
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double  base, altura, area_poligono, area_cuadrado, area_triangulo,
                area_rectangulo;
        System.out.println("Ingrese la base del cuadrado");
        base = tcl.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura = tcl.nextDouble();
        
        // calcular area de las figuras
        
        area_cuadrado = base + base + base + base;
        area_triangulo = base * altura / 2;
        area_rectangulo = base * altura;
        
        area_poligono = area_cuadrado + (area_triangulo * 3) + area_rectangulo;
        
        System.out.println("El area total del poligomo es: "+ area_poligono );
    }
}

/**
run:
Ingrese la base del cuadrado
24
Ingrese la altura del triangulo
12
El area total del poligomo es: 816.0
BUILD SUCCESSFUL (total time: 5 seconds)


 */