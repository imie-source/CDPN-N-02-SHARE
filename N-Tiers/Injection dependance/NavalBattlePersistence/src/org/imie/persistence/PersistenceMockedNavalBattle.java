package org.imie.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.imie.model.JoueurDTO;
import org.imie.persistence.IPersistenceNavalBattle;

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
	public List<JoueurDTO> getAllJoueurs() {
		List<JoueurDTO> joueurs=new ArrayList<JoueurDTO>();
		JoueurDTO j1 = new JoueurDTO();
		j1.setPseudo("toto");
		joueurs.add(j1);
		JoueurDTO j2 = new JoueurDTO();
		j2.setPseudo("tata");
		joueurs.add(j2);
		return joueurs;
	}

}
