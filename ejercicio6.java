import java.util.Scanner;

public class ejercicio6{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese un número de 5 digitos: ");
    String numero = scanner.next();

    System.out.println("El primer digito ingresado es: "+numero.charAt(0));
  }
}
