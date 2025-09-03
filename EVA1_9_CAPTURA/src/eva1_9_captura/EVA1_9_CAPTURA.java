
package eva1_9_captura;

import java.util.Scanner;

public class EVA1_9_CAPTURA {
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad; 
        double promedio;
         Scanner input = new Scanner(System.in);//CREAMOS EL SCANNER
         
         //COMO CAPTURAR EN JAVA
        System.out.println("Introduce el nombre completo:");
        nombre = input.nextLine();//CAPTURA TEXTO
        
        System.out.println("El nombre capturado es:");
          System.out.println(nombre);
        
        System.out.println("Introduce la edad:");
        edad = input.nextInt();
        
        System.out.println("La edad capturada es:");
        System.out.println(edad);
        
        System.out.println("Escribe el promedio");
        promedio = input.nextDouble();
        
        System.out.println("El promedio capturado es:");
        System.out.println(promedio);
        
        
        
    }
    
}
