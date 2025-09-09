
package eva1__13_if;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class EVA1__13_IF {

    public static void main(String[] args) {
        // TODO code application logic here
    double califa;
    Scanner cap = new Scanner(System.in);
    
    System.out.println("Introduce tu calificacion: ");
    califa = cap.nextDouble();
    
    if (califa>=70){
     System.out.println("Felicidades, acreditaste!!!");   
    }else{
    System.out.println("AZOTES!!");
    }
    
}
    
}
