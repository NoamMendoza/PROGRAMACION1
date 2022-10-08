package tema3_3;
import java.util.Scanner;
public class estudiantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad,a=0,aa=0,bb=0; double estatura,b=0;
		
		for(int i=1;i<=5;i++){
			System.out.println("Ingrese la edad: ");
			edad=sc.nextInt();
			System.out.println("Ingrese la estatura en metros: ");
			estatura=sc.nextDouble();
			
			a =a+edad;
			b=b+estatura;
			
			if(edad>18){
				aa++;
			}
			if(estatura>1.75){
				bb++;
			}
		}
		a=a/5;
		b=b/5;
		System.out.println("La edad promedio es de: "+a+"\nLa estatura promedio es de: "+b+"\nLas"
				+ " personas mayores de 18 años son: "+aa+"\nLas personas que miden mas de 1.75 son: "+bb);
		
		sc.close();
	}

}
