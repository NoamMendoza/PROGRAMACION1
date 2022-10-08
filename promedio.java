package tema3_3;
import java.util.Scanner;
public class promedio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int na = 1; double ca = 0, a=0;
		
		System.out.println("Ingrese el numero de estudiantes: ");
		na = sc.nextInt();
		
		for(int i=1;i<=na;i++){
			System.out.println("Ingrese la calificacion en una escala del 0 al 10: ");
			ca = sc.nextDouble();
			a= a+ca;
		}
		ca= a/na;
		System.out.println("El promedio es de "+ca);
		sc.close();
	}
	
}
