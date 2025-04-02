import java.util.Scanner;

public class ejercicio3{
  public static void main(String[] args){
    double iva = .19;
    Scanner scanner = new Scanner (System.in);
    System.out.println("Ingresa el valor del producto: ");
    int precio = scanner.nextInt();

    double valorIva = precio * iva;
    System.out.println("El valor del iva es de: $"+valorIva);

    double precioIva = precio + valorIva;
    System.out.println("El valor del producto con el iva es de: $"+precioIva);
    }
  }
