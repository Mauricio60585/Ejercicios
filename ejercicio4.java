import java.util.Scanner;

public class ejercicio4{
  public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    System.out.println("Ingesa un número del 1 al 7: ");
    int numeroDia = scanner.nextInt();
    String nombreDia;

    if (numeroDia == 1){
	nombreDia = "El día correspondiente al número ingresado es:  Lunes";
      }else if (numeroDia == 2){
	nombreDia = "El día correspondiente al número ingresado es:  Martes";
	}else if (numeroDia == 3){
	  nombreDia = "El día correspondiente al número ingresado es:  Miercoles";
	  }else if (numeroDia == 4){
	    nombreDia = "El día correspondiente al número ingresado es:  Jueves";
	    }else if (numeroDia == 5){
	      nombreDia = "El día correspondiente al número ingresado es:  Viernes";
	      }else if (numeroDia == 6){
		nombreDia = " El día correspondiente al número ingresado es: Sabado";
		}else if (numeroDia == 7){
		  nombreDia = "El día correspondiente al número ingresado es: Domingo";
		  }else{ nombreDia = "Número ingresado no valido";}

      System.out.println(nombreDia);
    }
  }
