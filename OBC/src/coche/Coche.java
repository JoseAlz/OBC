package coche;

public class Coche {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		//creo un objeto 
		Auto car = new Auto();
		
		//Con el objeto creado llamo al metodo nPuertas
		car.nPuertas();
		car.nPuertas();
		car.nPuertas();
		car.nPuertas();
		
		//Salida por terminal , consola 
		System.out.println(car.puertas);
		
	}
}   //otra clase en el mismo paquete
	class Auto {
		
		//Inicializo puertas
		int puertas = 0;
		
		// metodo 
		public void nPuertas()
		{
		//postincremento 	
		this.puertas++;
			
		}
	}

  

	