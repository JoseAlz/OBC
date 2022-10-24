package Ejercicio9;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente(120000, 19, "Maria", "15-789-789");
		Cliente cliente2 = new Cliente(160000, 25, "Juan", "15-777-789");
		Cliente cliente3 = new Cliente(220000, 32, "Virna", "15-888-789");
	
		System.out.println("El credito del cliente es: " + " " + cliente1);
		System.out.println("El credito del cliente es: " + " " + cliente2);
		System.out.println("El credito del cliente es: " + " " + cliente3);
		
		
		Trabajador trab1 = new Trabajador(140000, 25, "Paulo",  "15-456456");
		Trabajador trab2 = new Trabajador(320000, 25, "Karla",  "15-456478");
		Trabajador trab3 = new Trabajador(180000, 25, "Paola",  "15-456336");


		System.out.println("El Salario del trabajador es :" + " " + trab1);
		System.out.println("El Salario del trabajador es :" + " " + trab2);
		System.out.println("El Salario del trabajador es :" + " " + trab3);
		

	}

}
