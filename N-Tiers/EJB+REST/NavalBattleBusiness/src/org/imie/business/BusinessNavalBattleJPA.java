package org.imie.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Joueur;

@Stateless(name="jpa")
public class BusinessNavalBattleJPA implements IBusinessNavalBattle {

	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Joueur> getListJoueur() {
		List<Joueur> joueurs = em.createNamedQuery("Joueur.findAll").getResultList();
		return joueurs;
	}

}
