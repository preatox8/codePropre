package ex3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZooTest {

	@Test
	public void testZoo() {
		Zoo zoo = new Zoo("Thoiry");
		assertEquals("Thoiry", zoo.getNom());
	}

	@Test
	public void testAddAnimal() {
		Zoo zoo = new Zoo("Thoiry");
		zoo.addAnimal(new Animal("Lion", "MAMMIFERE", "CARNIVORE"));
	}
	
	@Test
	public void testafficherListeAnimaux() {
		Zoo zoo = new Zoo("Thoiry");
		Animal animal = new Animal("zebre", "MAMMIFERE", "CARNIVORE");
		zoo.addAnimal(animal);
		
	}

}
