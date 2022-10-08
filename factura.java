package Competencia4;

import java.util.Scanner;

public class factura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x[]={"Producto", "Unidades", "Precio/Unidad", "Total"};
		String producto[]= new String [3];
		int unidades[]= new int [3];
		double total[]=new double[1]; double precioU[]=new double[3]; double totale[]=new double [3];
		
		System.out.println("Ingrese los datos que se le piden: ");
		for(int i=0;i<x.length;i++){
			System.out.print(x[i]+" - ");
		}
		
		System.out.println("\n--------------------------------------------------------");
		
		
			for(int t=0;t<3;t++){
				System.out.println("Producto "+(t+1)+": ");
				producto[t]=sc.next();
			}
			for(int t=0;t<3;t++){
				System.out.println("Unidades "+(t+1)+": ");
				unidades[t]=sc.nextInt();
			}
			for(int t=0;t<3;t++){
				System.out.println("Precio/Unidad "+(t+1)+": ");
				precioU[t]=sc.nextDouble();
			}
			for(int t=0;t<3;t++){
				totale[t]=unidades[t]*precioU[t];
			}
			
			System.out.println("--------------------------------------------------------");
			for(int i=0;i<x.length;i++){
				System.out.print(x[i]+" - ");
			}
			System.out.println("\n---------------------------------------------");
			for(int i=0;i<producto.length;i++){
				System.out.print(producto[i]+" - "+unidades[i]+" - "+precioU[i]+" - "+totale[i]+" \n");
			}
			System.out.println("\n---------------------------------------------");
			total[0]=totale[0]+totale[1]+totale[2];
			System.out.println("Total: "+total[0]);
		}
		
	}

