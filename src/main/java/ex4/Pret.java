package ex4;

import java.util.Date;

public class Pret {

	private double capital;
	private double capitalRestantDu;
	private double taux;
	private Date dateDebut;
	private Date dateFin;

	public Pret(double capital, double taux, Date dateDebut) {
		super();
		this.capital = capital;
		this.taux = taux;
		this.dateDebut = dateDebut;
	}

	public Pret(double capital, double taux, Date dateDebut, Date dateFin) {
		super();
		this.capital = capital;
		this.taux = taux;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public Pret(double capital, double capitalRestantDu, double taux, Date dateDebut, Date dateFin) {
		super();
		this.capital = capital;
		this.capitalRestantDu = capitalRestantDu;
		this.taux = taux;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	/**
	 * Getter for capital
	 * 
	 * @return the capital
	 */
	public double getCapital() {
		return capital;
	}

	/**
	 * Setter the capital to set
	 * 
	 * @param capital
	 *            
	 */
	public void setCapital(double capital) {
		this.capital = capital;
	}

	/**
	 * Getter for capitalRestantDu
	 * 
	 * @return the capitalRestantDu
	 */
	public double getCapitalRestantDu() {
		return capitalRestantDu;
	}

	/**
	 * Setter the capitalRestantDu to set
	 * 
	 * @param capitalRestantDu
	 *            
	 */
	public void setCapitalRestantDu(double capitalRestantDu) {
		this.capitalRestantDu = capitalRestantDu;
	}

	/**
	 * Getter for taux
	 * 
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * Setter the taux to set
	 * 
	 * @param taux
	 *            
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/**
	 * Getter for dateDebut
	 * 
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * Setter the dateDebut to set
	 * 
	 * @param dateDebut
	 *            
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Getter for dateFin
	 * 
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * Setter the dateFin to set
	 * 
	 * @param dateFin
	 *           
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

}
