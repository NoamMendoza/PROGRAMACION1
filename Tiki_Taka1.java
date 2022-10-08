package tema3_3;

import java.util.Scanner;

public class Tiki_Taka1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e=0, empleados, ventas1=0,a=0,b=0,c=0; 
		double monto=0, aa=0, bb=0, cc=0, global=0;
		
		System.out.println("Ingrese la cantidad de empleados: ");
		empleados=sc.nextInt();
		
		for(int z=1;z<=empleados;z++){
			System.out.println("Ingrese la cantidad de ventas por el empleado "+z+":");
			ventas1=sc.nextInt();
			
			e=e+ventas1;
		}
		
		for(int i=1;i<=e;i++){
			System.out.println("Ingrese el monto de la venta "+i+":");
			monto=sc.nextDouble();
			
			if(monto>1000){
				a++;
				aa=aa+monto;
			}
			if(monto>500 && monto<=1000){
				b++;
				bb=bb+monto;
			}
			if(monto<=500){
				c++;
				cc=cc+monto;
			}
			global= global+monto;
		}
		
		System.out.println("El monto de las ventas fueron las siguientes: "
				+ "\nMayor a 1000: "+a+" Total: "+aa+
				"\nMayor a 500 pero menores o iguales a 1000: "+b+" Total: "+bb+
				"\nMenores o iguales a 500: "+c+" Total: "+cc+
				"\nGlobal: "+global);
		sc.close();
		
	}

}
