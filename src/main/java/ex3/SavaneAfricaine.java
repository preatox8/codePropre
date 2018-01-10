package ex3;

import java.util.List;

/** Class de la zone : savane africaine
 * 
 * @author ETY2
 *
 */
public class SavaneAfricaine extends Zone {

	private int coef = 10;
	
	@Override
	public double calculerKgsNourritureParJour() {
		return animaux.size() * coef;
	}
}
