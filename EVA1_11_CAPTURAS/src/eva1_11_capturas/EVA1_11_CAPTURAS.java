/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_capturas;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class EVA1_11_CAPTURAS {
    public static void main(String[] args) {
        //CALCULO DE VELOCIDAD:
        //SOLICITAR DISTANCIA (M) Y TIEMPO (S)
        //CALCULAR LA VELOCIDAD (M/S)
        //DECLARAR VARIABLES Y SCANNER
        Scanner input = new Scanner(System.in);
        double distancia, velocidad, tiempo, velocidadkm;
        //SOLICITAR DATOS
        System.out.println("La distancia en metros: ");
        distancia = input.nextDouble();
        
        System.out.println("Introduce la distancia en segundos: ");
        tiempo = input.nextDouble();
        
       
        //REALIZAR CALCULOS
        velocidad = distancia / tiempo;
         System.out.println("Cual seria la velocidad: ");
           System.out.println(velocidad);
           //VELOCIDAD EN KM/H
           velocidadkm = velocidad * 3.6;
           System.out.println("La velocidad en km/h");
           System.out.println(velocidadkm);
           
     
    }
    
}
