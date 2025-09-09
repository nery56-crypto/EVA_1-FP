
package eva1___16__numero__mayor;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class EVA1___16__NUMERO__MAYOR {

    public static void main(String[] args) {
        // TODO code application logic here
    Scanner captu = new Scanner(System.in);
    int n1, n2;
    System.out.print("Ingresa el primer numero: ");
    n1 = captu.nextInt();
    
    System.out.print("Ingresa el segundo numero: ");
    n2 = captu.nextInt();
    
    if (n1 > n2){
     System.out.println("El primer numero es mayor que el segundo ");
    }else if (n2 > n1){
        System.out.println("El segundo numero es mayor que el primero");        
        }else{
        System.out.println("Ambos numeros son iguales");
    }
    
    }
    
}
