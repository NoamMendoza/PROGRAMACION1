package Competencia4_2;

import java.util.Scanner;

public class matriz6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[][];
		int a,b,c,contador=0;
		
		System.out.println("Ingrese el alto: ");
		a=sc.nextInt();
		System.out.println("Ingrese el ancho: ");
		b=sc.nextInt();
		
		x= new int [a][b];
		
		for(int i=0;i<a;i++){
			for(int ii=0;ii<b;ii++){
				System.out.println("Ingrese la coordenada ["+i+"]["+ii+"]: ");
				x[i][ii]=sc.nextInt();
			}
		}
		
		System.out.println("Ingrese el numero que desea buscar: ");
		c=sc.nextInt();
		
		for(int i=0;i<a;i++){
			for(int ii=0;ii<b;ii++){
				if(c==x[i][ii]){
					System.out.println("El numero se encuentra en la coordenada: ["+i+"]["+ii+"]");
				}
					else{
						contador++;
					}
					
				}
			}
		if(contador==a*b){
			System.out.println("El numero no se encuentra en la matriz");
		}
		
				
	}

}
