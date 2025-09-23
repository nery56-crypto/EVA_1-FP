
package eva1_28_moneda;

import java.util.Scanner;

public class EVA1_28_MONEDA {

    public static void main(String[] args) {
     Scanner robot = new Scanner(System.in);
     int usuario;
     System.out.println("ELIGE AGUILA O SELLO (1/0)");
     usuario = robot.nextInt();
     //COMO LANZAMOS UNA MONEDA?
     int moneda;
     if(Math.random() < 0.5){
         moneda = 1;
         System.out.println("Aguila");
     }else{
        moneda = 0;
        System.out.println("SELLO");
     }
         
    }
    
}
