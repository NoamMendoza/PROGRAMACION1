package tema3_1;
import java.util.Scanner;
public class Langosta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double persona,costo;
		
		System.out.println("Ingrese la cantidad de personas: ");
		persona = entrada.nextDouble();
		
		if(persona<=200){
			costo = persona*95;
			System.out.println("El total a pagar es de "+costo);
		}
		else if(persona>300){
			costo = persona*75;
			System.out.println("El total a pagar es de "+costo);
		}
		else if(persona>200 && persona<=300){
			costo = persona*85;
			System.out.println("El total a pagar es de "+costo);
		}
	}

}
