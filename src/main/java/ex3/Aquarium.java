package ex3;

import java.util.List;

/**
 * @author ETY2
 *
 */
public class Aquarium extends Zone{

	@Override
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 0.2;
	}
}
