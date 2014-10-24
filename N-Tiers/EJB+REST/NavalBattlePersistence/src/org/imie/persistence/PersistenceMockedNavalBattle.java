package org.imie.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import model.Joueur;

/**
 * 
 */

/**
 * @author imie
 *
 */
@Named("mock")
public class PersistenceMockedNavalBattle implements IPersistenceNavalBattle {

	/* (non-Javadoc)
	 * @see org.imie.persistence.IPersistenceNavalBattle#getAllJoueurs()
	 */
	@Override
	public List<Joueur> getAllJoueurs() {
		List<Joueur> joueurs=new ArrayList<Joueur>();
		Joueur j1 = new Joueur();
		j1.setPseudo("toto");
		joueurs.add(j1);
		Joueur j2 = new Joueur();
		j2.setPseudo("tata");
		joueurs.add(j2);
		return joueurs;
	}

}
