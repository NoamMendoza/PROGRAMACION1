package tema3_4;

import java.util.Scanner;

public class nombre {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a=1; String nombre;
		
		System.out.println("Ingrese su nombre: ");
		nombre=entrada.next();
		
		while(a<=100){
			System.out.println(a+" "+nombre);
			a++;
		}
	}

}
