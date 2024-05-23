/*Programa lea la longitud de los catetos y la hipotenusa de un triángulo rectángulo y calcule, 
según el teorema de Pitágoras, el tercer lado a partir de dos lados capturados.  */
import java.io.*;

public class Problema2Triangulo {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        float catetoOpuesto= 0, catetoAdyacente= 0, hipotenusa= 0;
        int opcion, desicion= 1;

        while(desicion == 1){
        System.out.println("Las opciones para calcular el lado deseado son: \n 1. Calcular la hipotenusa. \n 2. Calcular el cateto opuesto. \n 3. Calcular el cateto adyacente.\n Ingrese la opción deseada:");
        opcion = Integer.parseInt(leer.readLine()); 

            switch (opcion) {
                case 1: //Calcular hipotenusa
                    System.out.println("Ingrese la longitud del cateto opuesto: ");
                    catetoOpuesto = Float.parseFloat(leer.readLine()); 
            
                    System.out.println("Ingrese la longitud del cateto adyacente: ");
                    catetoAdyacente = Float.parseFloat(leer.readLine());

                    hipotenusa = (float) Math.sqrt((catetoOpuesto * catetoOpuesto) + (catetoAdyacente * catetoAdyacente));
                    System.out.println("La longitud de la hipotenusa es: " + hipotenusa);
                        break;

                case 2: //Calcular lado opuesto
                    System.out.println("Ingrese la longitud del cateto adyacente: ");
                    catetoAdyacente = Float.parseFloat(leer.readLine());

                    System.out.println("Ingrese la longitud de la hipotenusa: ");
                    hipotenusa = Float.parseFloat(leer.readLine());

                    catetoOpuesto = (float) Math.sqrt((hipotenusa * hipotenusa) - (catetoAdyacente * catetoAdyacente));
                    System.out.println("La longitud del cateto opuesto es: " + catetoOpuesto);
                        break;
                
                case 3: //Calcular lado adyacente
                    System.out.println("Ingrese la longitud del cateto opuesto: ");
                    catetoOpuesto = Float.parseFloat(leer.readLine()); 

                    System.out.println("Ingrese la longitud de la hipotenusa: ");
                    hipotenusa = Float.parseFloat(leer.readLine());

                    catetoAdyacente = (float) Math.sqrt((hipotenusa * hipotenusa) - (catetoOpuesto * catetoOpuesto));
                    System.out.println("La longitud del cateto adyacente es: " + catetoAdyacente);
                        break;

                default: 
                    System.out.println("La opcion ingresada no corresponde con las disponibles");
                        break;

            } //FinSwitch
            System.out.println("\n Desea continuar calculando lados? (1 = SI) (0 = NO)");
            desicion = Integer.parseInt(leer.readLine());
        }//FinWhile
    }
}