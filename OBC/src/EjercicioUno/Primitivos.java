package EjercicioUno;

public class Primitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		int a = 10;
		double b = 10.0;
		float c = (float) (40000*a/b + 20);
		
		String numero = "uno";
		String numeroDos = "dos";
		String numeroTres = "tres";
		
		System.out.println("El" +" " + numero +" es igual a "+ numeroDos + " = " +(numero == numeroDos));     
	    System.out.println( "El" +" " +numeroTres + " es igual a " +numeroDos + " = " +  (numeroTres== numeroDos));   
	    System.out.println( "El" + " " + numero + " es igual a " + numeroDos +  " = " + ( numero.equals(numeroDos)));  
	    System.out.println( "El" + " " + numeroTres + " es igual a "+ numeroDos +  " = " +( numeroTres.equals(numeroDos))); 
	    
	    System.out.println("\n");
		
		
		System.out.println("Valor en formato float: " + c);
        System.out.println("Valor en formato double: " + (double) c);
        System.out.println("Valor en formato byte: " + (byte) c);
        System.out.println("Valor en formato short: " + (short) c);
        System.out.println("Valor en formato int: " + (int) c);
        System.out.println("Valor en formato long: " + (long) c);
		

	}

}
