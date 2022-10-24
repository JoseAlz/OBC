package Ejercicio9;

public class Cliente extends Persona {
	
	//variable
private int credito;
 
//constructor
public Cliente(int credito, int edad, String nombre, String telefono) {
	super(edad, nombre, telefono);
	this.credito = credito;
}

//getters and setters

public double getCredito() {
	return credito;
}


public void setCredito(double credito) {
	this.credito = (int) credito;
}

//consola
@Override
public String toString() {
	return "Cliente [credito=" + credito + ", edad=" + edad + ", nombre=" + nombre + ", telefono=" + telefono + "]";
}






}
