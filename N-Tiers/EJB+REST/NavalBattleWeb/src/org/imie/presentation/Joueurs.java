package org.imie.presentation;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Joueur;

import org.imie.business.IBusinessNavalBattle;

/**
 * Servlet implementation class Joueurs
 */
@WebServlet("/Joueurs")
public class Joueurs extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB(beanName="jpa")
	private IBusinessNavalBattle businessNavalBattle;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Joueurs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Joueur> joueurs = businessNavalBattle.getListJoueur();
		request.setAttribute("joueurs", joueurs);
		request.getRequestDispatcher("/WEB-INF/joueurs.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
