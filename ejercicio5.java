import java.util.Scanner;

public class ejercicio5{
  public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);

    System.out.println("Ingresa el primer número entero: ");
    int numero1 = scanner.nextInt();


    System.out.println("Ingresa el segundo número entero: ");
    int numero2 = scanner.nextInt();


    System.out.println("Ingresa el tercer número entero: ");
    int numero3 = scanner.nextInt();

    System.out.println("Orden original: "+numero1+", "+numero2+", "+numero3);

    int menor, medio, mayor;

    if (numero1<=numero2 && numero1<= numero3){
      menor = numero1;
      if(numero2<=numero3){
	medio = numero2;
	mayor = numero3;
	}else{
	  medio = numero3;
	  mayor = numero2;
	  }
	  }else if(numero2 <= numero1 && numero2 <= numero3){
	    menor = numero2;
	    if(numero1 <= numero3){
	      medio = numero1;
	      mayor = numero3;
	      }else{
		medio = numero3;
		mayor = numero1;
		}
	    }
	    else{
	      menor = numero3;
	      if (numero1 <= numero2){
		medio = numero1;
		mayor = numero2;
		}
		else{
		  medio = numero2;
		  mayor = numero1;
		  }
	      }

      System.out.println("Orden ascendente: "+menor+", "+medio+","+mayor);
      }
  }
  
