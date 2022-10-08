//No acabado maistro////
package tema3_1;
import java.util.Scanner;
public class Cometa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double CP,MP,MO = 0,GF = 0,PV,DCP,clave;
		
		System.out.println("Ingrese la clave del articulo: ");
		clave = entrada.nextDouble();
		System.out.println("Ingrese el costo de la materia prima: ");
		MP = entrada.nextDouble();
		
		if(clave == 3 || clave == 4){
			MO=MP*0.75;
			MO=MP+MO;
		}
		else if(clave == 1 || clave == 5){
			MO=MP*0.80;
			MO=MP+MO;
		}
		else if(clave == 2 || clave == 6){
			MO=MP*85;
			MO=MP+MO;
		}
		
		
		if(clave == 2 || clave == 5){
			GF=MP*0.3;
			GF=MP+GF;
		}
		else if(clave == 3 || clave == 6){
			GF=MP*0.35;
			GF=MP+GF;
		}
		else if( clave == 1 || clave == 4){
			GF=MP*0.28;
			GF=MP+GF;
		}
		
		
		CP=MP+MO+GF;
		DCP=CP*0.45;
		PV=CP+DCP;
		
		System.out.println("El precio de venta es de: "+PV);
	}

}
