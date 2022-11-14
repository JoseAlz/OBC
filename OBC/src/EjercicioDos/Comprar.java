package EjercicioDos;

import java.util.Scanner;

public class Comprar {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int precio, resultado;

		System.out.print("Introduce un precio \n");
		precio = sc.nextInt();

		resultado = factura(precio);

		System.out.println("El precio del producto mas el iva es: " + resultado);

	}

	// iva 21 % Argentina
	/*
	 * Tanto los métodos como las funciones, son funcionalmente idénticos, la
	 * diferencia entre un método y una función es que el método está
	 * indefectiblemente asociado a un objeto para poder existir y la función no
	 * precisa de un objeto.
	 */
	public static int factura(int a) {
		double facturacion = (a * 1.21);
		return (int) facturacion; // casting de double a int
	}

}
