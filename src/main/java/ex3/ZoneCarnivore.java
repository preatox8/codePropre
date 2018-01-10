package ex3;

import java.util.List;

/** Class de la zone : zone carnivore
 * 
 * @author ETY2
 *
 */
public class ZoneCarnivore extends Zone {

	private int coef = 10;
	
	@Override
	public double calculerKgsNourritureParJour() {
		return animaux.size() * coef;
	}
}
