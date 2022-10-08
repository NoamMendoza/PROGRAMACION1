package tema3_2;
import java.util.Scanner;
public class Opciones {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a;
		double b,c,d,e;
		
		System.out.println("Elja su opcion: \n1.Determinar si un numero es par o impar."
				+ "\n2.Calcular valor absoluto de un numero.\n3.Determinar si un numero "
				+ "es positivo o negativo.\n4.Pedir 3 numeros e indicar si el tercero "
				+ "es igual a la suma del primaro mas el segundo");
		a = entrada.nextInt();
		
		switch(a){
		case 1: System.out.println("Ingrese el numero: ");
				b = entrada.nextDouble();
				b = b%2;
			if(b == 0){
			System.out.println("El numero es par");
			}
			else{
				System.out.println("El numero es impar");
			}
			break;
		case 2: System.out.println("Ingrese el valor:");
				b=entrada.nextDouble();
				if(b>=0){
					System.out.println("El valor absoluto de "+b+" es "+b);
				}
				else if(b<0){
					c=b*-1;
					System.out.println("El valor absoluto de "+b+" es "+c);
				}
				break;
		case 3: System.out.println("Ingrese el valor: ");
				b=entrada.nextDouble();
				if(b<0){
					System.out.println("El numero es negativo");
				}
				else{
					System.out.println("Es positivo o es cero");
				}
				break;
		case 4: System.out.println("Ingrese los tres numeros: ");
				b=entrada.nextDouble();
				c=entrada.nextDouble();
				d=entrada.nextDouble();
				e=b+c;
				if(e==d){
					System.out.println("La suma de los primeros 2 numeros es igual al tercero");
				}
				else{
					System.out.println("La suma de los primeros 2 numeros no es igual al tercero");
				}
		}
	}

}
