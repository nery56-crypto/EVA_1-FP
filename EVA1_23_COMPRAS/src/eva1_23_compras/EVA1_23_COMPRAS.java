
package eva1_23_compras;

import java.util.Scanner;

public class EVA1_23_COMPRAS {
final static String ACCESO_CREDITO = "SI";
    final static String ACCESO_EFECTIVO = "SI";
    
    
    public static void main(String[] args) {
Scanner robot = new Scanner(System.in);
String credito, efectivo;

System.out.println("Tienes credito?");
credito = robot.nextLine();

System.out.println("Tienes efectivo?");
efectivo = robot.nextLine();

if(credito.equals(ACCESO_CREDITO) || efectivo.equals(ACCESO_EFECTIVO)){
   System.out.println("SI PUEDES COMPRAR!!");
}else{
    System.out.println("No puedes comprar!!!");
}
    
}
}
