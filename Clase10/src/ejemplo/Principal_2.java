package ejemplo;
import java.util.Scanner;
/**
 * Autor: Andres Roman
 * Fecha: 06/1/2017
 */
public class Principal_2 {
    public static void main (String[] args){
        // int valor = 10/0;
        // int valor = Integer.parseInt("Loja");
        Scanner entrada = new Scanner(System.in);
        int num=0, den=0;
        do{
            try{
                System.out.println("Ingrese el numerador:");
                num = entrada.nextInt();
                System.out.println("Ingrese el denominador:");
                den = entrada.nextInt();
                int resultado=num/den;
                System.out.printf("%d / %d = %d\n", num, den, resultado);
                break;
            }catch(ArithmeticException e){
                System.err.printf("Exception: %s\n", e);
                System.out.println("Ingrese un denominador distinto de 0");

            }
        }while(true);
    }
}
