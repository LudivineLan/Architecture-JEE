package com.infotel.dao;

import java.util.List;

import com.infotel.metier.Personne;

public class DaoImpl implements Idao {

	@Override
	public String CreerPersonne(Personne p) {
		// TODO Auto-generated method stub
		System.out.println("Je cr�e la personne");
		System.out.println(p);
		
		return "La personne"+" "+p.getNom()+" "+p.getPrenom()+" a bien �t� ajout�";
	}

	@Override
	public Personne modifier(Personne p) {
		// TODO Auto-generated method stub
		System.out.println("Je modifie la personne");
		return null;
	}

	@Override
	public void supprimer(Personne p) {
		// TODO Auto-generated method stub
		System.out.println("Je supprime la personne");

	}

	@Override
	public List<Personne> lister() {
		// TODO Auto-generated method stub
		System.out.println("Je liste les personnes");
		return null;
	}

}
