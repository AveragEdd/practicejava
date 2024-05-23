/*Capturar un numero N, imprimir todos los números primos entre 1 y N */

import java.io.*;
public class Problema5NumeroPrimo {
    public static void main(String[] args) throws IOException{
         BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        int n, i, j;
        Boolean primo= true;

        System.out.println("Ingrese un numero N: ");
        n = Integer.parseInt(leer.readLine());

        System.out.println("Los numeros primos entre 1 y " + n + " son: ");
        for (i = 2; i <= n; i++){
            primo = true;
            for (j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0){
                    primo = false;
                    break;
                } //FinIf
            } //FinFor
            if(primo){
                System.out.print(i + " ");
            } //FinIf
        } //FinFor
    }
}
