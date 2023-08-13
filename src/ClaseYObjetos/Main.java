package ClaseYObjetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Operacion op = new Operacion();
		
		System.out.print("Escribe el primer numero: ");
		int first = sc.nextInt();
		System.out.print("Escribe el segundo numero: ");
		int second = sc.nextInt();
		
		int sum = op.sumar(first, second);
		int rest = op.restas(first, second);
		int mul = op.multiplicacion(first, second);
		int div = op.division(first, second);
		op.mostrarRes(sum, rest, mul, div);
	}

}
