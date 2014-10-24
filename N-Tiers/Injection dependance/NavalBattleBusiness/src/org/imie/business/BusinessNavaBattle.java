package org.imie.business;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.imie.model.JoueurDTO;
import org.imie.persistence.IPersistenceNavalBattle;


public class BusinessNavaBattle implements IBusinessNavalBattle {

	@Inject
	@Named("mock")
	IPersistenceNavalBattle persistenceNavalBattle;
	
	@Override
	public List<JoueurDTO> getListJoueur() {
		
		
		List<JoueurDTO> joueurs = new ArrayList<JoueurDTO>();

		joueurs=persistenceNavalBattle.getAllJoueurs();
		
		return joueurs;
	}

}
