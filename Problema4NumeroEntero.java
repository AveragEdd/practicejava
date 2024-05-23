/*Programa que lea un número entero N de 5 cifras y muestre sus cifras igual que en el
ejemplo. */
import java.io.*;

public class Problema4NumeroEntero {
    public static void main(String[] args) throws IOException{
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        int numero;
        System.out.println("Ingrese un numero entero de 5 cifras: ");
        numero = Integer.parseInt(leer.readLine());

        if (numero >= 10000 && numero <= 99999) {
            System.out.println("La salida del numero " + numero + " es:");
                String numStr = String.valueOf(numero);

                for (int i = 1; i <= 5; i++) {
                    String numero2 = numStr.substring(0, i);
                    System.out.println(numero2);
                }

            } else {
                System.out.println("El numero ingresado no es un entero de 5 cifras.");
            }
    }
}
