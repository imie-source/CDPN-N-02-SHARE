package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "joueur" database table.
 * 
 */
@Entity
@Table(name="joueur")
@NamedQuery(name="Joueur.findAll", query="SELECT j FROM Joueur j")
public class Joueur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="pseudo")
	private String pseudo;

	public Joueur() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPseudo() {
		return this.pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

}