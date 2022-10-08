package Competencia4;

import java.util.Scanner;

public class buscar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0, contador=0;
		int n[]= new int [10];
	
		System.out.println("Ingrese 10 numeros:");
		for(int i=0;i<10;i++){
			System.out.println("Ingrese el numero "+(i+1)+":");
			n[i]=sc.nextInt();
			
		}
		
		System.out.println("Ingrese el numero a buscar: ");
		a=sc.nextInt();
		
		
		for(int x=0;x<10;x++){
			if(n[x]==a){
				System.out.println("El numero se encuentra en el vector y la posicion es la "+(x+1));
			}
			else{
				contador++;
			}
			}
		if(contador==10){
			System.out.println("El numero no se encuentra en el vector");
		}
			
		sc.close();
		}
		
	}


