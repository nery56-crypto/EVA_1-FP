/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_triangulo;

/**
 *
 * @author ASUS
 */
public class EVA1_7_TRIANGULO {
    public static void main(String[] args) {
    //AREA DE UN TRIANGULO
    //AREA = (BASE X ALTURA) ENTRE 2;
    double area, base, altura;//TRES VARIABLES DEL TIPO DOUBLE
    //INICIALIZACION
    base = 10;
    altura = 8;
    //SE APLICA PRECEDENCIA DE OPERACIONES
    area = (base * altura) / 2.0;//CUIDADO CON DIVIDIR ENTRE ENTEROS
    System.out.println("El area del triangulo base 10 y altura 8:");
    System.out.println(area);
    }
    
}
