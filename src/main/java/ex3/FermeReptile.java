package ex3;

import java.util.List;

/** Class de la zone : ferme reptile
 * 
 * @author ETY2
 *
 */
public class FermeReptile extends Zone {

	private double coef = 0.1;

	
	@Override
	public double calculerKgsNourritureParJour() {
		return animaux.size() * coef;
	}
}
