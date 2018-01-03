package ex3;

/**
 * Classe présentant les différents animaux
 * 
 * @author ETY2
 *
 */
public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine = new SavaneAfricaine();
	private ZoneCarnivore zoneCarnivore = new ZoneCarnivore();
	private FermeReptile fermeReptile = new FermeReptile();
	private Aquarium aquarium = new Aquarium();

	/**
	 * @param nom
	 *            paramètre nom
	 */
	public Zoo(String nom) {
		this.nom = nom;
	}

	/**
	 * Méthode d'ajout d'un animal
	 * 
	 * @param typeAnimal
	 *            paramètre type de l'animal
	 * @param nomAnimal
	 *            paramètre nom de l'animal
	 * @param comportement
	 *            paramètre comportement de l'animal
	 */
	public void addAnimal(Animal animal) {
		if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("CARNIVORE")) {
			zoneCarnivore.addAnimal(animal);
		} else if (animal.getType().equals("MAMMIFERE") && animal.getComportement().equals("HERBIVORE")) {
			savaneAfricaine.addAnimal(animal);
		} else if (animal.getType().equals("REPTILE")) {
			fermeReptile.addAnimal(animal);
		} else if (animal.getType().equals("POISSON")) {
			aquarium.addAnimal(animal);
		}
	}

	/**
	 * Méthode pour afficher la liste des animaux
	 * 
	 */
	public void afficherListeAnimaux() {
		zoneCarnivore.afficherListeAnimaux();
		savaneAfricaine.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter for nom
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
