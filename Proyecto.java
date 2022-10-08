package ProyectoFinal;
import java.util.Scanner;
public class Proyecto {
//Arreglar datos en la opcion de agregar cosas al inventario
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,x=1,z=1,contador=0,casillas,y=0;
		int cantidad[];
		String producto[], categoria[],ID[];
		String nombre,ID2;
		double precio[];
		
		System.out.println("Ingrese los espacios del inventario: ");
		casillas=sc.nextInt();
		cantidad = new int [casillas];
		ID=new String [casillas];
		producto=new String[casillas];
		categoria=new String [casillas];
		precio=new double[casillas];
		
		do{
		System.out.println("Seleccione una opcion: \n1.Revisar el inventario actual."
				+ "\n2.Administrar inventario.\n3.Buscar un producto.\n4.Salir.");
		a=sc.nextInt();
		
		switch(a){
		
		//Caso 1: Revisar el inventario
		
		case 1:
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			for(int i=0;i<casillas;i++){
				
				System.out.println(producto[i]+"\t"+cantidad[i]+"\t"+precio[i]+"\t"+ID[i]+"\t"+categoria[i]);
			}
			break;
			
			//Caso 2: Aministrar inventario
			
		case 2:
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Desea: \n1.Ingresar un producto\n2.Eliminarlo");
			b=sc.nextInt();
			
			//Ingresar producto
			if(b==1){
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				for(int i=0;i<casillas;i++){
					System.out.println((i+1)+".\t"+producto[i]+"\t"+cantidad[i]+"\t"+precio[i]+"\t"+ID[i]+"\t"+categoria[i]);
				}
				System.out.println("¿Desde donde empezar a rellenar?");
				y=sc.nextInt();
			for (y=y-1;y<casillas;y++){
			System.out.println("Ingrese Producto, Cantidad, Precio, ID numerico y categoria.");
			System.out.print("Producto: ");
			producto[y]=sc.next();
			System.out.print("Cantidad: ");
			cantidad[y]=sc.nextInt();
			System.out.print("Precio: ");
			precio[y]=sc.nextDouble();
			System.out.print("ID numerico:");
			ID[y]=sc.next();
			System.out.print("Categoria: ");
			categoria[y]=sc.next();
			
			System.out.println("¿Desea agregar otro producto?\n1.Si\n2.No");
			
			z=sc.nextInt();
			
			if(z==2){
				
				y+=casillas;
					}
			z=1;
				}
			y=0;
			}
			
			
			//Eliminar productos
			else if(b==2){
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("Ingrese su metodo de busqueda: \n1.Nombre del producto.\n2.ID numerico.\n3.Categoria.");
				c=sc.nextInt();
				z=1;
				while(z==1){
				if(c==1){
					System.out.println("Ingrese el nombre del producto: ");
					nombre=sc.next();
					for(int i=0;i<producto.length;i++){
						if(producto[i].equalsIgnoreCase(nombre)){
							producto[i]="cero";
							cantidad[i]=0;
							precio[i]=0;
							ID[i]="cero";
							categoria[i]="cero";
							z=0;
						}
						else{
							contador++;
						}
					}
					if(contador==100){
							System.out.println("No se encontro su producto");
							System.out.println("Para intentar otra categoria introduzca su respectivo "
									+ "numero o si quiere salir introduzca 0: ");
							c=sc.nextInt();
							if(c==0){
								z=0;
								contador=0;
							}
						}
					
					}
				if(c==2){
					System.out.println("Ingrese el ID numerico del producto: ");
					ID2=sc.next();
					for(int i=0;i<100;i++){
						if(ID[i].equalsIgnoreCase(ID2)){
							producto[i]="cero";
							cantidad[i]=0;
							precio[i]=0;
							ID[i]="cero";
							categoria[i]="cero";
						}
						else{
							contador++;
						}
					}
					if(contador==100){
						System.out.println("No se encontro su producto");
						System.out.println("Para intentar otra categoria introduzca su respectivo "
								+ "numero o si quiere salir introduzca 0: ");
						c=sc.nextInt();
						if(c==0){
							z=0;
							contador=0;
						}
					}
				}
				if(c==3){
					System.out.println("Ingrese la categoria del producto: ");
					nombre=sc.next();
					for(int i=0;i<100;i++){
						if(categoria[i].equalsIgnoreCase(nombre)){
							producto[i]="cero";
							cantidad[i]=0;
							precio[i]=0;
							ID[i]="cero";
							categoria[i]="cero";
						}
						else{
							contador++;
						}
					}
					if(contador==100){
						System.out.println("No se encontro su producto");
						System.out.println("Para intentar otra categoria introduzca su respectivo "
								+ "numero o si quiere salir introduzca 0: ");
						c=sc.nextInt();
						if(c==0){
							z=0;
							contador=0;
						}
					}
				}
				}
			}
			
			break;
			
			//Caso 3: Buscar
			
		case 3:
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Ingrese su metodo de busqueda: \n1.Nombre del producto.\n2.ID numerico.\n3.Categoria.");
			c=sc.nextInt();
			
			z=1;
			while(z==1){
				z=2;
			if(c==1){
				System.out.println("Ingrese el nombre del producto: ");
				nombre=sc.next();
				for(int i=0;i<producto.length;i++){
					if(producto[i].equalsIgnoreCase(nombre)){
						System.out.println(producto[i]+"\t"+cantidad[i]+"\t"+precio[i]+"\t"+ID[i]+"\t"+categoria[i]);
						z=0;
					}
					else{
						contador++;
					}
				}
				if(contador==100){
					System.out.println("No se encontro su producto");
					System.out.println("Para intentar otra categoria introduzca su respectivo "
							+ "numero o si quiere salir introduzca 0: ");
					c=sc.nextInt();
					if(c==0){
						z=0;
						contador=0;
					}
				}
			}
			}
			
			z=1;
			while(z==1){
				z=2;
			if(c==2){
				System.out.println("Ingrese el ID numerico del producto: ");
				ID2=sc.next();
				for(int i=0;i<producto.length;i++){
					if(ID[i].equalsIgnoreCase(ID2)){
						System.out.println(producto[i]+"\t"+cantidad[i]+"\t"+precio[i]+"\t"+ID[i]+"\t"+categoria[i]);
					}
					else{
						contador++;
					}
				}
				if(contador==100){
					System.out.println("No se encontro su producto");
					System.out.println("Para intentar otra categoria introduzca su respectivo "
							+ "numero o si quiere salir introduzca 0: ");
					c=sc.nextInt();
					if(c==0){
						z=0;
						contador=0;
					}
				}
			}
			}
			z=1;
			while(z==1){
				z=2;
			if(c==3){
				System.out.println("Ingrese la categoria del producto: ");
				nombre=sc.next();
				for(int i=0;i<producto.length;i++){
					if(categoria[i].equalsIgnoreCase(nombre)){
						System.out.println(producto[i]+"\t"+cantidad[i]+"\t"+precio[i]+"\t"+ID[i]+"\t"+categoria[i]);
					}
					else{
						contador++;
					}
				}
				if(contador==100){
					System.out.println("No se encontro su producto");
					System.out.println("Para intentar otra categoria introduzca su respectivo "
							+ "numero o si quiere salir introduzca 0: ");
					c=sc.nextInt();
					if(c==0){
						z=0;
						contador=0;
					}
				}
			}
			
			}
			break;
			
			//Caso 4: salir
			
		case 4:
			x=4;
			break;
		default:
			System.out.println("Ingrese una opcion valida");
		}
		
		
		
		}while(x!=4);
	}

}
