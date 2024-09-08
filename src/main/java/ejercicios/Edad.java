
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
      String respuesta=null; 
      // TODO: Coloca aquí el código del ejercicio 6: Edad
      int diaf1; int mesf1; int annof1;int añost;
LocalDate currentDate = LocalDate.now();
int dia2 = currentDate.getDayOfMonth();
int mes2 = currentDate.getMonthValue();
int anno2 = currentDate.getYear();
    


    int annof = anno2 - anno;
    if (dia2>=dia && mes2==mes)
    {
        annof1=annof + 1;
        respuesta = "Usted tiene "+annof1+" años";    
    }

    if( mes2<mes)
    {
        annof1=annof - 1;
        respuesta = "Usted tiene "+annof1+" años";
    }
    else
    {
        
        respuesta = "Usted tiene "+annof+" años";
    }

  
    

        return respuesta;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
