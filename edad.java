package Competencia4;
import java.util.Arrays;
import java.util.Scanner;
public class edad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[];
		int a;
		
		System.out.println("Ingrese la cantidad de personal: ");
		a = sc.nextInt();
		n= new int [a];
		
		
		for(int i=0;i<n.length;i++){
		System.out.println("Ingrese la edad de la persona "+(i+1));
		n[i]=sc.nextInt();
		if(n[i]>=100){
			System.out.println("No hay nadie con 100 años o mas");
			i--;
		}
		else if(n[i]<=17){
			System.out.println("No hay nadie con 17 años o menos");
			i--;
		}
		}
		Arrays.sort(n);
		
		System.out.println("La lista de edades ordenada es: ");
		
		for(int x=0;x<n.length;x++){
			System.out.println(n[x]+" ");
		}
		sc.close();
	}

}
