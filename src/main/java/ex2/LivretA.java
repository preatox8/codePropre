package ex2;

/** Classe disposant des éléments d'un Livret A
 * @author ETY2
 *
 */
public class LivretA extends CompteBancaire {
	
	/** taux de rémunération du livret A */
	protected double tauxRemuneration;
	
	/**
	 * @param type paramètre type 
	 * @param solde paramètre solde
	 * @param tauxRemuneration paramètre tauxRemuneration
	 */
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public void appliquerRemuAnnuelle(){
		this.solde = solde + solde*tauxRemuneration/100;
	}

	
	public void debiterMontant(double montant){
		if (this.solde - montant > 0){
			this.solde = solde - montant;
		}	
	}
	
	
}
