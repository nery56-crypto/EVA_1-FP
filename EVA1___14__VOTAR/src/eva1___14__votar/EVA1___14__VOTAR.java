
package eva1___14__votar;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class EVA1___14__VOTAR {

    public static void main(String[] args) {
        // TODO code application logic here
     int annio_nac;
     int edad;
     Scanner captu = new Scanner(System.in);
     System.out.println("Captura tu año de nacimiento: ");
     annio_nac = captu.nextInt();
     edad = 2025 - annio_nac;
     if(edad >= 18){
         System.out.println("PUEDES VOTAR!!!");
     }else{
         System.out.println("NO PUEDES VOTAR, MENOR DE EDAD!!");
     }
     
    }
    
}
