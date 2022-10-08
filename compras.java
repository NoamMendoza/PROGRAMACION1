package tema3_4;

import java.util.Scanner;

public class compras {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a=0,b,z=0,y=0; char c='s',x='s';
		
		
		while(c==x){
			System.out.println("Ingrese el precio del articulo: ");
			b=entrada.nextInt();
			
			a=a+b;
			
			y++;
			
			System.out.println("¿Desea realizar otra compra?(s/n)");
			c=entrada.next().charAt(0);
			
			
		}
		System.out.println("El total de la compra es de: "+a);
		System.out.println("El numero de articulos es de: "+y);
	}

}
