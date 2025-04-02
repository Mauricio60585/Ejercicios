import java.util.Scanner;

public class ejercicio2{
  public static void main(String[] args){
    int tasa = 3895;
    Scanner scanner = new Scanner (System.in);
    System.out.println("Ingresa la cantidad de pesoso a convertir (sin puntos ni signos): ");
    int pesos = scanner.nextInt();
    float conversion = pesos / tasa;
    System.out.println("$"+pesos+" pesos equivale a: $"+conversion+" dolares");

    }
  }
