package ex2;

/** Classe disposant des éléments d'un compte courant
 * @author ETY2
 *
 */
public class CompteCourant extends CompteBancaire{

	
	
	/**
	 * @param type paramètre type de compte
	 * @param solde paramètre solde du compte
	 * @param decouvert paramètre découvert du compte
	 */
	public CompteCourant(String type, double solde, double decouvert) {
		super(type, solde, decouvert);
	}
	
	public void debiterMontant(double montant){
		if (this.solde - montant > decouvert){
			this.solde = solde - montant;
		}	
	}
}
