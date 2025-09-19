
package eva1_25_bisiesto;

import java.util.Scanner;

public class EVA1_25_BISIESTO {

    public static void main(String[] args) {
        // TODO code application logic here
      int yr, resi4, resi100, resi400;
      Scanner robot = new Scanner(System.in);
      System.out.println("Capture el año");
      yr = robot.nextInt();
      resi4 = yr % 4;
      resi100 = yr % 100;
      resi400 = yr % 400;
      //CONDICIONES PARA QUE SEA BISIESTO
      //DIVISIBLE ENTRE 4
      if(resi4 == 0){
       if(resi100 == 0){
           if(resi400 ==0){
               System.out.print("El año " + yr + "ES BISIESTO");
           }else{
               System.out.print("El año" + yr + " NO ES BISIESTO");
           }
      }else{
           System.out.print("El año" + yr + " ES BISIESTO ");
       }
      }else{
          System.out.print("El año " + yr + "NO ES BISIESTO");
      //EXCEPTO SI ES DIVISIBLE ENTRE 400 (BISIESTO)
      
      
      
    }
    
    }
    }
