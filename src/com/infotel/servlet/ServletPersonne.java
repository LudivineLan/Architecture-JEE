package com.infotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotel.metier.Personne;
import com.infotel.service.Iservice;
import com.infotel.service.ServiceImpl;

/**
 * Servlet implementation class ServletPersonne
 */
@WebServlet("/ServletPersonne")
public class ServletPersonne extends HttpServlet {
	
	//on declare un attribut Iservice qui nous permet d'appeler la couche service
	private Iservice service = new ServiceImpl();
	
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletPersonne() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1-recuperation des informations
		int id = Integer.parseInt(request.getParameter("id"));
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		int age = Integer.parseInt(request.getParameter("age"));
		
		//2-envoyer à la couche service
		// on crée une personne et on recupere les donnees avec les setters
		Personne p = new Personne();
		p.setId(id);
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setAge(age);
		
		//on appelle la methode de la couche service pour l'envoyer à la couche service qui va ensuite l'inserer à la BDD
		String message = service.CreerPersonne(p);
		
		// 3- preparation à l'envoi
		request.setAttribute("message", message);
		
		//4- appel de la jsp
		request.getRequestDispatcher("resultat.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
