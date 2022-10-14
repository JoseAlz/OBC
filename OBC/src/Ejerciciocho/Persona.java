package Ejerciciocho;

public class Persona {
	
	private int edad;
	private String nombre;
	private String telefono;
	
	public Persona() {
		
	}
	
	public Persona(int edad, String nombre, String telefono) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Persona persona1 = new Persona(25, "Lujan", "15-999-999");
		Persona persona2 = new Persona(19, "Horacio","15-767-987");
		Persona persona3 = new Persona(18, "Jorge", "15-564-564");
		Persona persona4 = new Persona(20, "Maria", "15-545-634");
		Persona persona5 = new Persona(16, "Fernanda", "15-345-345");
		
		System.out.println("Persona1: " + persona1);
		System.out.println("Persona2: " +  persona2);
		System.out.println("Persona3: " + persona3);
		System.out.println("Persona4: " +  persona4);
		System.out.println("Persona5: " + persona5);
		

	}

}
