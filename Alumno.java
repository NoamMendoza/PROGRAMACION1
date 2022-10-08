package tema3_1;
import java.util.Scanner;
public class Alumno {

	public static void main(String[] args) {
		double m1,m2,m3,m4,m5,pf;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese las calificaciones finales de las 5 materias en una escala del 1 al 100: ");
		m1 = entrada.nextDouble();
		m2 = entrada.nextDouble();
		m3 = entrada.nextDouble();
		m4 = entrada.nextDouble();
		m5 = entrada.nextDouble();
		
		pf = (m1+m2+m3+m4+m5)/5;
		if(pf>=70 && pf<=79){
			System.out.println("Acreditaste muy apenas!!!!");
		}
		else if(pf>=80 && pf<=89){
			System.out.println("Tienes beca pronabes!!!");
		}
		else if(pf>=90 && pf<=100){
			System.out.println("Tienes mencion honorifica!!!");
		}
		else if(pf>=0 && pf<=69){
			System.out.println("Reprobaste!!!");
		}
	}

}
