package ex3;

import java.util.ArrayList;
import java.util.List;

/** Classe mère des différentes zones
 * 
 * @author ETY2
 *
 */
public abstract class Zone {

	protected List<Animal> animaux;

	public Zone() {
		this.animaux = new ArrayList<>();
	}

	/**
	 * @param animal
	 *            Objet animal
	 */
	public void addAnimal(Animal animal) {
		this.animaux.add(animal);
	}

	/**
	 * Méthode d'affichage de la liste des animaux
	 */
	public void afficherListeAnimaux() {
		for (Animal animaux : animaux) {
			System.out.println(animaux.getNom() + " -> " + animaux.getType() + " -> " + animaux.getComportement());
		}
	}

	/**
	 * @return
	 */
	public int compterAnimaux() {
		return animaux.size();
	}

	/**
	 * @return
	 */
	public abstract double calculerKgsNourritureParJour();

}
