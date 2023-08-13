package ORDENAMIENTO;

import java.util.Scanner;

public class Ordenamientos {

	public static void main(String[] args) {
		busquedaSecuencial();
	}
	
	public static void mayotToMenor() {
		Scanner sc = new Scanner(System.in);
		int array [], nElementos, aux;
		
		System.out.print("Escribe el numero de elementos que obtendra tu array: ");
		nElementos = sc.nextInt();
		
		array = new int [nElementos];
		
		for (int i = 0; i < nElementos; i ++) {
			System.out.print((i + 1) + ". Escribe un numero: ");
			array[i] = sc.nextInt();
		}
		
		//Metodo Burbuja
		for(int i = 0; i < nElementos; i++) {
			for(int j = 0; j < (nElementos - 1); j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux; 
				}
			}
		}
		
		System.out.println("\nEl arreglo formado de manera crecieinte ");
		for (int arreglo: array) {
			System.out.print(arreglo + " ");
		}
		
		System.out.println("\nEl arreglo ordenado de forma decreciente ");
		for (int i = (nElementos - 1); i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
	
	
	public static void OrdenamientoByInserccion() {
		Scanner sc = new Scanner (System.in);
	
		int arreglo[] ,nElementos, pos, aux;
	
		System.out.println("Escriba el numero de posiciones ");
		nElementos= sc.nextInt();
		
		arreglo = new int [nElementos];
		
		for (int i = 0; i < (nElementos - 1); i++) {
			System.out.print((i + 1) + ". Escriba un numero ");
			arreglo[i] = sc.nextInt();
		}
		
		//Ordenamiento por inserccion 
		for (int i = 0; i < nElementos; i ++) {
			pos = i;
			aux = arreglo[i];
			
			/*pos tiene que ser mayor a cero para que no pierdamos tiempo comparando la primera posciion con
			 * la parte izquierda ya que no hay un numero
			 * */
			while((pos > 0) && (arreglo[pos -1] > aux)) {
				arreglo[pos] = arreglo[pos - 1];
				//El pos -- nos servira para que vaya comprobando con los numeros que van hacia la izquierda
				pos --;
			}
			
			arreglo[pos] = aux;
		}
		
		System.out.println("\nOrden Ascendente ");
		for(int array: arreglo) {
			System.out.print(array + " ");
		}
		
	}

	public static void busquedaSecuencial() {
		
		Scanner sc = new Scanner (System.in);
		
		int arreglo [] = {1,5,2,7,4};
		int dato; 
		boolean band = false;
		
		System.out.println("Digite un numero a buscar: ");
		dato = sc.nextInt();
		//Buscar secuencialmente
		int i = 0;
		
		while(i < 5 && band == false) {
			if(arreglo[i] == dato) {
				band = true;	
			}
			i ++;
		}
		
		if (band == false) {
			System.out.println("No se encontro el valor...");
		}
		if (band == true) {
			System.out.println("Se encontro el valor" + dato +  " en la pocision: " +  (i ));
		}
	}
}
