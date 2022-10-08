package Competencia4;

import java.util.Scanner;

public class Orden {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[],z[]; int a,t = 0;
		
		System.out.println("Ingrese el tamaño del vector: ");
		a = sc.nextInt();
		n=new int [a];
		z=new int [n.length];
		
		for(int i=0;i<n.length;i++){
			System.out.println("Ingrese el numero de el espacio "+(i+1));
			n[i]=sc.nextInt();
		}
		
		System.out.println("La matriz normal es:");
		for(int x=0; x<n.length;x++){
			System.out.print(n[x]+" ");
		}
		System.out.println(" ");
		
		System.out.println("La matriz inversa es:");
		for(int c=n.length-1;c>=0;c--){
			z[t]=n[c];
			t++;
		}
		for(int d=0;d<z.length;d++){
		System.out.print(z[d]+" ");
		}
		sc.close();
	}

}
