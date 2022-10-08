/*Una frutería ofrece las manzanas con descuento segun lo siguiente:
 * 0 a 2 kilos tiene un descuento del 0%
 * 2.01 a 5 kilos 10%
 * 5.01 a 10 kilos 20%
 * Determinar cuanto pagara una persona
 */
package tema3_1;
import java.util.Scanner;
public class Manzanas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double kg, manzana, descuento, finale;
		
		System.out.println("Ingrese los kilos de manzanas a llevar: ");
		kg = entrada.nextDouble();
		System.out.println("A cuanto esta el kilo de manzana?: ");
		manzana = entrada.nextDouble();
		
		if(kg>=2.01 && kg<=5){
			manzana=kg*manzana;
			descuento=manzana*0.1;
			finale=manzana-descuento;
			System.out.println("La cantridad a pagar es de "+finale);
		
		}
		else{
			if(kg>=5.01 && kg<=10){
				manzana=kg*manzana;
				descuento=manzana*0.2;
				finale=manzana-descuento;
				System.out.println("La cantidad a pagar es de "+finale);
			}
		if(kg<2){
			System.out.println("La cantidada a pagar es de "+manzana);
		}
		}
	}

}
