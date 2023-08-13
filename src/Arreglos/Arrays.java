package Arreglos;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arrays {

	public static void main(String[] args) {
		gestionNotas();
	}
	public static void llenarArreglo() {
		Scanner sc = new Scanner(System.in);
		int nElementos;
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de elementos del array"));
		
		char [] letras = new char[nElementos];
		
		System.out.println("Digita el numero de elementos del arreglo");
		for (int i = 0; i < nElementos; i++) {
			System.out.print((i + 1) + ". Digita el un caracter");
			letras[i] = sc.next().charAt(0);
		}
		for (char letter: letras) {
			System.out.print(letter + " ");
		}
	}
	
	public static void fiveNumbers() {
		Scanner sc = new Scanner (System.in);
		
		int numeros [] = new int [5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i + 1) + ". Digita un numero ");
			numeros[i] = sc.nextInt();
		}
		for (int numbers : numeros) {
			System.out.print(numbers + " ");
		}
	}

	public static void fiveNumbersInverso() {
		
		Scanner sc = new Scanner(System.in);
		
		int number [] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Digita 5 numeros: ");
			number[i] = sc.nextInt();
		}
		System.out.println("\nEl resultado es: ");
		for(int i = 4; i > -1; i--) {
			System.out.print(i + " ");
		}
	}

	public static void mediaArreglo() {
		Scanner sc = new Scanner (System.in);
		
		int numero [] = new int [5];
		int negativos = 0, positivos = 0, numeroCeros = 0, mediaPos = 0, mediaNeg = 0, mediaCer = 0;
		int sumaPositivos = 0, sumaNegativos = 0; 
		System.out.println("Guardando datos del arreglo");
		
		for(int i = 0; i< 5; i++) {
			System.out.println((i + 1) + ". Digita los numeros");
			numero[i] = sc.nextInt();
			
			if (numero[i] > 0) {
				sumaPositivos += numero[i];
				positivos ++;
				
			}else if (numero[i] < 0){
				sumaNegativos += numero[i];
				negativos ++;
			}else {
				numeroCeros ++;
			}
		}
		if (positivos == 0) {
			System.out.println("No se puede sacar la media de los numeros positivos");
		}else {
			mediaPos = sumaPositivos / positivos;
			System.out.println("La media de los numeros positivos es: " + mediaPos);
		}
		if (negativos == 0) {
			System.out.println("No se puede sacar la media de los numeros negativos");
		}else {
			mediaNeg = sumaNegativos / negativos;
			System.out.println("La media de los numeros negativos es: " + mediaNeg);
		}
		System.out.println("La cantidad de ceros es: " + numeroCeros);
	}

	//Aun sin resolución
	public static void primeroUltimo() {
		Scanner sc = new Scanner (System.in);
		
		int numero [] = new int[10];
		
		System.out.println("Guardando los numeros del arreglo");
		int j = 0;
		for (int i = 0; i < 10; i ++) {
			System.out.print((i + 1) + ". Digita un numero ");
			numero[i] = sc.nextInt();
		}
		int primero, ultimo;
		
		for (int i = 0 ; i < numero.length; i ++) {
			primero = numero[0];
			System.out.print(primero + " ");
			primero ++;
			
			ultimo = numero[numero.length - 1];
			System.out.print(ultimo + " ");
			ultimo --;
		}
		
	}
	
	public static void mezclarNumbers() {
		Scanner sc  = new Scanner (System.in);
		
		int [] numeros = new int [5];
		int [] numero2 = new int [5];
		int [] resultado = new int [10];
		System.out.println("Guardando los numeros en un array");
		
		//Primer Array
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + ". Escribe un numero ");
			numeros[i] = sc.nextInt();
		}
		//Segundo array
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + ". Escribe otro numero ");
			numero2[i] = sc.nextInt();
		}
		int j = 0;
		for (int i = 0; i < 5; i++) {
			resultado[j] = numeros[i];
			j ++;
			resultado[j] = numero2[i];
			j++;
		}
		System.out.println("\nLa composicion de los arreglos es: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(resultado[i] + " ");
		}
	}

	public static void mezcla3En3() {
		Scanner sc = new Scanner(System.in);
		int a [] = new int [6];
		int b [] = new int [6];
		int c [] = new int [12];
		
		System.out.println("Escrime numeros");
		for (int i = 0; i < 6; i++) {
			System.out.print((i + 1) + ". Digite un numero ");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < 6; i++) {
			System.out.print((i + 1) + ". Digite otro numero ");
			b[i] = sc.nextInt();
		}
		int i = 0; //recorrera los arreglos a y b
		int j = 0; //apuntara al ercer arreglo, guardar los elementos del arreglo
		
		while(i < 6) {
			//Llenamos los tres primeros elementos del arreglo a al c
			for (int k = 0; k < 3; k++) {
				c[j] = a[i + k];
				j++;
			}
			for (int k = 0; k < 3; k ++) {
				c[j] = b [i + k];
				j++;
			}
			i += 3;
		}
		System.out.println("\nLa composicion de 3 en 3 es: ");
		for(j = 0 ; j <12; j ++) {
			System.out.print(c[j] + " ");
		}
	}

	public static void mezcla4En4(){
		Scanner sc = new Scanner (System.in);
		
		int a [] = new int [6];
		int b [] = new int [6];
		int c [] = new int [6];
		int d [] = new int [24];
		
		System.out.println("Guardando numeros en el arreglo");
		
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + ". Digita los primeros numeros");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + ". Digita los segundos numeros");
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + ". Digita los tercer numeros");
			c[i] = sc.nextInt();
		}
		int i = 0;
		int j = 0;
		
		while(i < 6) {
			for (int k = 0; k <3; k ++) {
				d[j] = a[i + k];
				j++;
			}
			for (int k = 0; k <3; k++) {
				d[j] = b[i + k];
				j++;
			}
			for (int k = 0; k < 3; k ++) {
				d[j] = c[i + k];
				j++;
			}
			i += 3;
		}
		
		System.out.println("\nLa compocision de 3 en 3 es: ");
		for(j = 0; j < 18; j ++) {
			System.out.println(d[j] + " ");
		}
	}
	
	public static void ordenadoCrecienteDecrecienteDesordenados() {
		Scanner sc = new Scanner (System.in);
		int arreglo []; 
		int nElementos;
		int elementoOBuscar;
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite las pocisioes del aaray"));
		arreglo = new int [nElementos];
		
		for (int i = 0; i < nElementos; i++) {
			System.out.print((i + 1) + ". Digita un numero ");
			arreglo[i] = sc.nextInt();
		}
		for(int numero: arreglo) {
			System.out.print(numero + " ");
		}
		
		System.out.println("\nDigita el numero que desea encontrar ");
		elementoOBuscar = sc.nextInt();
		
		int i = 0;
		boolean encontrado = false;
		
		while(i < nElementos && encontrado == false) {
			if (arreglo[i] == 	elementoOBuscar) {
				encontrado = true;
			}
			i ++;
		}
		if (encontrado == false) {
			System.out.println("Elemnrto " + elementoOBuscar + " no encontrado");
		}else {
			System.out.println("Elemento " + elementoOBuscar + " encontrado en la pocision " + i);
		}
	}
	
	public static void Insertar() {
		Scanner sc = new Scanner(System.in);
		int nElementos = 10;
		int arreglo [] = new int[nElementos]; 
		
		for (int i = 0; i < nElementos - 2; i ++) {
			System.out.print((i + 1) + ". Digta un numero ");
			arreglo [i] = sc.nextInt();
		}
		
		for (int i = 0; i <nElementos - 2; i ++) {
			System.out.print(arreglo[i] + " ");
		}
		
		System.out.println("\nEscribe el numero que quieres recorrer: ");
		int numeroBuscado = sc.nextInt();
		
		int i = 0;
		boolean encontrado = false;
		
		while(i < nElementos && encontrado == false) {
			if (arreglo[i] == numeroBuscado) {
				encontrado = true;
			}
			i ++;
		}
		if (encontrado == false) {
			System.out.println("No se encontro el numero");
		}else if (encontrado == true){
			System.out.println("\nSe encontro el numero " + numeroBuscado + " en el indice: " + i);
			
		}
	}
	
	public static void Desplazamiento() {
		Scanner sc = new Scanner(System.in);
		
		int arreglo [] = new int [10];
		int ultimo;
		System.out.println("Llenar el array");
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + ". Digita un numero ");
			arreglo[i] = sc.nextInt();
		}
		
		ultimo = arreglo[9];
		
		for (int i = 8; i >= 0; i-- ) {
			arreglo[i + 1] = arreglo[i];
		}
		arreglo[0] = ultimo;
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i+" Numero: "+arreglo[i]);
		}
	}
	//Pendiente
	public static void DesplazarUsuario() {
		Scanner sc = new Scanner(System.in);
		int arreglo [] = new int [10];
		int nElementos =  10;
		int ultimo;
		
		for (int i = 0; i < nElementos; i++) {
			System.out.print((i + 1) + ". Digite un numero ");
			arreglo[i] = sc.nextInt();
		}
		System.out.print("Digite cuantas pocisiones desea recorrer el arreglo ");
		int pocisiones = sc.nextInt();
		
		int i = (nElementos - pocisiones);
		ultimo = arreglo[i];
		System.out.println(ultimo);
		
	}

	public static void insertar() {
		Scanner sc = new Scanner(System.in);
		
		int array [] = new int[10];
		boolean creciente = false;
		int numero, sitio_numero= 0, j = 0;
		
		System.out.println("Llenar el arreglo");
		do {
			for(int i = 0; i < 5; i++) {
				System.out.print((i +1) + ". Digita un numero");
				array[i] = sc.nextInt();
			}
			for (int i = 0; i<4; i ++) {
				if(array[i] < array[i + 1]) {
					creciente = true;
				}
				if(array[i] > array[i + 1]) {
					creciente = false;
					break;
				}
			}
			
			if (creciente == false) {
				System.out.println("\nEl arreglo no esta ordenado de forma creciente, vuleva a digitarlo\n");
			}
		}while(creciente == false);
		
		System.out.println("Digite un elemento a insertar: ");
		numero = sc.nextInt();
		
		//Para ver en que pocision va el numero
		while(array[j] < numero && j < 5) {
			sitio_numero ++;
			j++;
		}
		
		//transladamos una pocision en el arreglo en los elementos que van en el numero
		for(int i = 4; i >= sitio_numero; i --) {
			//el i + 1 es darle un hueco para que inserte el numero que el user acaba de digitar
			array[i + 1] = array[i];
		}
		
		//Insertamos el numero que el usuario puso
		array[sitio_numero] = numero;
		
		System.out.println("\nEl arreglo queda: ");
		for (int arreglo: array) {
			System.out.print(arreglo + " - ");
		}
	}
	
	public static void Delete() {
		Scanner sc = new  Scanner(System.in);
		int array [] = new int [10];
		
		System.out.println("Llena el arreglo ");
		
		for (int i = 0; i < 10; i ++) {
			System.out.print((i + 1)+ ". Escribe un numero ");
			array[i] = sc.nextInt();
		}
		for (int arrays: array) {
			System.out.print(arrays + " ");
		}
		int i = 0;
		System.out.println("\nDigita el numero de la pocision que quieras eliminar");
		int pcisionEliminar = sc.nextInt();
		
		for (i = pcisionEliminar; i < 9; i++) {
			array[i] = array[i + 1]; 
		}
		
		System.out.println("\nEl arreglo es: \n");
		
		for (i = 0; i < 9; i ++) {
			System.out.println(array[i] + " en la pocisión: " + (i + 1));
		}
	}

	public static void paresImpares() {
		Scanner sc = new Scanner(System.in);
		
		int array [] = new int[10];
		int conteo_pares = 0, conteo_impares = 0;
		
		System.out.println("Escribe numeros a continuación\n");
		for (int i = 0; i < 10; i ++) {
			System.out.print((i + 1) + ". Escribe un numero");
			array[i] = sc.nextInt();
			
			if (array[i] % 2 == 0) {
				conteo_pares ++;
			}else {
				conteo_impares ++;
			}
		}
		int par [] = new int [conteo_pares];
		int impar [] = new int [conteo_impares];
		
		conteo_pares = 0;
		conteo_impares = 0;
		
		for (int i = 0; i < 10; i++) {
			if (array[i] % 2 == 0) {
				par[conteo_pares] = array[i];
				conteo_pares ++;
			}else {
				impar[conteo_impares] = array[i];
				conteo_impares ++;
			}
		}
		System.out.println("\nArreglo Pares");
		for (int i = 0; i < conteo_pares; i++) {
			System.out.print(par[i] + " - ");
		}
		System.out.println();
		System.out.println("\nArreglo Impares");
		for (int i = 0; i < conteo_impares; i++) {
			System.out.print(impar[i] + " - ");
		}
		System.out.println();
	}

	public static void fusionarTablas() {
		Scanner sc = new Scanner (System.in);
		
		int a [] = new int [5];
		int b [] = new int [5];
		int c [] = new int [10];
		boolean creciente = false;
		do {
			
			for (int i = 0; i <5; i ++) {
				System.out.print((i + 1) + ". Escriba un numero ");
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < 5; i ++) {
				System.out.print((i + 1) + ". Escribe los otros numeros ");
				b[i] = sc.nextInt();
			}
			
			for (int i = 0; i<4; i ++) {
				if(a[i] < a[i + 1]) {
					creciente = true;
				}
				if(a[i] > a[i + 1]) {
					creciente = false;
					break;
				}
			}
			for (int i = 0; i<4; i ++) {
				if(b[i] < b[i + 1]) {
					creciente = true;
				}
				if(b[i] > b[i + 1]) {
					creciente = false;
					break;
				}
			}
			
			if (creciente == false) {
				System.out.println("\nEl arreglo no esta ordenado de forma creciente, vuleva a digitarlo\n");
			}else {
				int j = 0;
				for (int i = 0; i < 5; i++) {
					c[j] = a[i];
					j++;
					c[j] = b[i];
					j++;
				}
				
			}
		}while(creciente == false);
		
		
		System.out.println("\nEl resultado del arreglo ordenado es: ");
		for (int i = 0; i < 10; i ++) {
			System.out.print(c[i] + " ");
		}
	}

	public static void Buscar() {
		Scanner sc = new Scanner (System.in);
		
		int array [] = new int [10];
		int numeroBuscar;
		boolean ordenado = true;
		do {
			for (int i = 0; i < 10; i ++) {
				System.out.print((i + 1) + ". Escriba el Arreglo de 10 pocisiones ");
				array [i] = sc.nextInt();
			}
			
			for (int i = 0; i < 9; i ++) {
				if (array[i] < array[i +1]) {
					ordenado = true;
				}
				if(array[i] > array[i + 1]) {
					ordenado = false;
					break;
				}
			}
			if(ordenado == false) {
				System.out.println("\nEl arreglo esta desordenado, vuelva a digitarlo otra vez de nuevo");
			}
		}while(ordenado == false);
		
		System.out.print("\nEscribe el numero que deseas buscar ");
		numeroBuscar = sc.nextInt();
		
		int i = 0;
		while (i < 10 && array[i] < numeroBuscar) {
			i++;
		}
		
		if (i == 10) {
			System.out.println("\nEl numero no ha sido encontrado");
		}else {
			if(array[i] == numeroBuscar) {
				System.out.println("El numero ha sido encontrado en la pocision: " + (i + 1));
			}else {
				System.out.println("Numenro no encontrado ");
			}
		}
	}

	public static void gestionNotas() {
		Scanner sc = new Scanner (System.in);
		
		int primerSemestre [] = new int [5];
		int segundoSemestre [] = new int [5];
		int tercerSemestre [] = new int [5];
		int notaMediaAlumno = 0;
		int i = 0;
		do {
			for (i = 0; i < 5; i ++) {
				System.out.print((i + 1) + ". Escribe las notas del primer semestre ");
				primerSemestre[i] = sc.nextInt();
			}
			System.out.println();
			for (i = 0; i < 5; i ++) {
				System.out.print((i + 1) + ". Escribe las notas del segundo semestre ");
				segundoSemestre[i] = sc.nextInt();
			}
			System.out.println();
			for (i = 0; i < 5; i ++) {
				System.out.print((i + 1) + ". Escribe las notas del tercer semestre ");
				tercerSemestre[i] = sc.nextInt();
			}
		}while(i >= 0 && i < 5);
		double division = 0;
		for(i = 0; i < 5; i ++) {
			notaMediaAlumno += primerSemestre[i];
			division = (double)notaMediaAlumno / 5;
		}
		System.out.println("La media del primer semestre es: " + division);
		notaMediaAlumno = 0;
		double divisionDos = 0;
		for(i = 0; i < 5; i ++) {
			notaMediaAlumno += segundoSemestre[i];
			divisionDos = (double)notaMediaAlumno / 5;
		}
		System.out.println("La media del segundo semestre es: " + divisionDos);
		
		notaMediaAlumno = 0;
		double divisionTres = 0;
		for(i = 0; i < 5; i ++) {
			notaMediaAlumno += tercerSemestre[i];
			divisionTres = (double)notaMediaAlumno / 5;
		}
		System.out.println("La media del tercer semestre es: " + divisionTres);
		
		System.out.print("\nEscribe a que pocision quieres sacarle la media: ");
		int numeroBuscar = sc.nextInt();
		
		i = 0;
		while (i < 5 && i < numeroBuscar) {
			i++;
		}
		
		
	}
	
}
