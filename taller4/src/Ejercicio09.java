
import java.util.Scanner;

/**
 * Desarrolle una solución que determine el estado académico de una persona 
 * estudiante en una asignatura universitaria 
 * a partir de una calificación de evaluación continua, 
 * una calificación de examen final y un porcentaje de asistencia.
 * La regla institucional establece que: 
 * La asistencia mínima debe alcanzarse para ser evaluado
 * Existe una nota mínima en el examen final, y
 * La nota final se calcula combinando evaluación continua y examen final.
 * La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, 
 * y mostrar la nota final redondeada a un decimal.
 * @author Erick Cuayal 
 * @version 1.0
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        //definimos  variables
        double evaluacion_continua, examen_final, porcentaje_asistencia;
        System.out.println("Ingrese la nota de evaluacion continua (0-10)");
        evaluacion_continua = tcl.nextDouble();
        System.out.println("Ingrese la nota de examen final (0-10)");
        examen_final = tcl.nextDouble();
        System.out.println("Ingrese el porcentaje de asistencia (0-100)");
        porcentaje_asistencia = tcl.nextDouble();
        
        // Requisitos de la institucion
        
        double asistenciaMinima = 70; 
        double notaMinimaExamen = 4.0; 
        double notaFinal;
       
        
        // Comprobar la asistencia
        
        if (porcentaje_asistencia < asistenciaMinima)
            System.out.println("Reprobado por inasistencia");
       
 
        // calcular notaFinal: 40% evaluación continua + 60% examen final
         notaFinal = (evaluacion_continua * 0.4) + (examen_final * 0.6);
        
        if (examen_final < notaMinimaExamen) {
                System.out.println("Reprobado (no alcanzó la nota mínima en el examen final)");
                
            } else if (notaFinal >= 7.0) {
                System.out.println("Aprobado con nota final: " + String.format("%.1f", notaFinal));
            } else if (notaFinal >= 5.0) {
                System.out.println("Supletorio con nota final: " + String.format("%.1f", notaFinal));
            } else if (notaFinal < 5.0) {
                System.out.println("Reprobado con nota final: " + String.format("%.1f", notaFinal));
            }

    }
}
/**
run:
Ingrese la nota de evaluacion continua (0-10)
7
Ingrese la nota de examen final (0-10)
9
Ingrese el porcentaje de asistencia (0-100)
67
Reprobado por inasistencia
Aprobado con nota final: 8,2
BUILD SUCCESSFUL (total time: 10 seconds)
 */