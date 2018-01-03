package ex3;

/** Classe d�taillant les caract�ritiques des animaux
 * @author ETY2
 *
 */
public class Animal {
	
	protected String nom;
	protected String type;
	protected String comportement;
	
	/**
	 * @param nom param�tre nom
	 * @param type param�tre type
	 * @param comportement param�tre comportement
	 */
	public Animal(String nom, String type, String comportement) {
		super();
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the comportement
	 */
	public String getComportement() {
		return comportement;
	}

	/**
	 * @param comportement the comportement to set
	 */
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}
	
	
}
