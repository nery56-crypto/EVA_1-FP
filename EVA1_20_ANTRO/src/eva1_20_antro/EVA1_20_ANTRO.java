
package eva1_20_antro;

import java.util.Scanner;

public class EVA1_20_ANTRO {
final static String ACCESO_EDAD = "18";
final static String ACCESO_INE = "SI";
    
    public static void main(String[] args) {
     String edad, ine;
     Scanner robot = new Scanner(System.in);
     
     System.out.println("***CONTROL DE ACCESO***");
     System.out.println("ANTRO BOOMBAY");
     
     System.out.print("TU EDAD? ");
     edad = robot.nextLine();
     
     System.out.println("TIENES INE");
     ine = robot.nextLine();
     
     if(edad.equals(ACCESO_EDAD)){
         if(ine.equals(ACCESO_INE)){
             System.out.println("PUEDES ENTRAR");
         }else {
             System.out.println("NO PUEDES ENTRAR");
         }
     }else{
         System.out.println("ACCESO DENEGADO");
                 }
     }
     
     
    
     
     
    }
    

