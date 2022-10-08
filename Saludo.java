package tema3_2;

import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String a;
		
		System.out.println("Ingrese Hola o Adios:");
		a = entrada.next();
		
		switch(a){
		case "Hola": case "HOLA": case "hola":
			System.out.println("Hola, ¿Cómo estas?");
			break;
		case "Adios": case "ADIOS": case "adios":
			System.out.println("Adios maistro, que te vaya bien");
			break;
		default:
			System.out.println("como te atreves a decir incoherencias");
		}
	}

}
