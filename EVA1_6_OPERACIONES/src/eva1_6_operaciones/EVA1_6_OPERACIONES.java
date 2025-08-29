/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_operaciones;

/**
 *
 * @author ASUS
 */
public class EVA1_6_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //AREA DE UN CIRCULO
        //DECLARACION DE VARIABLES
        double area;
        double radio;
        double pi;
        //incialiacion
        pi = 3.1416;
        radio = 5;
        area = pi * radio * radio;
        //IMPRIMIR:
        System.out.println("El valor de un circulo de radio 5 es:");
        System.out.println(area);
        //NUEVO CIRCULO RADIO 100
        radio = 100;
        area = pi * radio * radio;
        System.out.println("El radio de un circulo de radio 100 es:");
        System.out.println(area);
        
    }
    
}
