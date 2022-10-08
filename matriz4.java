package Competencia4_2;

import java.util.Scanner;

public class matriz4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[][];
		int a,b;
		
		System.out.println("Ingrese los parametros de la matriz (El anocho y el alto deben de ser iguales):");
		System.out.println("Ingrese el alto: ");
		a=sc.nextInt();
		System.out.println("Ingrese el ancho: ");
		b=sc.nextInt();
		
		x= new int [a][b];
		
		if(a==b){
		for(int i=0;i<a;i++){
			for(int ii=0;ii<b;ii++){
				if(i==ii){
					x[i][ii]=1;
				}
				else{
					x[i][ii]=0;
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
		
		}
		else{
			System.out.println("No es una matriz cuadrada");
		}
	}

}
