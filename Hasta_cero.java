package tema3_4;

import java.util.Scanner;

public class Hasta_cero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double a=1, suma=0; int con=0;
		
		
		
		while(a!=0){
			System.out.println("Ingrese un numero: ");
			a=entrada.nextDouble();
			suma=suma+a;
			con++;
		}
		System.out.println("nOOoOOOooooOOOO ingresaste un 0, me veré obligado a morir");
		System.out.println("La suma de los numeros fue: "+suma);
		System.out.println("Los numeros totales ingresados fueron: "+con);
	}

}
