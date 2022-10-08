package tema3_1;
import java.util.Scanner;


public class Hemoglobina {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double hemo;
		int edad;
		String sexo;
		
		System.out.println("Ingrese su nivel de hemoglobina: ");
		hemo = entrada.nextDouble();
		hemo = hemo/100;
		System.out.println("Ingrese su edad en meses: ");
		edad = entrada.nextInt();
		
		System.out.println("Ingrese su sexo: ");
		sexo = entrada.next();
		
		//De 0 a 1 mes. Rango 13 - 26
		if(edad>=0 && edad<=1){
			if(hemo<0.13){
			System.out.println("Tiene anemia");
			}
			else{
				System.out.println("No tiene anemia");
			}
		}
		
		
		// De 1 a 6 meses. Rango 10 - 18
		if(edad>1 && edad<=6){
				if(hemo<0.1){
			System.out.println("Tiene anemia");
				}
			else{
				System.out.println("No tiene anemia");
			}
		}
		
		//De 6 a 12 mese. Rango 11 - 15
		if(edad>6 && edad<=12){
			if(hemo<0.11){
				System.out.println("Tiene anemia");
				}
			else{
				System.out.println("No tiene anemia");
			}
		}

			//De 12 a 60 meses. Rango 11.5 - 15
		if(edad>12 && edad<=60){ 
			if(hemo<0.115){
				System.out.println("Tiene anemia");
				}
			else{
				System.out.println("No tiene anemia");
			}
		}
		
		//De 60 a 120 meses. Rango 12.6 - 15.5
		if(edad>60 && edad<=120){
			if(hemo<0.126){
				System.out.println("Tiene anemia");
				}
			else{
				System.out.println("No tiene anemia");
			}
		}
		
		//De 120 a 180 meses. 13 - 15.5
		if(edad>120 && edad<=180){
			if(hemo<0.13){
				System.out.println("Tiene anemia");
				}
			else{
				System.out.println("No tiene anemia");
			}
		}
		
		if(edad>180 && hemo>=0.12 && hemo<=0.16 )
				if (sexo.equalsIgnoreCase("Femenino")||sexo.equalsIgnoreCase("Mujer")){
			System.out.println("No es anemia");
			}
		if(edad>180 && hemo<0.12)
			if (sexo.equalsIgnoreCase("Femenino")||sexo.equalsIgnoreCase("Mujer")){
				System.out.println("Tiene anemia");
		}
		if(edad>180 && hemo>=0.16)
			if(sexo.equalsIgnoreCase("Femenino")||sexo.equalsIgnoreCase("Mujer")){
			System.out.println("No tiene anemia");
		}
		
		
		if(edad>180 && hemo>=0.14 && hemo<=0.18)
			if(sexo.equalsIgnoreCase("Masculino")||sexo.equalsIgnoreCase("Hombre")){
			System.out.println("No es anemia");
			}
		if(edad>180 && hemo<=0.14)
			if(sexo.equalsIgnoreCase("Masculino")||sexo.equalsIgnoreCase("Hombre")){
				System.out.println("Tiene anemia");
		}
		if(edad>180 && hemo>=0.18)
			if(sexo.equalsIgnoreCase("Masculino")||sexo.equalsIgnoreCase("Hombre")){
			System.out.println("No tiene anemia");
		}
		entrada.close();
}
}