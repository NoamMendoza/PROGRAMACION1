
package tema3_1;
import java.util.Scanner;
public class Utilidad {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double salario, años, descuento, x;
		
		System.out.println("Ingrese los años de antiguedad: ");
		años = entrada.nextDouble();
		System.out.println("Ingrese el sueldo mensual: ");
		salario = entrada.nextDouble();
		
		if(años < 1){
			descuento = salario*0.05;
			x = salario+descuento;
			System.out.println("El reparto de utilidad es de: "+descuento+" y el salario total es de "+x);
		}
		else if(años>=1 && años<2){
			descuento = salario*0.07;
			x = salario+descuento;
			System.out.println("El reparto de utilidad es de: "+descuento+" y el salario total es de "+x);
		}
		else if(años>=2 && años<5){
			descuento = salario*0.1;
			x = salario+descuento;
			System.out.println("El reparto de utilidad es de: "+descuento+" y el salario total es de "+x);
		}
		else if(años>=5 && años<10){
			descuento = salario*0.15;
			x = salario+descuento;
			System.out.println("El reparto de utilidad es de: "+descuento+" y el salario total es de "+x);
		}
		else if(años>=10){
			descuento = salario*0.2;
			x = salario+descuento;
			System.out.println("El reparto de utilidad es de: "+descuento+" y el salario total es de "+x);
		}
	}

}
