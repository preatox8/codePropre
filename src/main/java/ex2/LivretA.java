package ex2;

/** Classe disposant des �l�ments d'un Livret A
 * @author ETY2
 *
 */
public class LivretA extends CompteBancaire {
	
	/** taux de r�mun�ration du livret A */
	protected double tauxRemuneration;
	
	/**
	 * @param type param�tre type 
	 * @param solde param�tre solde
	 * @param tauxRemuneration param�tre tauxRemuneration
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
