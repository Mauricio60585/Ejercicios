import java.util.Scanner;

public class ejercicio9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;

        int[] numeros = new int[10];
        for(int i=0; i < numeros.length; i++){
            System.out.println("Ingresa el número "+(i+1));
             numeros[i] = scanner.nextInt();

            if(numeros[i] > 0){
                positivos++;
                }else if(numeros[i] < 0){
                    negativos++;
                    }
            }
            System.out.println("Cantidad de números positivos: "+positivos);
            System.out.println("Cantidad de números negatios: "+negativos);
        }
    }
