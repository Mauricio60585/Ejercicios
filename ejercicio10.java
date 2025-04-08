import java.util.Scanner;

public class ejercicio10{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el número de niveles para la pirámide: ");
    int n = scanner.nextInt();

    for (int i =1; i<=n; i++){
      for (int espacio = 1; espacio <= n -i; espacio++){
        System.out.print(" ");
        }
        
        for (int j=1; j <= i; j++){
          System.out.print(j);
          }

          for (int k= i - 1; k>=1; k--){
            System.out.print(k);
            }

            System.out.println();
      }
      scanner.close();

    }
  }
