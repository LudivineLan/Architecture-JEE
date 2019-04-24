package com.infotel.service;

import java.util.List;

import com.infotel.dao.DaoImpl;
import com.infotel.dao.Idao;
import com.infotel.metier.Personne;

public class ServiceImpl implements Iservice {
 
	//déclarer un attribut Idao permet d'appeler la couche dao
	private Idao dao = new DaoImpl();
	@Override
	public String CreerPersonne(Personne p) {
		return dao.CreerPersonne(p);

	}

	@Override
	public Personne modifier(Personne p) {
		return dao.modifier(p);
	}

	@Override
	public void supprimer(Personne p) {
		dao.supprimer(p);

	}

	@Override
	public List<Personne> lister() {
		return dao.lister();
	}

}
