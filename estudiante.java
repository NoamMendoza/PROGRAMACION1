package Competencia4;

import java.util.Scanner;

public class estudiante {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n[]=new String [5]; int z[]=new int [5];
		String nombre;
		
		for(int i=0;i<5;i++){
		System.out.println("Ingrese el nombre del estudiante "+(i+1)+": ");
		n[i]=sc.next();
		System.out.println("Ingrese la calificacion de "+n[i]+": ");
		z[i]=sc.nextInt();
		}
		
		System.out.println("Ingrese el estudiante que desea encontrar: ");
		nombre=sc.next();
		for(int a=0;a<5;a++){
			if(nombre.equalsIgnoreCase(n[a])){
				System.out.println("La calificacion de "+n[a]+" es "+z[a]);
			}
		}
	}

}
