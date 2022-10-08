package Competencia4;

import java.util.Scanner;

public class vectores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[],z[],y[];
		int a;
		
		System.out.println("Ingrese el largo de los vectores");
		a=sc.nextInt();
		n=new int [a]; z=new int [a]; y=new int [a];
		
		System.out.println("Primer vector:");
		for(int i=0;i<n.length;i++){
			System.out.println("Ingrese el numero del lugar "+(i+1)+": ");
			n[i]=sc.nextInt();
		}
		System.out.println("Segundo Vector: ");
		for(int x=0;x<z.length;x++){
			System.out.println("Ingrese el numero del lugar "+(x+1)+": ");
			z[x]=sc.nextInt();
		}
		System.out.println("La vector de suma es: ");
		for(int r=0;r<y.length;r++){
			y[r]=(n[r]+z[r]);
		}
		for(int r=0;r<y.length;r++){
			System.out.println(y[r]);
		}
		
	}

}
