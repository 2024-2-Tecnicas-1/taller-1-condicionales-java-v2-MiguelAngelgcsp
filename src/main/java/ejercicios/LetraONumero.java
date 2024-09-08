
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class LetraONumero {
    public static String evaluar(char caracter) {
        
      int codigoAscii = (int) caracter;
        
        
        if (codigoAscii >= '0' && codigoAscii <= '9') {
            return "Es número";
        }
        
        
        if (codigoAscii >= 'A' && codigoAscii <= 'Z') {
            return "Es letra mayúscula";
        }
        
       
        if (codigoAscii >= 'a' && codigoAscii <= 'z') {
            return "Es letra minúscula";
        }
        
        
        return "No es letra ni número";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Caracter:");
        char caracter = lector.next().charAt(0);
        
        String respuesta = evaluar(caracter);
        System.out.println(respuesta);
    }
}
