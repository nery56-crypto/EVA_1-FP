
package eva1_22_acceso_tablas;

import java.util.Scanner;

public class EVA1_22_ACCESO_TABLAS {
    
final static String ACCESO_USU = "TESLA";
    final static String ACCESO_CONTRA = "4321";
    
    public static void main(String[] args) {
      String usuario, contra;
       Scanner robot = new Scanner(System.in);
       
       System.out.println("****CONTROL DE ACCESO****");
       System.out.println("Restaurante la cucaracha crocante");
       System.out.print("Usuario: ");
       usuario = robot.nextLine();
       System.out.print("Contraseña: ");
       contra = robot.nextLine();
       
       if(usuario.equals(ACCESO_USU) && contra.equals(ACCESO_CONTRA)){
           System.out.println("ACCESO CONCEDIDO!!!");
       }else{
           System.out.println("ACCESO DENEGADO!!!");
       }
       
    }
  
       
}
    
