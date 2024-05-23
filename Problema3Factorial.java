/*Programa que haga la descomposición factorial de un número en divisible entre 2, 3 o
5. Y muestre en pantalla los resultados */
import java.io.*;

public class Problema3Factorial {
    public static void main(String[] args) throws IOException{
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int numero= 0, divisor= 2;
        System.out.println("Ingrese un numero entero: ");
        numero = Integer.parseInt(leer.readLine());

        if (numero <= 0) {
            System.out.println("El numero no puede ser negativo o cero, intente nuevamente");
        } else {
            while (numero > 1) {
                if (numero % divisor == 0) {
                    System.out.println(numero + "  /  " + divisor);
                    numero = numero / divisor;
                } else {
                    divisor++;
                }
            }
            System.out.println(numero);; 
        }
    }
}
