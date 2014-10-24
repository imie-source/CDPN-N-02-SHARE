package org.imie.presentation;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import model.Joueur;

import org.imie.business.IBusinessNavalBattle;

@Stateless
@Path("/navalBattleWebService")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class NavalBattleWebService {
	
	@EJB(beanName="jpa")
	private IBusinessNavalBattle businessNavalBattle;
	
	@GET
	public Response getJoueurs(){
		List<Joueur> retour = businessNavalBattle.getListJoueur();
		return Response.ok(retour).build();
	}

}
