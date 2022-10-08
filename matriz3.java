package Competencia4_2;

import java.util.Scanner;

public class matriz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[][];
		int a,b,c=0,d=0,e=0;
		System.out.println("Ingrese el alto: ");
		a=sc.nextInt();
		System.out.println("Ingrese el ancho: ");
		b=sc.nextInt();
		
		x=new int [a][b];
		
		for(int i=0;i<a;i++){
			for(int ii=0;ii<b;ii++){
				System.out.println("Ingrese la coordenada ["+i+"]["+ii+"]: ");
				x[i][ii]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a;i++){
			for(int ii=0;ii<b;ii++){
				if(x[i][ii]==0){
					c++;
				}
				else if(x[i][ii]<0){
					d++;
				}
				else if(x[i][ii]>0){
					e++;
				}
			}
		}
		
		System.out.println("La matriz es: ");
		for(int i=0;i<a;i++){
			for(int ii=0;ii<b;ii++){
				System.out.print("["+x[i][ii]+"]");
			}
			System.out.println("");
		}
		
		System.out.println("Numeros iguales a 0: "+c);
		System.out.println("Numeros menores a 0: "+d);
		System.out.println("Numeros mayores a 0: "+e);
	}

}
