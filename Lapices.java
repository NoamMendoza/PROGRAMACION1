/*Determinar cuanto se debe de pagar por equis cantidad de lapices considerando que si son 1000 o mas el costo es de
 * 85 centavos; de lo contrario, el precio es de 90 centavos
 */
package tema3_1;
import java.util.Scanner;
public class Lapices {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int lapiz;
		double total;
		
		System.out.println("Ingrese la cantidad de lapices a comprar:");
		lapiz = entrada.nextInt();
		
		if(lapiz>=1000){
			total = lapiz*0.85;
			System.out.println("El total a pagar es de "+total+" pesos");
		}
		else{
			total = lapiz*0.90;
			System.out.println("El total a pagar es de "+total+" pesos");
		}

	}

}
