package tema3_4;

import java.util.Scanner;

public class tabla {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a,b,c=1,d;
		
		System.out.println("Ingrese un numero del 1 al 10: ");
		a=entrada.nextInt();
		System.out.println("Ingrese hasta donde quiere que llegue la tabla: ");
		b=entrada.nextInt();
		
		System.out.println(a);
		d=a+a;
		while(c!=b){
			System.out.println(d);
			d=a+d;
			c++;
		}
	}

}
