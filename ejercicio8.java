import java.util.Scanner;

public class ejercicio8{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    double suma = 0;
    int contador = 0;
    double numero = 0;

    System.out.println("Ingresa los números positivos que desees (para finalizar ingresa un número negativo)");

    while(true){
      numero = scanner.nextDouble();

      if (numero < 0){
	break;
	}
	suma += numero;
	contador++;
      }
      if(contador > 0){
	double promedio = suma / contador;
	System.out.println("El promedio de los número ingresados es: "+promedio);
	}else{
	  System.out.println("No se ingresaron números positivos");
	  }
	  scanner.close();
    }
  }
