package Competencia4_2;

import java.util.Scanner;

public class matriz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[][]=new int [2][2],y=0;
		
		for(int i=0;i<2;i++){
			for(int ii=0;ii<2;ii++){
				System.out.println("Ingrese la coordenada ["+i+"]["+ii+"]: ");
				x[i][ii]=sc.nextInt();
			}
		}
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x.length;j++){
			System.out.print("["+x[i][j]+"]");
			}
			System.out.println("");
			y=x[0][0]+x[0][1]+x[1][0]+x[1][1];
			
		}
		System.out.println("La suma de los elementos de la matris es: "+y);
	}

}
