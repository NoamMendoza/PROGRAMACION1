package Competencia4_2;

import java.util.Scanner;

public class matriz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[][]=new int [2][3]; int y[][]=new int [2][3];
		int a;
		
		for(int i=0;i<2;i++){
			for(int ii=0;ii<3;ii++){
				System.out.println("Ingrese la coordenada ["+i+"]["+ii+"]: ");
				x[i][ii]=sc.nextInt();
			}
		}
		System.out.println("Ingrese el numero multiplicador: ");
		a=sc.nextInt();
		
		System.out.println("La matriz normal es: ");
		for(int i=0;i<2;i++){
			for(int ii=0;ii<3;ii++){
				System.out.print("["+x[i][ii]+"]");
				y[i][ii]=x[i][ii]*a;
			}
			System.out.println("");
		}
		
		System.out.println("La matriz multiplicado por "+a+" es: ");
		for(int i=0;i<2;i++){
			for(int ii=0;ii<3;ii++){
				System.out.print("["+y[i][ii]+"]");
			}
			System.out.println("");
		}
	}

}
