package ex3;

import java.util.List;

/**
 * @author ETY2
 *
 */
public class SavaneAfricaine extends Zone{

	@Override
	public double calculerKgsNourritureParJour(){
		return animaux.size() * 10;
	}
}
