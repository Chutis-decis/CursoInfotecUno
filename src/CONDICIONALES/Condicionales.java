package CONDICIONALES;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Condicionales {

	public static void main(String[] args) {
		EdadesAlturas();

	}
	public static void Multiplo10() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Dogite un numero"));

        if (numero % 10 == 0){
            JOptionPane.showMessageDialog(null, "Es multiplo de 10");
        }else{
            JOptionPane.showMessageDialog(null, "No es multiplo de 10");
        }
	}
	
	public static void Obreros() {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es el nombre del obrero:");
        String name = scanner.nextLine();

        int salario;

        System.out.println("Ingresa el numero de horas trabajadas en la semana");
        int noHorasTrabajo = scanner.nextInt();



        if (noHorasTrabajo <= 40 && noHorasTrabajo > 0){
            salario = noHorasTrabajo * 16;
            System.out.println("salario de " +name + " es " + salario);
        }else{
            salario = (40*16) + ((noHorasTrabajo - 40) * 20);
            System.out.println("salario de " + name + " es " + salario);
        }
	}
	
	public static void mayorQue() {
		int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero"));

        if(num1 > num2) {
            JOptionPane.showMessageDialog(null, "El numero: " + num1 + " Es mas grande que el numero" + num2);

        } else if (num2 > num1) {
            JOptionPane.showMessageDialog(null, "El numero: " + num2 + " Es mas grande que el numero" + num1);
        }else{
            JOptionPane.showMessageDialog(null, "NUMERACION " );

        }
	}
	
	public static void numerosImpares() {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Dame el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("Dame el segundo numero");
        int numero2 = scanner.nextInt();

        if (numero1 % 2 == 0 && numero2 % 2 == 0) {
            System.out.println("Son pares");
        }else if(numero1 % 2 == 1 && numero2 % 2 == 1){
            System.out.println("Son impares");
        }else if(numero1 % 2 == 0 && numero2 % 2 == 1){
            System.out.println("El primer numero es par y el segundo impar");
        } else if (numero1 % 2 ==1 && numero2 % 2 == 0) {
            System.out.println("El primer numero en impar y el segundo par");
        }
	}

	public static void Fecha() {
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el día"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite el año"));

        if (dia >= 1 && dia <= 30){
            if(mes > 0 && mes <13){
                JOptionPane.showMessageDialog(null,"Fecha correcta " + dia + "/" + mes + "/" + ano);
            }else{
                JOptionPane.showMessageDialog(null, "mes incoorrecto");
            }
        }else{
            JOptionPane.showInternalMessageDialog(null, "La fecha es incorrecta, dia incorrecto");
        }
	}

	public static void Fecha2() {
		int day = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia"));
        int month = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
        int year = Integer.parseInt(JOptionPane.showInputDialog("Digite el año"));

        if((day > 1 && day <31) || (day <29) || (day < 32)){
            if(month > 1 && month < 13){
                if (year > 0){
                    JOptionPane.showMessageDialog(null, "Fecha correcta " + day + "/" + month+"/"+year);
                }else{
                    JOptionPane.showMessageDialog(null, "Digita un año que sea mayor que cero");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Digita un valor valido para el mes");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Digita un dia del mes");
        }
	}

	public static void Calculadora() {
		int sum, res, mul, div;

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el siguiente numero"));

        char parametro = JOptionPane.showInputDialog("Digite la operacion que desea realizar ").charAt(0);

        switch (parametro) {
            case 's':
            case 'S':
                sum = numero1 + numero2;
                JOptionPane.showInternalMessageDialog(null, "La suma es:  " + sum);
                break;
            case 'r':
            case 'R':
                res = numero1 - numero2;
                JOptionPane.showInternalMessageDialog(null, "La resta es: " + res);
                break;
            case 'm':
            case 'M':
                mul = numero1 * numero2;
                JOptionPane.showInternalMessageDialog(null, "La multiplicacion es: " + mul);
                break;

            case 'd':
            case 'D':
                div = numero1 / numero2;
                JOptionPane.showInternalMessageDialog(null, "La division es: " + div);
                break;
            default:
                JOptionPane.showInternalMessageDialog(null, "Error, se equivoco al asignar la letra");
        }
	}

	public static void Calificacion() {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Dame tu calificacion de los zapatos");
        int calificacion = scanner.nextInt();

        if (calificacion == 10 && calificacion >=8 ){
            System.out.println("Los zapatos estan preciosos");
        }else if(calificacion < 8 && calificacion >=5){
            System.out.println("Los zapatos estan insuficientes");
        }else if(calificacion < 5 && calificacion >= 0){
            System.out.println("Los zapatos estan feos");
        }else{
            System.out.println("Digita un numero entre el 0 y el 10");
        }
	}

	public static void NumeroAlCuadrado() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();

        while ( numero >= 0 ){
            System.out.println("Su cuadrado es: " + (int)Math.pow(numero, 2));
            System.out.print("Introduce otro numero: ");
            numero = scanner.nextInt();
        }
        System.out.println("Terminando el codigo!!!");
	}
	
	public static void PositivoNegativo() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();
        while(numero != 0){
            if(numero > 0){
                System.out.println("El numero: " + numero + " es positivo");
            }else if (numero < 0){
                System.out.println("El numero: " + numero + " es negativo");
            }
            System.out.print("Introduce un numero nuevamente: ");
            numero = scanner.nextInt();
        }
        System.out.println("El programa acaba de terminar");
	}
	
	public static void ParImpar() {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero...");
        int numero = scanner.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("Numero par es el: " + numero);
            }else if (
                    numero % 2 == 1) {
                System.out.println("Numero impar es el: " + numero);
            }
            System.out.println("Introduce otro numero: ");
            numero = scanner.nextInt();
        }
        System.out.println("Terminando la ejecucion");
	}
	
	public static void numerosIntroducidos() {
		Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        int numero = sc.nextInt();

        int contador = 0;

        while(numero > 0){
            System.out.println("Haz introducido el numero: " + numero);
            System.out.println("Introduce otro numero: ");
            numero = sc.nextInt();
            contador ++;

        }
        System.out.println("Introduciste: " + contador + " numeros");
	}
	
	public static void numerosAleatorios() {
		int numero, aleatorio, contador = 0;
        Scanner sc = new Scanner(System.in);

        aleatorio = (int)(Math.random()*100);

        do{
            System.out.println("Digita un numero");
            numero = sc.nextInt();

            if(aleatorio > numero){
                System.out.println("Digita un numero mayor");
            }else{
                System.out.println("Digite un numero menor");
            }
            contador ++;
        }while(numero != aleatorio);

        System.out.println("\nAdivinaste el numero!! en " + contador + " intentos");
	}
	
	public static void sumaAllNumbers() {
		Scanner sc = new Scanner (System.in);
        int numero, suuma = 0;
        do{
            System.out.println("Digita un numero ");
            numero = sc.nextInt();
            suuma += numero;
        }while (numero != 0);

        System.out.println("La suma de los numeros es: " + suuma);
	}

	public static void media() {
		Scanner scanner = new Scanner(System.in);

        int numero = 0, elemntos = 0, suma = 0;
        float media;
        System.out.println("Introduzca un numero: ");
        numero = scanner.nextInt();

        while (numero >= 0){
            suma+= numero;
            elemntos ++;
            System.out.println("Digita otro numero: ");
            numero = scanner.nextInt();
        }
        if (elemntos == 0){
            System.out.println("Error la division entre cero no esxiste");
        }else{
            media = (float) suma / elemntos;
            System.out.println("La media es: " + media);
        }
	}
	
	public static void numeracionAlScanner() {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        for(int i = 0; i <= numero; i++) {
            System.out.println(i);
        }
	}

	public static void cienAlCero() {
		int numero = 0;

        for (int i = 100; i >= numero; i--) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
	}
	
	public static void sumaDiezNumeros() {
		Scanner scanner = new Scanner(System.in);
		int contador = 1, suma = 0;
        System.out.print((contador) + ". Escrribe 10 numeros: ");
        int number = scanner.nextInt();
        while(contador >0 && contador < 11){
            System.out.print((contador + 1) + ". Siguiente numero: ");
            number = scanner.nextInt();
            suma += number;
            contador++;
        }
        System.out.println("La suma total de todos los numeros que ingresaste fue: " + suma);
	}

	public static void numerosImpares2() {
		long producto = 1;

        for (int i = 1; i <= 20; i+=2) {
            producto *= i;
        }
        System.out.println("El producto de numeros immpares es: " + producto);
	}
	
	public static void factorial() {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int numero = scanner.nextInt();
        int factorial = 1, i = 1;
        for (i = 2; i<=numero; i++) {
        	factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
	}
	
	public static void sueldos() {
		Scanner scanner = new Scanner(System.in);
        int sueldos, suma = 0, conta = 0;
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Ingresa los 10 sueldos");
            sueldos = scanner.nextInt();

            suma += sueldos;

            if (sueldos > 1000){
                conta ++;
            }
        }
        System.out.println("La suma es: " + suma);
        System.out.println("La cantidad de  mayores de $1000 son: " + conta);
	}
	
	public static void EdadesAlturas() {
		Scanner sc = new Scanner(System.in);
        int edad, suma_edad = 0, conteoMayor18 = 0, conteoMayos170 = 0;
        float altura, sumaAltura = 0, medianEdad = 0, mediaAltura = 0;

        for (int i = 0; i < 6; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno"+i+"Digite su edad"));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Altura"+i+"Digite su altura"));

            suma_edad+= edad;
            sumaAltura+= altura;

            if (edad > 18){
                conteoMayor18 ++;
            }
            if(altura > 1.75){
                conteoMayos170 ++;
            }
        }
        medianEdad = (float) suma_edad/5;
        mediaAltura = sumaAltura/5;

        System.out.println("La edad promedio es: " +medianEdad);
        System.out.println("La estatura promedio es: " +mediaAltura);
        System.out.println("Cantidad de alumnos matores a 18 años: " +conteoMayor18);
        System.out.println("Cantidad de alumnos que miden mas de 1.75: " +conteoMayos170);
	}
	
	public static void tablaMultiplicar() {
		Scanner scanner = new Scanner(System.in);

        int mult = 0;
        System.out.println("Dame un numero enntre el 0 y el 10");
        int numero = scanner.nextInt();
        System.out.println("La tabla de multiplicar es la siguiente: ");
        for (int i = 1; i<= 10; i++) {
            mult = i * numero;
            System.out.println(i + " x " + numero + " = " + mult);
        }
	}
	
	public static void Facturas() {
		Scanner scanner = new Scanner(System.in);

        int codigo, litros, litrosArticulo1 = 0, conteoMas600 = 0;
        float precioLitro, importeFactura, facturacionTotal = 0;

        for (int i = 1; i < 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo #"+i+"Digite el codigo"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo #"+i+"Digite la cantidad de litros"));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo #"+i+"Digite el precio por litro "));
            importeFactura = (float) litros * precioLitro;
            facturacionTotal += importeFactura;

            if (codigo == 1){
                litrosArticulo1 += litros;
            }
            if (importeFactura > 600){
                conteoMas600 ++;
            }
        }
        System.out.println("RESUMEN DE VENTAS ");
        System.out.println("Facturaion total: " +facturacionTotal);
        System.out.println("Cantidad de litros vendidos en el articulo 1: " +litrosArticulo1);
        System.out.println("Cantidad de facturas de 600 dolares " +conteoMas600);
	}

	public static void Notas() {
		float nota;
        int aprobado = 0, condicionados = 0, suspensos = 0;

        for (int i = 1; i <= 6; i++) {
            do {
                nota = Float.parseFloat(JOptionPane.showInputDialog("Escribe la nota obtenida"));
            }while (nota < 0 || nota > 10);
            if(nota == 5){
                condicionados++;
            }else if(nota > 5){
                aprobado ++;
            }else {
                suspensos++;
            }
        }
        System.out.println("Cantidad de aprobados: " + aprobado);
        System.out.println("Cantidad de reprobados: " + condicionados);
        System.out.println("Cantidad de suspendnos " + suspensos);
	}
}
