package POOPersona;

public class Persona {
	//Atributos
	String name;
	int edad;
	String curp;
	
	//Constructor 
	public Persona(String name, int edad) {
		super();
		this.name = name;
		this.edad = edad;
	}

	public Persona(String curp) {
		this.curp = curp;
	} 
	
	public void correr() {
		System.out.println("Eres: " + name + " y estas corriendo una maraton a la edad de: " + edad);
	}
	
	public void correr (int km) {
		System.out.println("He corrido: " + km + "km");
	}
}
