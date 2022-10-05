package tema4;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1 Usando un if, crear una condición que compare si la variable numeroIf es
		 * positivo, negativo, o 0. Pista: Los números inferiores a 0 son negativos y
		 * los superiores, positivos.
		 */

		var numeroIf = -3;

		if (numeroIf > 0)
			System.out.println("El numero es positivo\n");
		else if (numeroIf < 0)
			System.out.println("El numero es negativo\n");
		else
			System.out.println("El numero es cero\n");

		/*
		 * 2 Crea un bucle While, este bucle tendrá que tener como condición que la
		 * variable numeroWhile sea inferior a 3, el bloque de código que tendrá el
		 * bucle deberá:
		 * 
		 * Incrementar el valor de la variable en uno cada vez que se ejecute.
		 * 
		 * Mostrarlo por pantalla cada vez que se ejecute.
		 */

		int numeroWhile = 0;// inicializo la variable de control

		while (numeroWhile < 3) {// condicion a evaluar

			System.out.println("numeroWhile" + " " + numeroWhile);

			numeroWhile++; // contador
		}

		// 2b Do while

		int numeroDoWhile = 0;// inicializo la variable de control

		do {
			System.out.println("numeroDoWhile" + " " + numeroDoWhile);
			numeroDoWhile++;// contador

		} while (numeroDoWhile < 3);// condicion a evaluar

		/*
		 * Para el bucle For, crea una variable numeroFor, esta variable tendrá como
		 * valor 0 y su condición será que la variable sea igual o menor que 3, se irá
		 * incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por
		 * pantalla.
		 */
		
		var numeroFor = 0;
		for (; numeroFor < 3; numeroFor++) {
			System.out.println("El valor de numeroFor es: " + numeroFor);
		}
		/*
		 * para el Switch, deberás crear la variable estacion, y distintos case para las
		 * cuatro estaciones del año. Dependiendo del valor de la variable estacion se
		 * deberá mandar un mensaje por consola informando de la estación en la que
		 * está. También habrá que poner un default para cuando el valor de la variable
		 * no sea una estación.
		 */
		
        int valor = 3;
		var estacion  = " ";
		
		switch(valor){
		case 1:
			estacion = "Otoño";
			break;//sale del switch
		case 2:
			estacion  = "Invierno";
			break;
		case 3:
			estacion = "Primavera";
			break;
		case 4:
			estacion = "Verano";
			break;
		default:
			estacion = "No existe esta estacion";
			
		}
		System.out.println("La estacion del año en que estamos es: " + estacion);
		
	}

}
