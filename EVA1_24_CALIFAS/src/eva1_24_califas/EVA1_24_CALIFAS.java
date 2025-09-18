
package eva1_24_califas;

import java.util.Scanner;

public class EVA1_24_CALIFAS {

    public static void main(String[] args) {
        // TODO code application logic here
     int califa;
 
 Scanner robot= new Scanner(System.in);
 System.out.println("Introduce tu calificacion: ");
 califa = robot.nextInt();
 
 if((califa >=90) && (califa <=100)) {
     System.out.println("A");
 }else if ((califa >=80) && (califa <=89)) {
      System.out.println("B");
 }else if ((califa >= 70) && (califa <= 79)) {
      System.out.println("C");
 }else if ((califa >= 60) && (califa <= 69)) {
      System.out.println("D");
 }else if ((califa >= 0) && (califa <= 59)) {
      System.out.println("F");
 }
 

 
 
 
 
 
    }
    
}


