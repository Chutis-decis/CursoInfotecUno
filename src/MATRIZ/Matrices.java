package MATRIZ;

import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
		sumaColumnaAndSumaFila();
	}
	
	public static void Matriz() {
		
		Scanner sc = new Scanner(System.in);
		
		int matriz[][], nFilas, nColumnas;
		
		System.out.print("Escribe el numeros de filas: ");
		nFilas = sc.nextInt();
		System.out.print("Escribe el numero de columnas: ");
		nColumnas = sc.nextInt();
		
		matriz = new int [nFilas][nColumnas];
		
		System.out.println("Escriba la Matriz: ");
		for(int i = 0; i < nFilas; i ++) {
			for (int j = 0; j < nColumnas; j ++) {
				System.out.print("Matriz [" + i + "][" + j + "] " );
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("La matriz es: ");
		for(int i = 0; i < nFilas; i ++) {
			for (int j = 0; j < nColumnas; j ++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
	}

	public static void Simetrica() {
		Scanner sc = new Scanner(System.in);
		
		int matriz [][], nFilas, nColumnas;
		boolean simetrica = true;
		
		System.out.print("Escriba el numero de filas: ");
		nFilas = sc.nextInt();
		System.out.print("Escribe el numero de columnas: ");
		nColumnas = sc.nextInt();
		
		matriz = new int [nFilas][nColumnas];
		
		System.out.println("Escribe una matriz");
		for(int i = 0; i < nFilas; i ++) {
			for (int j = 0; j < nColumnas; j ++) {
				System.out.print("Matriz ["+ i + "]["+j+"] ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		if(nFilas  == nColumnas) {
			int i = 0, j = 0;
			while(i < nFilas && simetrica == true) {
				while(j < nColumnas && simetrica == true) {
					if (matriz[i][j] != matriz[j][i]) {
						simetrica = false;
					}
					j ++;
				}
				i ++;
			}
			if (simetrica == true) {
				System.out.println("La matriz es simetrica");
			}else {
				System.out.println("La matriz no es simetriica");
			}
		}else{
			System.out.println("Esta matriz no es asimetrica.");
		}
		
	}

	public static void sumaMatices () {
		Scanner sc = new Scanner (System.in);
		
		int matriz [][] = new int [3][3];
		int suma = 0; 
		
		System.out.println("Digita la matriz");
		for (int i = 0; i <3; i++) {
			for(int j = 0; j < 3; j ++) {
				System.out.print("Matriz ["+i+"]["+j+"] ");
				matriz[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i <3; i++) {
			for(int j = 0; j < 3; j ++) {
				suma += matriz[i][j];
			}
		}
		System.out.println("La suma de esta matriz es: " + suma);
	}
	
	public static void matrizTranspuesta() {
		Scanner sc = new Scanner (System.in);
		
		int matriz [][] = new int [3][3];
		
		System.out.println("Escribe la Matriz de 3 filas 3 columnas");
		
		for (int i = 0; i < 3; i ++) {
			for (int j = 0; j < 3; j ++) {
				System.out.print("Matriz ["+i+"]["+j+"] ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nMatriz original: ");
		for (int i = 0; i < 3; i ++) {
			for (int j = 0; j < 3; j ++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		//Transponiendon la matriz 
		int aux;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i; j ++) {
				aux = matriz[i][j];
				matriz[i][j] = matriz[j][i];
				matriz[j][i] = aux;
			}
		}
		System.out.println("\nLa matriz transpuesta es: ");
		for (int i = 0; i < 3; i ++) {
			for (int j = 0; j < 3; i ++ ) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void matriz7x7() {
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int [7][7];
		
		System.out.println("\nEscribe la Matriz\n");
		for (int i = 0; i < 7; i ++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("Matriz: [" + i + "][" + j +"] ");
				matriz [i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < 7; i ++) {
			for (int j = 0; j < 7; j++) {
				matriz[i][j] = 0;
				matriz[0][j] = 1;
			}
		}
		System.out.println("\nMatriz: ");
		for (int i = 0; i < 7; i ++) {
			for (int j = 0; j < 7; j ++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public static void sumaColumnaAndSumaFila() {
		Scanner sc = new Scanner(System.in);  
		
		System.out.print("Escribe cuantas filas quieres en la matriz: ");
		int nFilas = sc.nextInt();
		System.out.print("Escribe cuantas columnas quieres en la matriz: ");
		int nColumnas = sc.nextInt();
		
		int matriz[][] = new int [nFilas][nColumnas];
		
		System.out.println("\nEscribe la Matriz: /n");
		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nColumnas; j++) {
				System.out.print("Matriz ["+ i +"]["+ j +"]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nLa Matriz es: ");
		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nColumnas; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
		
		//SUMA DE FILAS
		int sumaFilas, sumaColum;
		for (int i = 0; i < nFilas; i++) {
			sumaFilas = 0;
			for (int j = 0; j < nColumnas; j++) {
				sumaFilas = matriz[i][j];
			}
			System.out.print("La suma de las filas ["+i+"] es: " +sumaFilas );
		}
		System.out.println(" ");
		
		//SUMA COLUMNAS
		for (int j = 0; j < nFilas; j++) {
			sumaColum = 0;
			for (int i = 0; i < nColumnas; i++) {
				sumaColum = matriz[i][j];
			}
			System.out.print("La suma de las filas ["+j+"] es: " +sumaColum );
		}
		System.out.println(" ");
	}

}


