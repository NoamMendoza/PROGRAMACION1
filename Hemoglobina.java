package tema3_2;

import java.util.Scanner;

public class Hemoglobina {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int e, h;
		String sexo;
		System.out.println(" Ingresa la edad de la persona en meses");
		e = scn.nextInt();
		System.out.println("Ingresa el nivel de hemoglobina");
		h = scn.nextInt();
		System.out.println("Ingresa el sexo de la persona");
		sexo = scn.next();
		if (e > 0 && e <= 1) {
			if (h >= 13)
				System.out.println("No tiene anemia");
			else
				System.out.println("Tiene anemia");
		}
		if (e > 1 && e <= 6) {
			if (h >= 10)
				System.out.println("No tiene amenia");
			else
				System.out.println("Tiene anemia");
		}
		if (e > 6 && e <= 12) {
			if (h >= 11)
				System.out.println("No tiene anemia");
			else
				System.out.println("Tiene anemia");
		}
		if (e > 12 && e <= 60) {
			if (h >= 11.5)
				System.out.println("No tiene anemia");
			else
				System.out.println("Tiene anemia");
		}
		if (e > 60 && e <= 120) {
			if (h >= 12.6)
				System.out.println("No tiene anemia");
			else
				System.out.println("Tiene anemia");
		}
		if (e > 120 && e <= 180) {
			if (h >= 13)
				System.out.println("No tiene anemia");
			else
				System.out.println("Tiene anemia");
		}	
		if (sexo.equalsIgnoreCase("mujer") && e > 180) {
				if (h >= 12)
					System.out.println("No tiene anemia");
				else
					System.out.println("Tiene anemia");
			}
		
			if (sexo.equalsIgnoreCase("hombre") && e > 180) {
				if (h >= 14)
					System.out.println("No tiene anemia");
				else
					System.out.println("Tiene anemia");
			}
			scn.close();
		
	}
}
