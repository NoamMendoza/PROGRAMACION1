
package tema3_1;
import java.util.Scanner;
public class Utilidad {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double salario, a�os, descuento, x;
		
		System.out.println("Ingrese los a�os de antiguedad: ");
		a�os = entrada.nextDouble();
		System.out.println("Ingrese el sueldo mensual: ");
		salario = entrada.nextDouble();
		
		if(a�os < 1){
			descuento = salario*0.05;
			x = salario+descuento;
			System.out.println("El reparto de utilidad es de: "+descuento+" y el salario total es de "+x);
		}
		else if(a�os>=1 && a�os<2){
			descuento = salario*0.07;
			x = salario+descuento;
			System.out.println("El reparto de utilidad es de: "+descuento+" y el salario total es de "+x);
		}
		else if(a�os>=2 && a�os<5){
			descuento = salario*0.1;
			x = salario+descuento;
			System.out.println("El reparto de utilidad es de: "+descuento+" y el salario total es de "+x);
		}
		else if(a�os>=5 && a�os<10){
			descuento = salario*0.15;
			x = salario+descuento;
			System.out.println("El reparto de utilidad es de: "+descuento+" y el salario total es de "+x);
		}
		else if(a�os>=10){
			descuento = salario*0.2;
			x = salario+descuento;
			System.out.println("El reparto de utilidad es de: "+descuento+" y el salario total es de "+x);
		}
	}

}
