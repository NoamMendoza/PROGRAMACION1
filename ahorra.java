package tema3_3;
import java.util.Scanner;
public class ahorra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double deposito, ahorro = 0;
		
		for(int i=1;i<=12;i++){
			System.out.println("Deposite la cantidad de este mes: ");
			deposito =sc.nextDouble();
			
			ahorro = ahorro+deposito;
			System.out.println("Hasta el momento lleva ahorrado: "+ahorro+" $");
		}
		System.out.println("El ahorro al final del mes es de: "+ahorro);
		sc.close();
	}

}
