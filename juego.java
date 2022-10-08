package tema3_5;

import java.util.Scanner;

public class juego {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a,x;
		a = (int) (Math.random()*100);
		
		
		System.out.println(a);
		
		do{
			System.out.println("Ingrese un numero para comparar: ");
			x=entrada.nextInt();
			if(x<a){
				System.out.println("El numero que ingresaste es MENOR al que tienes que adivinar");
			}
			else if(x>a){
				System.out.println("El numero que ingresaste es MAYOR al que tienes que adivinar");
			}
			else if(a==x){
				System.out.println("Has adivinado, que crack");
			}
		}
		while(a!=x);
		
	entrada.close();	
	}
	

}
