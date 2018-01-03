package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {
	
	protected List<Animal> animaux;
	
	public Zone() {
		this.animaux = new ArrayList<>();
	}
	
	/**
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		this.animaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animaux: animaux){
			System.out.println(animaux.getNom() + " -> " + animaux.getType() + " -> " + animaux.getComportement());
		}
	}
	
	/**
	 * @return
	 */
	public int compterAnimaux(){
		return animaux.size();
	}
	
	/**
	 * @return
	 */
	public abstract double calculerKgsNourritureParJour();

}
