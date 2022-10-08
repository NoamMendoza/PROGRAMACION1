package Competencia4;

import java.util.Scanner;

public class gimnasio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n[]=new String[10];
		int i;
		
		for(i=0; i<n.length;i++){
		System.out.println("Ingrese nombre del socio "+(i+1)+": ");
		n[i]=sc.next();
		}
		
		System.out.println("Los socios que no pagan inscripcion:");
		for(i=0;i<5;i++){
			System.out.println(n[i]);
		}

	}

}
