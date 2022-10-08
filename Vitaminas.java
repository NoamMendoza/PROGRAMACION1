//Maestra la neta no le entiendo ayuda//
package tema3_1;
import java.util.Scanner;
public class Vitaminas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double peso, altura, vitaminasH;
		String sexo;
		
		System.out.println("Ingrese su peso en libras y estatura en metros: ");
		peso = entrada.nextDouble();
		altura = entrada.nextDouble();
		System.out.println("Ingrese su sexo: ");
		sexo = entrada.next();
		
		if(sexo.equalsIgnoreCase("Hombre")||sexo.equalsIgnoreCase("Masculino")&&altura>1.60&&peso>=150){
			peso=peso*453.59;
			altura=altura*100;
			vitaminasH = (altura*0.2)+(peso*0.8);
			
			System.out.println("La cantidad de vitaminas a suministrar es de: "+vitaminasH);
		}
		else if(sexo.equalsIgnoreCase("Hombre")||sexo.equalsIgnoreCase("Masculino")&&altura<1.60&&peso>=150){
			peso=peso*453.59;
			altura=altura*100;
			vitaminasH = (altura*0.3)+(peso*0.7);
			System.out.println("La cantidad de vitamnias a suministrar es de: "+vitaminasH);
			}
		else if(sexo.equalsIgnoreCase("Mujer")||sexo.equalsIgnoreCase("Femenino")&&altura>1.50&&peso>=130){
			peso=peso*453.59;
			altura=altura*100;
			vitaminasH = (altura*0.25)+(peso*0.75);
			System.out.println("La cantidad de vitamnias a suministrar es de: "+vitaminasH);
		}
		else if(sexo.equalsIgnoreCase("Mujer")||sexo.equalsIgnoreCase("Femenino")&&altura<1.50&&peso<=130){
			peso=peso*453.59;
			altura=altura*100;
			vitaminasH = (altura*0.35)+(peso*0.65);
			System.out.println("La cantidad de vitamnias a suministrar es de: "+vitaminasH);
		}
		entrada.close();
		}
	
	}


