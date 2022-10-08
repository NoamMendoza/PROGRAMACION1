//Guardar en un vector 20 numeros. contar cuantos son positivos, negativos y cero
package Competencia4;
import java.util.Scanner;
public class numeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[]=new int [10];
		int a=0, b=0, c=0;
		
		for(int i=0;i<n.length;i++){
			System.out.println("Ingrese el numero de la casilla "+(i+1)+":");
			n[i]= sc.nextInt();
			
			if(n[i]==0){
				a++;
			}
			if(n[i]<0){
				b++;
			}
			if(n[i]>0){
				c++;
			}
		}
		System.out.println("Hay "+a+" ceros en el vector");
		System.out.println("Hay "+b+" negativos en el vector");
		System.out.println("Hay "+c+" positivos en el vector");
		
		
	}

}
