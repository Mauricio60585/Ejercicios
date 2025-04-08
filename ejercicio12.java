import java.util.Scanner;

public class ejercicio12{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Ingrese el numero "+(i+1)+ ": ");
            numeros[i] = scanner.nextInt();
        }
            System.out.println("Los números ingresados son: \n"+
            numeros[0]+"\n"+numeros[1]+"\n"+numeros[2]+"\n"+numeros[3]+"\n"+numeros[4]+"\n"+numeros[5]+"\n"+numeros[6]+"\n"+numeros[7]+"\n"+numeros[8]+"\n"+numeros[9]);
            System.out.println("Y su inverso es: \n"+numeros[9]+"\n"+numeros[8]+"\n"+numeros[7]+"\n"+numeros[6]+"\n"+numeros[5]+"\n"+numeros[4]+"\n"+numeros[3]+"\n"+numeros[2]+"\n"+numeros[1]+"\n"+numeros[0]);
        
        }
    }
