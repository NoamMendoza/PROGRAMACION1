package tema3_1;
import java.util.Scanner;
public class Mayor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edad;
		
		System.out.println("¿Cuantos años tienes?");
		edad = entrada.nextInt();
		
		if(edad>=18&&edad<30){
			System.out.println("Ya puedes votar jaja");
		}
		else if (edad>=30){
			System.out.println("Ya testas viejo jaja");
		}
		else{
			System.out.println("Estas chiquito");	
			}
		}
	}

