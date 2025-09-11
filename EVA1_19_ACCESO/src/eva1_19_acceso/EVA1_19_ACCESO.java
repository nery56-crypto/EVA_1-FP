
package eva1_19_acceso;

import java.util.Scanner;

public class EVA1_19_ACCESO {
    //CONSTANTES
    final static String ACCESO_USU = "TESLA";
    final static String ACCESO_CONTRA = "4321";
    //final static double PI = 3.1416;
    
    public static void main(String[] args) {
       String usuario, contra;
       Scanner robot = new Scanner(System.in);
       
       System.out.println("****CONTROL DE ACCESO****");
       System.out.println("Restaurante la cucaracha crocante");
       System.out.print("Usuario: ");
       usuario = robot.nextLine();
       System.out.print("Contraseña: ");
       contra = robot.nextLine();
       if(usuario.equals(ACCESO_USU)){
           if(contra.equals(ACCESO_CONTRA)){
               System.out.println("ACCESO CONCEDIDO!!");
           }else{
               System.out.println("ACCESO DENEGADO!!!");
           }  
       }else{
           System.out.println("INCORRECTO");
       }
    }
    
}
