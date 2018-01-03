package ex2;

/** Classe disposant des �l�ments d'un compte courant
 * @author ETY2
 *
 */
public class CompteCourant extends CompteBancaire{

	
	
	/**
	 * @param type param�tre type de compte
	 * @param solde param�tre solde du compte
	 * @param decouvert param�tre d�couvert du compte
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
