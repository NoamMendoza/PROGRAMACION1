package Competencia4_2;

import java.util.Scanner;

public class matriz5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[][]= new int[3][3];int y[][]=new int[3][3]; int z[][]=new int[3][3];
		
		System.out.println("Primera matriz: ");
		for(int i=0;i<3;i++){
			for(int ii=0;ii<3;ii++){
				System.out.println("Ingrese la coordenada ["+i+"]["+ii+"]: ");
				x[i][ii]=sc.nextInt();
			}
		}
		
		System.out.println("Segunda matriz: ");
		for(int i=0;i<3;i++){
			for(int ii=0;ii<3;ii++){
				System.out.println("Ingrese la coordenada ["+i+"]["+ii+"]: ");
				y[i][ii]=sc.nextInt();
				
				z[i][ii]=x[i][ii]+y[i][ii];
			}
		}
		
		System.out.println("La primera matriz es: ");
		for(int i=0;i<3;i++){
			for(int ii=0;ii<3;ii++){
				System.out.print("["+x[i][ii]+"]");
			}
			System.out.println("");
		}
		System.out.println("La segunda matriz es: ");
		for(int i=0;i<3;i++){
			for(int ii=0;ii<3;ii++){
				System.out.print("["+y[i][ii]+"]");
			}
			System.out.println("");
		}
		System.out.println("La matriz suma es: ");
		for(int i=0;i<3;i++){
			for(int ii=0;ii<3;ii++){
				System.out.print("["+z[i][ii]+"]");
			}
			System.out.println("");
		}
		
	}

}
