import java.util.Scanner;

public class ejercicio11{
   public static void main(String[] args){
       char[] caracteres = new char[10];

       caracteres[0] = 'a';
       caracteres[1] = 'b';
       caracteres[2] = 'c';
       caracteres[3] = 'd';
       caracteres[4] = 'f';
       caracteres[5] = 'g';
       caracteres[6] = 'h';
       caracteres[7] = 'i';
       caracteres[8] = 'j';
       caracteres[9] = 'k';

       for(int i = 0; i < caracteres.length; i++){
           System.out.println("Posición "+i+": "+caracteres[i]);
           }
       } 
}
