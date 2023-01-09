package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Guitariste implements IMusicien {

	private String nom;
	
	public Guitariste() {
	}

	@Autowired
	private Guitare guitare;

	public String jouerGuitare() {

		return  this.nom +  "  joue de la musique  ";
	}

	public String instrument() {
		return("avec sa guitare " + this.guitare);
	}

	public Guitariste(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Guitariste [nom=" + nom + "]";
	}

	
}
