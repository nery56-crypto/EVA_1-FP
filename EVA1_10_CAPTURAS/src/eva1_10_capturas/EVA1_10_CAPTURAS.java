/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_capturas;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class EVA1_10_CAPTURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SOLICITAR LA TEMPERATURA EN FARENHEIT
        Scanner input = new Scanner(System.in);
        double far, cent;
        //CAPTURA:
        System.out.println("Temperatura en grados Farenheit:");
        far = input.nextDouble();
        //DARLE LA TEMPERATURA EN GRADOS CENTIGRADOS
        cent = 5*(far - 32) /9;
        System.out.println("La temperatura es");
        System.out.println(cent);
        
        
    }
    
}
