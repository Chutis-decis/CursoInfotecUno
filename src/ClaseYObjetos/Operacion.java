package ClaseYObjetos;

import java.util.Scanner;

public class Operacion {
	
	Scanner sc = new Scanner(System.in);
	
	//Atributos
	
	//Metodo
	
	public int sumar(int numero1, int numero2) {
		int suma = numero1 + numero2;
		return suma;
	}
	public int restas(int numero1, int numero2) {
		int resta = numero1 - numero2;
		return resta;
	}
	public int multiplicacion(int numero1, int numero2) {
		int mult = numero1 * numero2;
		return mult;
	}
	public int division(int numero1, int numero2) {
		int div = numero1 / numero2;
		return div;
	}
	public void mostrarRes(int suma, int resta, int mult, int div) {
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicacion es: " + mult);
		System.out.println("La division es: " + div);
	}
}
