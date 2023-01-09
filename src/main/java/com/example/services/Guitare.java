package com.example.services;


public class Guitare {

	private String nom;
	
	public Guitare() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Guitare(String nom) {
		this.nom = nom;
	}



	public String nomGuitare() {
		// TODO Auto-generated method stub
		return "Avec sa nouvelle guitare électrique";
	}



	@Override
	public String toString() {
		return  nom ;
	}

}
