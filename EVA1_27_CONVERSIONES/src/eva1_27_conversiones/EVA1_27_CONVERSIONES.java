
package eva1_27_conversiones;

public class EVA1_27_CONVERSIONES {

    public static void main(String[] args) {
        // TODO code application logic here
        int temp;
        double tempDec = 25.7;
        temp = (int)tempDec;//casting
        System.out.println(temp);
        
        double tempDec2;
        tempDec2 = temp;
        System.out.println(tempDec2);
        
        
        String cade, mensaje;
        cade = "La temperatura es ";
        mensaje = cade + temp;//concatenacion
        System.out.println(mensaje);
        
        
    }
    
}
