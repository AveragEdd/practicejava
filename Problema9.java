/*Calcular el valor de un carácter de la tabla ASCII a partir del valor capturado en pantalla. 
Si el número, o valor que no corresponde a ningún carácter, el programa debe devolver un error, 
y seguir preguntando hasta recibir una entrada correcta.*/
import java.io.*;
public class Problema9 {
    public static void main(String[] args) throws IOException{
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String dato;
        char valor;
        int valorEnAscii;

        while (true) {
            System.out.println("Ingrese un caracter:");
            dato = leer.readLine();

            if (dato.length() == 1) {
                valor = dato.charAt(0);
                valorEnAscii = (int) valor;
                System.out.println("El valor del caracter " + valor + " es: " + valorEnAscii);
                break;
            } else {
                System.out.println("El numero o caracter no es valido, intente otra vez.");
            }
        
        }
    }
}
