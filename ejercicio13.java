import java.util.Scanner;

public class ejercicio13{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[8];

        for(int i=0; i < 8; i++){
            System.out.println("Ingrese el núemro "+(i+1)+" :");
            numeros[i] = scanner.nextInt();
            }
            for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                System.out.println("El numero "+numeros[i]+" es par" );
                }else{
                    System.out.println("El número "+numeros[i]+" es impar");
                    }
            }
            scanner.close();
        }
    }

