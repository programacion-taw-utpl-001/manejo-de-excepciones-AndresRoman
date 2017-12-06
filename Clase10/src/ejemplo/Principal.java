package ejemplo;
import java.util.Scanner;
/**
 * Autor: Andres Roman
 * Fecha: 06/12/2017
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        // Entrada de datos
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su nombre:");
        nombre = entrada.nextLine();
        // Muestra de datos
        System.out.printf("Su nombre es %s\n", nombre);
        System.out.printf("Su edad es %d\n", edad);
    }
    
}
