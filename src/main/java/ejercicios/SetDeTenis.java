package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB)
    {
    int diferencia1 = numVictoriasA-numVictoriasB;
    int diferencia2=numVictoriasB-numVictoriasA;
    
    
            if (diferencia1>2 && numVictoriasA>6 ||diferencia1>2 && numVictoriasB>6 || diferencia2>2 && numVictoriasA>6 ||diferencia2>2 && numVictoriasB>6 ||numVictoriasA>7 || numVictoriasB>7 )
        {
            return "Inválido";
        }
        if (numVictoriasA >= 6 && numVictoriasA > numVictoriasB +1   ||numVictoriasA==7&&numVictoriasB==6  )
        {
            return "Ganó A";
        }
        if (numVictoriasB >= 6 && numVictoriasB > numVictoriasA +1 ||numVictoriasA==6&&numVictoriasB==7  )
        {
            return "Ganó B";
        }
        
  
        else 
        {
           return "Aún no termina";
        }
    }         
              
    public static void main(String[] args) 
    {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganados por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganados por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
