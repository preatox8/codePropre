package ex2;

/** Repr�sente un compte bancaire de type compte courant (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {
	

	/** solde du compte */
	protected double solde;
	
	/** un d�couvert est autoris� seulement pour les comptes courants */
	protected double decouvert;

	
	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	protected String type;
	
	
	
	/** Ce constructeur est utilis� pour cr�er un compte de type Livret A
	 * @param type = LA
	 * @param solde repr�sente le solde du compte
	 * @param decouvert  repr�sente le d�couvert autoris�
	 */
	public CompteBancaire(String type, double solde, double decouvert) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** R�duit le solde du compte selon le montant et le type de ce dernier
	 * @param montant
	 */
	public abstract void debiterMontant(double montant);

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
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


	public void appliquerRemuAnnuelle() {
		
		
	}
	
	
	
}
