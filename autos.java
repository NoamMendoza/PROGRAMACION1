package tema3_3;

import java.util.Scanner;

public class autos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int autos=0, color, amarillo=0,rosa=0,roja=0,verde=0,azul=0;
		
		System.out.println("Ingrese el numero de autos que entraron: ");
		autos=sc.nextInt();
		
		for(int i=1;i<=autos;i++){
			System.out.println("Ingrese el ultimo numero de la placa: ");
			color = sc.nextInt();
			
			if(color == 1 || color == 2){
				amarillo++;
			}
			else if(color == 3 || color == 4){
				rosa++;
			}
			else if(color == 5 || color == 6){
				roja++;
			}
			else if(color == 7 || color == 8){
				verde++;
			}
			else if(color == 9 || color == 0){
				azul++;
			}
		}
		System.out.println("La cantidad de autos"
				+ " con calcomania de cada color es la siguiente:"
				+ " \nAmarillo: "+amarillo+"\nRosa: "+rosa+"\nRojo: "+roja+"\nVerde: "+verde+"\nAzul: "+azul);
		sc.close();
	}

}
