package Ejercicio9;

public class Trabajador extends Persona{
	
	private int salario;
	
	
	public Trabajador() {
		
	}
	
	public Trabajador(int salario, int edad, String nombre, String telefono ) {
		super(edad, nombre, telefono);
		this.salario = salario;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Trabajador [salario=" + salario + ", edad=" + edad + ", nombre=" + nombre + ", telefono=" + telefono
				+ "]";
	}

	
	}
	
