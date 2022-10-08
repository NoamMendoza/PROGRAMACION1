package tema3_2;

import java.util.Scanner;

public class Cine {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a,b,c,d, total;
		
		System.out.println("Ingrese su opcion: \n1.Normal\n2.VIP\n3.Funcion 3D");
		a = entrada.nextInt();
		
		switch(a){
		case 1: 
			System.out.println("Elegiste la funcion normal.\nIngrese la cantidad de boletos de adulto: ");
			b = entrada.nextInt();
			System.out.println("Ingrese los boletos de niño a comprar: ");
			c = entrada.nextInt();
		
			b=b*50;
			d=c*40;
		
			total = b+d;
			System.out.println("El total es de $"+total);
			if(c>=3){
				System.out.println("Tiene palomitas gratis :)");
			}
			break;
		case 2: 
			System.out.println("Elegiste la funcion VIP. \nIngrese la cantidad de boletos de adulto: ");
			b = entrada.nextInt();
			System.out.println("Ingrese los boletos de niño a comprar: ");
			c = entrada.nextInt();
			
			b=b*150;
			d=c*100;
			
			total = b+d;
			System.out.println("El total es de $"+total);
			if(c>=3){
				System.out.println("Tiene palomitas gratis :)");
			}
			break;
		case 3: 
			System.out.println("Elegiste la funcion 3D. \nIngrese la cantidad de boletos de adulto: ");
			b = entrada.nextInt();
			System.out.println("Ingrese los boletos de niño a comprar: ");
			c = entrada.nextInt();
			
			b=b*120;
			d=c*90;
		
			total = b+d;
			System.out.println("El total es de $"+total);
			if(c>=3){
				System.out.println("Tiene palomitas gratis :)");
			}
			break;
			
		case 4:
		default: 
			System.out.println("Eliga algo bien y dejese de bromas");
		}
		entrada.close();
	}

}
