/*Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. */
import java.io.*;

public class Problema1Celsius {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        float celsius = 0, fahrenheit = 0;

        System.out.println("Ingrese los grados Celsius a convertir: ");
        celsius = Float.parseFloat(leer.readLine()); 
        fahrenheit = (celsius * 1.8f) + 32; 

        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit); 
    }
}