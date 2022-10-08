//creo que se le olvido un dato//
package tema3_1;
import java.util.Scanner;
public class Viaje {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int alumnos;
		double costo;
		
		System.out.println("Cuantos alumnos asistiran al viaje: ");
		alumnos = entrada.nextInt();
		
		if(alumnos >= 100){
			costo = (alumnos*65)+4000;
			System.out.println("El costo total es de "+costo);
			System.out.println("El costo por alumno es de 65");
		}
		else if(alumnos >= 50 && alumnos <= 99){
			costo = (alumnos*70)+4000;
			System.out.println("El costo total es de "+costo);
			System.out.println("El costo por alumno es de 70");
		}
		else if(alumnos>=30 && alumnos <=49){
			costo = (alumnos*95)+4000;
			System.out.println("El costo total es de "+costo);
			System.out.println("El costo por alumno es de probablemente 95");
		}
		else if(alumnos<30){
			costo = 4000/alumnos;
			System.out.println("El costo total es de "+4000);
			System.out.println("El costo por alumno es de "+costo);
		}
	}

}
