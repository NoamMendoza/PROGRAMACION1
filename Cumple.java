package tema3_2;
import java.util.Scanner;
public class Cumple {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre; int a;
		
		System.out.println("Ingrese su categoria: \n1.Hombre\n2.Mujer\n3.No binario");
		a = entrada.nextInt();
		
		
		switch(a){
			case 1: 
				System.out.println("1.Noam\n2.Compañero2\n3.Compañero3\n4.Compañero4\n5.Compañero5");
				
				System.out.println("Ingrese el nombre del compañero: ");
				nombre = entrada.next();
				
				if(nombre.equalsIgnoreCase("Noam")){
					System.out.println("Cumple el 18 de septiembre");
				}
				else if(nombre.equalsIgnoreCase("Compañero2")){
					System.out.println("Cumple sabra dios");
				}
				else if(nombre.equalsIgnoreCase("Compañero3")){
					System.out.println("Cumple sabra dios");
				}
				else if(nombre.equalsIgnoreCase("Compañero4")){
					System.out.println("Cumple sabra dios");
				}
				else if(nombre.equalsIgnoreCase("Compañero5")){
					System.out.println("Cumple sabra dios");
				}
				break;
			case 2:
				System.out.println("1.Irieri\n2.Compañera2\n3.Compañera3\n4.Compañera4\n5.Compañera5");
				
				System.out.println("Ingrese el nombre de la compañera: ");
				nombre = entrada.next();
				
				if(nombre.equalsIgnoreCase("Irieri")){
					System.out.println("Cumple el 11 de marzo");
				}
				else if(nombre.equalsIgnoreCase("Compañera2")){
					System.out.println("Cumple sabra dios");
				}
				else if(nombre.equalsIgnoreCase("Compañera3")){
					System.out.println("Cumple sabra dios");
				}
				else if(nombre.equalsIgnoreCase("Compañera4")){
					System.out.println("Cumple sabra dios");
				}
				else if(nombre.equalsIgnoreCase("Compañera5")){
					System.out.println("Cumple sabra dios");
				}
				break;
			case 3:
				System.out.println("albion online es un mmorpg no lineal en el que escribes tu propia historia sin\n"
						+ " limitarte a seguir un camino prefijado, explora un amplio mundo abierto con cinco biomas\n "
						+ "unicos, todo cuanto hagas tendra su repercusíon en el mundo, con su economia orientada al \n"
						+ "jugador de albion los jugadores crean practicamente todo el equipo a partir de los recursos \n"
						+ "que consiguen, el equipo que llevas define quien eres, cambia de arma y armadura para pasar de \n "
						+ "caballero a mago o juego como una mezcla de ambas clases, aventurate en el mundo abierto y haz \n"
						+ "frente a los habitantes y las criaturas de albion, inicia expediciones o adentrate en mazmorras \n"
						+ "en las que encontraras enemigos aun mas dificiles, enfrentate a otros jugadores en encuentros en \n"
						+ "el mundo abierto, lucha por los territorios o por ciudades enteras en batallas tacticas, relajate \n"
						+ "en tu isla privada donde podras construir un hogar, cultivar cosechas, criar animales, unete a un \n"
						+ "gremio, todo es mejor cuando se trabaja en grupo [musica] adentrate ya en el mundo de albion y \n"
						+ "escribe tu propia historia");
				break;
			default:
				System.out.println("No va en el salon maistro");
				}
		entrada.close();
				}
		}
		
