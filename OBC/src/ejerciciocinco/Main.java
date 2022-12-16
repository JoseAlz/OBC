package com.ejerciciocinco;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CocheCRUDImpl cocheCrud = new CocheCRUDImpl();
		cocheCrud.save();

		cocheCrud.findAll();
		
		cocheCrud.delete();
	}

}
