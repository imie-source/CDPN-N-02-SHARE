package org.imie.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

import model.Joueur;

import org.imie.model.JoueurDTO;
import org.imie.persistence.IPersistenceNavalBattle;

@Stateless(name="classic")
public class BusinessNavalBattle implements IBusinessNavalBattle {

	@Inject
	@Named("mock")
	IPersistenceNavalBattle persistenceNavalBattle;

	
	
	@Override
	public List<Joueur> getListJoueur() {
		
		
		List<Joueur> joueurs = new ArrayList<Joueur>();

		joueurs=persistenceNavalBattle.getAllJoueurs();
		
		
		return joueurs;
	}

}
