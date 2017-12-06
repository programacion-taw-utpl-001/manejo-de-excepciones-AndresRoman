package ejemplo_2;
import java.util.Scanner;
/**
 * Autor: Andres Roman
 * Fecha: 06/12/2017
 */
public class Ejecutor {
    public static void main (String []args){
        Scanner entrada = new Scanner(System.in);
        int lim=4;
        int cont=0;
        Estudiante []lista_estudiantes = new Estudiante[lim];
        double []notas_matematicas = new double[lim];
        double []notas_sociales = new double[lim];
        while(cont < lim){
            try{
                Estudiante est = new Estudiante();
                entrada.nextLine();
                System.out.println("Ingrese el nombre:");
                est.setNombre(entrada.nextLine());
                System.out.println("Ingrese el apellido:");
                est.setApellido(entrada.nextLine());
                lista_estudiantes[cont] = est;
                System.out.println("Ingrese la nota de matematicas");
                double mat = Double.parseDouble(entrada.nextLine());
                notas_matematicas[cont] = mat;
                System.out.println("Ingrese la nota de sociales");
                double soc = Double.parseDouble(entrada.nextLine());
                notas_sociales[cont] = soc;
                cont++;
                
            }catch(NumberFormatException e){
                System.err.printf("Exception %s", e);
                System.out.println("La nota debe ser un numero");
            }
        }
        Asignacion a = new Asignacion(lista_estudiantes, notas_matematicas, notas_sociales);
        System.out.println(a);
    }
}
