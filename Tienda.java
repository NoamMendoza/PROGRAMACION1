package tema3_1;
import java.util.Scanner;
public class Tienda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double compra, descuento, VT;																																			
		String bola;
		
		System.out.println("Ingrese el valor de la compra: ");
		compra = entrada.nextDouble();
		
		System.out.println("Ingrese el color de la bolita que obtuvo: ");
		bola = entrada.next();
		
		if(bola.equalsIgnoreCase("Blanco") || bola.equalsIgnoreCase("Blanca")){
			System.out.println("No obtiene descuento");
			System.out.println("El total de su compra es de: "+compra);
		}
                else if(bola.equalsIgnoreCase("Verde")){
				descuento = compra*0.1;
				VT = compra-descuento;
				System.out.println("Su descuento es del 10%, lo cual equivale a "+descuento);
				System.out.println("El total de su compra es de "+VT);
			}
                else if(bola.equalsIgnoreCase("Amarilla") || bola.equalsIgnoreCase("Amarillo")){
				descuento = compra*0.25;
				VT = compra-descuento;
				System.out.println("El descuento es del 25%, lo cual equivale a "+descuento);
				System.out.println("El total de su compra es de "+VT);
			}
                else if (bola.equalsIgnoreCase("Azul")){
				descuento = compra*0.5;
				VT = compra-descuento;
				System.out.println("Su descuento es del 50%, lo cual equivale a "+descuento);
				System.out.println("El total de su compra es de "+VT);
				}
                else if(bola.equalsIgnoreCase("Roja") || bola.equalsIgnoreCase("Rojo")){
				descuento = compra*1;
				VT = compra-descuento;
				System.out.println("Su descuento es del 10%, lo cual equivale a "+descuento);
				System.out.println("El total de su compra es de "+VT);
				}
                else if(bola != "Roja" || bola != "Rojo" || bola != "roja" 
				|| bola != "rojo" || bola != "Azul"||bola != "azul"||bola != "amarilla"|| bola != "Amarilla" 
				|| bola != "Amarillo" || bola != "amarillo" || bola != "Verde" || bola != "verde" 
				|| bola != "Blanco" || bola != "blanco" || bola != "Blanca" || bola != "blanca"){
				System.out.println("No hay bolitas de el color que introdujo");
				System.out.println(bola);
				}
				}
				}
