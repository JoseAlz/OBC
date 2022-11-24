package EjercicioTres;

import java.util.Arrays;
import java.util.Scanner;

public class Concatenar {

	public static void main(String[] args) {


	

			// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			//System.out.println("Bienvenido!, ingrese un nombre : ");
			//String textoIngresado = sc.nextLine();
			

			String[] nombres1 = new String[5];
			String[] nombres2 = new String[5];
			
			int contador;
			contador = 1;
			while (contador <= 2) {
				contador++;	
				
				System.out.println("Bienvenido!, ingrese un nombre : ");
				String textoIngresado = sc.nextLine();
					
				
			System.out.println("Ingrese texto al primer array: ");
			for (int i = 0; i < nombres1.length; i++) {
				nombres1[i] = sc.nextLine();// reads elements from the user	
				
			}
			
			System.out.println("Ingrese texto al segundo array: ");
			for (int i = 0; i < nombres2.length; i++) {
				nombres2[i] = sc.nextLine();// reads elements from the user	
				
			}
			
			System.out.println("Se ingreso texto de:" + " " + textoIngresado);
			concatenaArray(nombres1, nombres2);
		}
	}
	public static String[] concatenaArray(String[] a, String []b){
		   
		 String[] palabra = new String[a.length + b.length];
		 
		 int i = 0;
		    for (i = 0; i < a.length; i++ ){
		        palabra[i] = a[i];

		    }

		    for (int j = 0; j < b.length; j++ ){

		        palabra[i] = b[j];
		        i++;
		    }
		    System.out.println(Arrays.toString(palabra));
			return palabra;
		 
  }

}
