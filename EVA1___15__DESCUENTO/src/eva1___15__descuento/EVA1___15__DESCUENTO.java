
package eva1___15__descuento;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class EVA1___15__DESCUENTO {

    public static void main(String[] args) {
        // TODO code application logic here
    double venta, pagar;
    Scanner captu = new Scanner(System.in);
    
    System.out.println("Monto de la venta: ");
    venta = captu.nextDouble();
    
    if(venta > 1000){
        pagar = venta * 0.85;
        System.out.print("El monto a pagar es: ");
        System.out.println(pagar);
    }
    }
    
}
